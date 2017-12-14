package com.chengjf.admin.component.user;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

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
    private String token;
    private List<String> roles;
}
