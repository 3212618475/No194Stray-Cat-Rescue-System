package com.stray.cat.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sponsor {
    private int sponsorId;
    private String sponsorPhone;
    private String sponsorTitle;
    private String sponsorContent;
    private String sponsorReason;
    private int sponsorStatus;
    private Date sponsorCreatetime;
    private String sponsorPicture;
    private int sponsorCount;
}
