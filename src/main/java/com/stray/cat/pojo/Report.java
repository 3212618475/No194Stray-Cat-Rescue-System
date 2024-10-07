package com.stray.cat.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Report {
     private int reportId;
     private String reportUser;
     private String reportContent;
     private String reportFrom;
     private int reportFromId;
     private Date reportCreatetime;
}
