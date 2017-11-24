package com.chengjf.admin.base;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FrameResp {
    private Object data;
    private int code;
    private String msg;
    private long time = System.currentTimeMillis();
}