package com.corp.accmgnt.account.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Data
@Entity
@IdClass(AccountPK.class)
public class UserAccount {

    @Id
    @Column(name="USER_ID")
    String userId;

    @Id
    @Column(name="ACCOUNT_ID")
    String accId;

    @Column(name="ACCOUNT_NUMBER")
    String accNumber;
}
