package com.example.TD.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "promotions")
public class Promotion {

    @Id
    private String promotionCode;
    private String promotionType;
    private int numberOfItemToBeApplied;
    private String barcode;
    private BigDecimal discountPerUnit;
    private int limitPerBill;

}
