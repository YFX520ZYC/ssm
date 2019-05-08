package com.qianfeng.ssm.controller;

import com.qianfeng.ssm.entity.Food;
import com.qianfeng.ssm.entity.User;
import com.qianfeng.ssm.service.FoodService;
import com.qianfeng.ssm.service.UserService;
import com.qianfeng.ssm.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@Api(value = "生活模块中的食物收藏列表",tags = "食物收藏列表")
public class FootController {

    @Autowired
    private FoodService foodService;
   @Autowired
   private UserService userService;

    @ApiOperation(value = "收藏展示",notes = "展示所有")
    @GetMapping("food/selectAll.do")
    public JsonBean selectAll(HttpSession session){
        User user = (User)session.getAttribute("user");
        List<Food> list = foodService.findAllfFoot(user.getUid());
        return JsonBean.setOK("展示所有",list);

    }

    @ApiOperation(value = "收藏添加数据",notes = "添加一条数据")
    @GetMapping("food/addOne.do")
    public JsonBean addOneFood(Food food){
        foodService.addOneFoot(food);
        return JsonBean.setOK("添加成功",null);
    }

    @ApiOperation(value = "收藏删除数据",notes = "删除一条数据")
    @GetMapping("food/deleteOne.do")
    public JsonBean deleteOneFood(int id){
        foodService.deleteOneFoot(id);
        return JsonBean.setOK("删除成功",null);
    }

}
