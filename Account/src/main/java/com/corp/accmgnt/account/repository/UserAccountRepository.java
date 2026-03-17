package com.corp.accmgnt.account.repository;

import com.corp.accmgnt.account.entity.AccountPK;
import com.corp.accmgnt.account.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, AccountPK> {
}
