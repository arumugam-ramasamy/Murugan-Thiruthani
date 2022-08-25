package com.evolutionary.sb.sbdatabase.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BankAccountInfo {

    private Long id;
    private String fullName;
    private double balance;
}
