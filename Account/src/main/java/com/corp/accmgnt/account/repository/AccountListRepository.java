package com.corp.accmgnt.account.repository;

import com.corp.accmgnt.account.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountListRepository extends JpaRepository<Accounts,String> {


    List<Accounts> findByUserId(String userId);
}
