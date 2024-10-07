package com.stray.cat.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sentence {
    private int sentenceId;
    private String sentenceC;
    private String sentenceE;
    private String sentenceZ;
    private String sentenceDate;
}
