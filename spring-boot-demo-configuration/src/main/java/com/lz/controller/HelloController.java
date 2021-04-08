package com.lz.controller;

import com.lz.bean.Food;
import com.lz.config.FoodConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LY
 */
@RestController
public class HelloController {

    @Autowired
   private FoodConfig foodConfig;


    @RequestMapping("/json")
    private Food json(){
        Food food=new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        return food;
    }
}
