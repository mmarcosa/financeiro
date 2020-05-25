package com.finances.saveme.gateway.data.repository;

import com.finances.saveme.gateway.data.entity.DepositData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositRepository extends JpaRepository<DepositData, Integer> {

}
