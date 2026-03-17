package com.corp.accmgnt.account.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "account")
@IdClass(AccountPK.class)
public class Accounts {

    @Id
    @Column(name = "USER_ID")
    String userId;

    @Id
    @Column(name = "ACC_ID")
    String accId;

    @Column(name = "ACC_NO")
    String accNo;

    @Column(name = "TOTAL_BALANCE")
    long totalBalance;

    @Column(name = "CCY")
    String ccy;

}
