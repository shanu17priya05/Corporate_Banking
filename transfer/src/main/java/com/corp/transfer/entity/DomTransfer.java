package com.corp.transfer.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DomTransfer {

    @Id
    String id;

    @Column(name="USER_ID")
    String userid;

    @Column(name="STATUS")
    String status;

    @Column(name="FROM_ACC")
    String fromAcc;

    @Column(name="TO_ACC")
    String toAcc;

    @Column(name="FROM_CCY")
    String fromCcy;

    @Column(name="TO_CCY")
    String toCcy;

    @Column(name="AMOUNT")
    String amount;

    @Column(name="REASON")
    String reason;

    @Column(name="AUTH_LEVEL")
    String authLevel;

    @Column(name="APPROVED_BY")
    String approvedBy;
}
