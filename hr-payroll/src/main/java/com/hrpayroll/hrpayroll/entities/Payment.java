package com.hrpayroll.hrpayroll.entities;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private String name;
    private BigDecimal dailyIncome;
    private int days;

    public BigDecimal getTotal() {
        return BigDecimal.valueOf( days ).multiply( dailyIncome );
    }

}
