package com.corp.accmgnt.account.service;

import com.corp.accmgnt.account.entity.Accounts;
import com.corp.accmgnt.account.entity.UserAccount;
import com.corp.accmgnt.account.repository.AccountListRepository;
import com.corp.accmgnt.account.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountListRepository accListRepo;

    @Autowired
    private UserAccountRepository userAccountRepository;

    public List<Accounts> getAccountsByUserId(String userId) {
        return accListRepo.findByUserId(userId);
    }

    public void saveUserAcc(String userId,String accId,String accNumber)
    {
        UserAccount userAcc=new UserAccount();
        userAcc.setUserId(userId);
        userAcc.setAccNumber(accNumber);
        userAcc.setAccId(accId);
        userAccountRepository.save(userAcc);
    }

    public void saveAccount(String userId,String accId,String accNumber,String ccy,long amount)
    {
        Accounts accounts=new Accounts();
        accounts.setUserId(userId);
        accounts.setAccNo(accNumber);
        accounts.setAccId(accId);
        accounts.setTotalBalance(amount);
        accounts.setCcy(ccy);
        accListRepo.save(accounts);
    }

}
