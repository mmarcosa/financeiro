package com.finances.saveme.entity;


import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Deposit {

    private Date depositDate;
    private double value;
    private String description;

}
