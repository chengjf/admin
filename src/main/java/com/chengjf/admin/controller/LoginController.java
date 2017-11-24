package com.chengjf.admin.controller;

import com.chengjf.admin.base.FrameResp;
import com.chengjf.admin.component.user.model.User;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/api/user")
@Slf4j
public class LoginController {

    @RequestMapping("/login")
    public FrameResp login(@RequestBody User user) {
////成功
//        export const success = 0
////错误
//        export const error = 1
////未登录
//        export const unlogin = 2
        log.info("login user", user);
        //code: port_code.success,
//        msg: "登录成功",
//        data: {
//            'name': '@cname',
//                    'avatar': 'https://avatars0.githubusercontent.com/u/16893554?v=3&s=240',
//                    'age|20-25': 20,
//                    'desc': '@csentence()'
//        }
        if (user.getUsername().equals("admin") && user.getPassword().equals("123456")) {

            Map<String, Object> map = Maps.newHashMap();
            map.put("name", "成建锋");
            map.put("avatar", "https://avatars0.githubusercontent.com/u/16893554?v=3&s=240");
            map.put("age", 20);
            map.put("desc", "管理员就是我");
            return FrameResp.builder().code(0).msg("登录成功").data(map).build();
        } else {
            return FrameResp.builder().code(1).msg("账号或密码错误").build();
        }
    }
}
