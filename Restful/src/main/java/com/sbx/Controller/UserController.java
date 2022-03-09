package com.sbx.Controller;

import com.sbx.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :sbx
 * @date :2022/3/6 20:16
 * @description :
 * @version: :1.0.0
 */
@Controller
public class UserController {
    /**
     * 使用Restful模拟用户资源的增删改查
     *  /user        GET        查询所有用户信息
     *  /user/1      GET        根据用户id查询用户信息
     *  /user        POST       添加用户信息
     *  /user        PUT        更新用户信息
     *  /user/1      DELETE     根据id删除用户信息
     * */

    @GetMapping("/user")
    public String getAllUser(){
        System.out.println("查询所有用户信息");
        return "success";
    }

    @GetMapping("/user/1")
    public String getUserById(String id){
        System.out.println("根据用户id查询用户信息");
        return "success";
    }

    @PostMapping("/user")
    public String addUserInfo(User user){
        System.out.println("添加用户信息");
        System.out.println(user);
        return "success";
    }

    @PutMapping ("/user")
    public String updateUser(User user){
        System.out.println("更新用户信息");
        System.out.println(user);
        return "success";
    }

}
