package com.chengjf.admin;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by jeff on 2017/11/29.
 */
public class Test {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        final String rawPassword = "chengjf";
        String encode = encoder.encode(rawPassword);
        System.out.println(encode);

    }
}
