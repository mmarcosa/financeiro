package com.finances.saveme.gateway.data.converter;

import com.finances.saveme.entity.Deposit;
import com.finances.saveme.gateway.data.entity.DepositData;
import org.springframework.stereotype.Component;

@Component
public class DepositConverter {

    public DepositData convert(Deposit deposit){
        DepositData depositData = new DepositData();
        depositData.setDepositDate(deposit.getDepositDate());
        depositData.setDescription(deposit.getDescription());
        depositData.setValue(deposit.getValue());
        return depositData;
    }


}
