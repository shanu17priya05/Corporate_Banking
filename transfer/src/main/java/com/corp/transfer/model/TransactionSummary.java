package com.corp.transfer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionSummary {

    String txnId;
    String fromAcc;
    String toAcc;
    String amount;
    String ccy;
}
