package com.stray.cat.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notice {

    private int noticeId;
    private Date noticeCreatetime;
    private String noticeContent;

}
