package com.example.db_proj2_test1.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Data
public class Bill {
    @Id
    private String center;
    private String total_purchase_money;
    private String profits;
    private String total_profits;

}
