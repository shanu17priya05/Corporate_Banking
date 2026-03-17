package com.corp.transfer.controller;


import com.corp.transfer.model.TransactionSummary;
import com.corp.transfer.repository.DOMTransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ft")
public class FundTransfer {

    @Autowired
    DOMTransferRepository domRepo;

    @Autowired
    TransactionSummary txnSummary;

    @PostMapping("/dom/{userId}/{fromAcc}/{toAcc}/{ccy}/{amount}")
    ResponseEntity<TransactionSummary> createDomTransfer(@PathVariable("userId") String userId,@PathVariable("fromAcc") String fromAcc,@PathVariable("toAcc") String toAcc, @PathVariable("ccy") String ccy, @PathVariable("amount") long amount)
    {
        //Check if loggedin user is authorized for accessing the from account. //Call Account check from userMappingtable and also check maker checker permission
        //CallFromAccount to validate the balance, if balance is not available throw error
        //else all above condition is passed then save the data to db and send amount deduction request to the account service
        //Also write to the outbox table.





        return new ResponseEntity<>(txnSummary,HttpStatus.OK);
    }
}
