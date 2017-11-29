package com.chengjf.admin.security;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by jeff on 2017/11/29.
 */
@Data
@Builder
public class User {

    private String id;

    private String username;

    private String password;
    private String email;
    private Date lastPasswordResetDate;
    private List<String> roles;
}
