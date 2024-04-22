package com.github.williamdlm.hrpayroll.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Payment implements Serializable {
private String name;
private Double dailyIncome;
private Integer days;

public double getTotal(){
    return days * dailyIncome;
}
}
