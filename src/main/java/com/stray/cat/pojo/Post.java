package com.stray.cat.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {  //流浪猫启示表

    private int postId;
    private String postTitle;
    private String postPhone;
    private String postContent;
    private Date postCreatetime;
    private int postCount;
    private String postUrl;
}
