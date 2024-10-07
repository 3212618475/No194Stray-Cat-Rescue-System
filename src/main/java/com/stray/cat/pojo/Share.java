package com.stray.cat.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Share {  //猫猫分享表
    private int shareId;
    private String sharePhone;
    private String shareTitle;
    private String shareContent;
    private Date shareCreatetime;
    private int shareCount;
    private String shareUrl;
    private int sponsorStatus;
}
