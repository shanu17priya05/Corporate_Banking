package com.corp.accmgnt.account.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class AccountPK implements Serializable {
    private String userId;
    private String accId;
}
