package com.finances.saveme.gateway.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DepositData {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "date")
    private Date depositDate;

    @Column(name = "value")
    private double value;

    @Column(name = "description")
    private String description;

}
