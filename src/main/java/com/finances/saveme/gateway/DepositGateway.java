package com.finances.saveme.gateway;

import com.finances.saveme.gateway.data.entity.DepositData;
import org.springframework.stereotype.Component;

@Component
public interface DepositGateway {

    public DepositData save(DepositData deposit);

}
