package com.example.TD.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "skus")
@Data
public class SKU {

    @Id
    private String barcode;
    private String productName;
    private BigDecimal price;

}
