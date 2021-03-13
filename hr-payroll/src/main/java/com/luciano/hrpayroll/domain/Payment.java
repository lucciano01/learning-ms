package com.luciano.hrpayroll.domain;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class Payment implements Serializable {

    private String name;
    private Double dailyIncome;
    private Integer days;

   public Double getTotal(){
       return days * dailyIncome;
   }
}
