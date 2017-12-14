package com.chengjf.admin.controller;

import com.chengjf.admin.component.user.User;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by jeff on 2017/11/29.
 */
@RestController
@RequestMapping("/users")
@PreAuthorize("hasRole('ADMIN')")
@Slf4j
public class UserController {

    @GetMapping
    private List<User> getUsers() {
        User user = User.builder().id("1").username("1").password("1").email("1@2.com").lastPasswordResetDate(new Date()).roles(
                Lists.newArrayList("root")
        ).build();
        log.info("getUsers {}", user);
        return Lists.newArrayList(user);
    }

    // 略去其它部分
}
