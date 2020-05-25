package com.finances.saveme.gateway.impl;

import com.finances.saveme.gateway.DepositGateway;
import com.finances.saveme.gateway.data.entity.DepositData;
import com.finances.saveme.gateway.data.repository.DepositRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DepositGatewayImpl implements DepositGateway {

    private final DepositRepository repository;

    @Override
    public DepositData save(DepositData deposit) {
        repository.save(deposit);
        return deposit;
    }

}
