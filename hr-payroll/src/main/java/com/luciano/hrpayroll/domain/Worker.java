package com.luciano.hrpayroll.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Worker implements Serializable {

    private Long id;
    private String name;
    private Double dailyIncome;
}
