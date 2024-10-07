package com.stray.cat.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User { //用户表
    private int userId;
    private String userNickname;
    private String userPhone;
    private String userPassword;
    private String userQq;
    private String userWechat;
    private Date userCreatetime;
    private int userCount;
    private String userUrl;
}
