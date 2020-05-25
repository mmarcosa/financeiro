package com.finances.saveme.usecase.impl;

import com.finances.saveme.entity.Deposit;
import com.finances.saveme.gateway.DepositGateway;
import com.finances.saveme.gateway.data.converter.DepositConverter;
import com.finances.saveme.usecase.DepositUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class DepositUseCaseImpl implements DepositUseCase {

    private final DepositGateway depositGateway;

    private final DepositConverter depositConverter;

    @Override
    public void save(Deposit deposit) {
        log.info("Salvando o deposito: " + deposit.toString());
        depositGateway.save(depositConverter.convert(deposit));
    }

}
