package com.finances.saveme.controller;

import com.finances.saveme.entity.Deposit;
import com.finances.saveme.gateway.DepositGateway;
import com.finances.saveme.usecase.DepositUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController(value = "/deposits")
@RequiredArgsConstructor
public class DepositController {

    private final DepositGateway depositGateway;

    private final DepositUseCase depositUseCase;

    @PostMapping
    public ResponseEntity<Deposit> save(@RequestBody Deposit deposit){
        depositUseCase.save(deposit);
        return new ResponseEntity<>(deposit, HttpStatus.CREATED);
    }


}
