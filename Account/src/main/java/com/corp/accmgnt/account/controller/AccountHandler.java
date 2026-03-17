package com.corp.accmgnt.account.controller;

import com.corp.accmgnt.account.model.AccountDetails;
import com.corp.accmgnt.account.service.AccountService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Log4j2
@RestController
@RequestMapping("/account")
public class AccountHandler {

    @Autowired
    AccountService accountService;

    @GetMapping("/{userId}")
    ResponseEntity<List<AccountDetails>> getFromAccount(@PathVariable("userId") String userId)
    {
        List<AccountDetails> accounts=getAccountList(userId);
        if (accounts.isEmpty()) {
            log.info("No accounts found for userId: {}", userId);
        }
         return ResponseEntity.ok(accounts);
    }

    private List<AccountDetails> getAccountList(String userId) {

        List acc=new ArrayList();
        acc=accountService.getAccountsByUserId(userId);
        return acc;
    }

    @PostMapping("/{accNo}/{userId}/{accId}")
    ResponseEntity<HttpStatus> getFromAccount(@PathVariable("accNo") String accNumber, @PathVariable("userId") String userId, @PathVariable("accId") String accId)
    {
         accountService.saveUserAcc(userId,accId,accNumber);
         return new ResponseEntity<>(HttpStatus.OK);
    }

    /*@GetMapping("/toAccount/{accNo}")
    ResponseEntity<AccountDetails> getFromAccount(@PathVariable("accNo") String accNumber)
    {


    }*/

    @GetMapping("/{accNo}/{userId}/{accId}/{ccy}/{amount}")
    ResponseEntity<HttpStatus> saveAccount(@PathVariable("accNo") String accNumber, @PathVariable("userId") String userId, @PathVariable("accId") String accId,@PathVariable("ccy") String ccy, @PathVariable("amount") long amount)
    {
        accountService.saveAccount(userId,accId,accNumber,ccy,amount);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
