package com.chenwt.controller;

import com.chenwt.entity.User;
import com.chenwt.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by feini on 2017/6/16.
 */
@Controller
public class UserController extends BaseController {

    @Resource(name = "UserService")
    private UserService userService;

    @RequestMapping("/use")
    public String use(){
        return "use";
    }

    @RequestMapping("/find")
    @ResponseBody
    public Map<String,Object> find(User user, HttpServletRequest request){

        Map<String,Object> map = new HashMap<String,Object>();
        System.out.println("你已通过springMVC进入controller方法。。。。");
        logger.info("你已通过springMVC进入controller方法。。。。");
        User loginuser = userService.findByUsernameAndPwd(user.getUserName(),user.getPassWord());
        if(loginuser != null){
            map.put("result","success");
        }else {
            map.put("result","fail");
        }
        return map;
    }

    @RequestMapping("/success")
    public String success(){
        System.out.println("登录成功。。。。");
        logger.info("登录成功。。。。");

        return "success";
    }


}
