package com.chengjf.admin.security;

import java.io.Serializable;

/**
 * Created by jeff on 2017/11/29.
 */
public class JwtAuthenticationResponse implements Serializable {
    private static final long serialVersionUID = 1250166508152483573L;

    private final String token;

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}