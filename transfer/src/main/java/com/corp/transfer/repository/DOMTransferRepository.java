package com.corp.transfer.repository;

import com.corp.transfer.entity.DomTransfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DOMTransferRepository extends JpaRepository<DomTransfer,String> {

}
