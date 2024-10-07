package com.stray.cat.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Enclosure { //附件表

    private int enclosureId;
    private int enclosureType;  //类型
    private String enclosureUrl;
    private Date enclosureCreatetime;
    private String enclosureNumber;
    private String enclosureSmallUrl;
    private String enclosureWh;

}
