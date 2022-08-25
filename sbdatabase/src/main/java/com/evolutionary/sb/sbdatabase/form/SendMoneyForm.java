package com.evolutionary.sb.sbdatabase.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SendMoneyForm {

    private Long fromAccountId;
    private Long toAccountId;
    private Double amount;


}
