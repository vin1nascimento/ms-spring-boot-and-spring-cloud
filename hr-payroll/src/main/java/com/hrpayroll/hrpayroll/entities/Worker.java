package com.hrpayroll.hrpayroll.entities;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Worker {

    private int id;
    private String name;
    private BigDecimal dailyIncome;
}
