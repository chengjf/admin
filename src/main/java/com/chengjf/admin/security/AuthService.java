package com.chengjf.admin.security;

import com.chengjf.admin.component.user.User;

/**
 * Created by jeff on 2017/11/29.
 */
public interface AuthService {
    User register(User userToAdd);

    String login(String username, String password);

    String refresh(String oldToken);
}