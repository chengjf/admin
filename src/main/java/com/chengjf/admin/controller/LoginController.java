package com.chengjf.admin.controller;

import com.chengjf.admin.base.FrameResp;
import com.chengjf.admin.component.user.User;
import com.chengjf.admin.security.AuthService;
import com.google.common.collect.Maps;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/user")
@Slf4j
public class LoginController {

    @Autowired
    private AuthService authService;

    @RequestMapping("/login")
    public FrameResp login(@NonNull @RequestBody User user) {

        log.info("login user:{}", user);
        if ("admin".equals(user.getUsername())) {
            log.info("login succeed user:{}", user);
            final String token = authService.login(user.getUsername(), user.getPassword());

            Map<String, Object> map = Maps.newHashMap();
            map.put("name", "成建锋");
            map.put("avatar", "https://avatars0.githubusercontent.com/u/16893554?v=3&s=240");
            map.put("age", 20);
            map.put("desc", "管理员就是我");
            map.put("token", token);
            log.info("login succeed user:{}", map);
            return FrameResp.builder().code(0).msg("登录成功").data(map).build();
        } else {
            log.info("login failed user:{}", user);
            return FrameResp.builder().code(1).msg("账号或密码错误").build();
        }
    }
}
