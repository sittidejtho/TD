package com.example.TD.service;

import com.example.TD.model.Promotion;
import com.example.TD.model.SKU;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PromotionService {

    public BigDecimal calculateDiscount(SKU item, int quantity, Promotion promotion) {
        int maximumNumberOfItemToBeApllied = 0;
        BigDecimal discount = new BigDecimal(0);

        if (promotion.getLimitPerBill()<=-1) {
            maximumNumberOfItemToBeApllied = quantity;
        } else {
            maximumNumberOfItemToBeApllied = (quantity / promotion.getNumberOfItemToBeApplied()) * promotion.getNumberOfItemToBeApplied();
            if (maximumNumberOfItemToBeApllied > promotion.getLimitPerBill() * promotion.getNumberOfItemToBeApplied()) {
                maximumNumberOfItemToBeApllied = promotion.getLimitPerBill() * promotion.getNumberOfItemToBeApplied();
            }
//            No of Item to be applied = (Basket Quantities / Pax) <= Promotion Pack Size
//            if (No of Item to be applied) >= (Limit per Bill x Promotion Pack Size)) {
//                No of Item to be applied = Limit per Bill x Promotion Pack Size
//            }
        }
        discount = promotion.getDiscountPerUnit().multiply(new BigDecimal(maximumNumberOfItemToBeApllied));
        return discount;
    }
}
