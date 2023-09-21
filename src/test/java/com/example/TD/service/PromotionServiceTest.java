package com.example.TD.service;

import com.example.TD.model.Promotion;
import com.example.TD.model.SKU;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PromotionServiceTest {

//    @Mock
    private static PromotionService promotionService;

    @BeforeAll
    public static void prepare() {
        promotionService = new PromotionService();
    }

    @Test
    public void test_calculateDiscount_when_promotionTypeIsSingleItemDiscount() {
        BigDecimal actualDiscount = null;
        BigDecimal expectedDiscount = null;

        SKU sku = new SKU();
        sku.setPrice(new BigDecimal("12"));

        Promotion promotion = new Promotion();
        promotion.setNumberOfItemToBeApplied(2);
        promotion.setDiscountPerUnit(new BigDecimal("2"));
        promotion.setLimitPerBill(-1);

        actualDiscount = promotionService.calculateDiscount(sku, 0, promotion);
        expectedDiscount = new BigDecimal("0");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 1, promotion);
        expectedDiscount = new BigDecimal("2");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 2, promotion);
        expectedDiscount = new BigDecimal("4");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 3, promotion);
        expectedDiscount = new BigDecimal("6");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 4, promotion);
        expectedDiscount = new BigDecimal("8");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 5, promotion);
        expectedDiscount = new BigDecimal("10");
        assertEquals(expectedDiscount, actualDiscount);
    }

    @Test
    public void test_calculateDiscount_when_promotionTypeIsDoubleItemDiscountAndLimitPerBillEqualsToOne() {
        BigDecimal actualDiscount = null;
        BigDecimal expectedDiscount = null;

        SKU sku = new SKU();
        sku.setPrice(new BigDecimal("12"));

        Promotion promotion = new Promotion();
        promotion.setNumberOfItemToBeApplied(2);
        promotion.setDiscountPerUnit(new BigDecimal("2"));
        promotion.setLimitPerBill(1);

        actualDiscount = promotionService.calculateDiscount(sku, 0, promotion);
        expectedDiscount = new BigDecimal("0");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 1, promotion);
        expectedDiscount = new BigDecimal("0");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 2, promotion);
        expectedDiscount = new BigDecimal("4");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 3, promotion);
        expectedDiscount = new BigDecimal("4");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 4, promotion);
        expectedDiscount = new BigDecimal("4");
        assertEquals(expectedDiscount, actualDiscount);
    }

    @Test
    public void test_calculateDiscount_when_promotionTypeIsDoubleItemDiscountAndLimitPerBillEqualsToTwo() {
        BigDecimal actualDiscount = null;
        BigDecimal expectedDiscount = null;

        SKU sku = new SKU();
        sku.setPrice(new BigDecimal("12"));

        Promotion promotion = new Promotion();
        promotion.setNumberOfItemToBeApplied(2);
        promotion.setDiscountPerUnit(new BigDecimal("2"));
        promotion.setLimitPerBill(2);

        actualDiscount = promotionService.calculateDiscount(sku, 0, promotion);
        expectedDiscount = new BigDecimal("0");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 1, promotion);
        expectedDiscount = new BigDecimal("0");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 2, promotion);
        expectedDiscount = new BigDecimal("4");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 3, promotion);
        expectedDiscount = new BigDecimal("4");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 4, promotion);
        expectedDiscount = new BigDecimal("8");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 6, promotion);
        expectedDiscount = new BigDecimal("8");
        assertEquals(expectedDiscount, actualDiscount);
    }

    @Test
    public void test_calculateDiscount_when_promotionTypeIsQuadItemDiscountAndLimitPerBillEqualsToTwo() {
        BigDecimal actualDiscount = null;
        BigDecimal expectedDiscount = null;

        SKU sku = new SKU();
        sku.setPrice(new BigDecimal("12"));

        Promotion promotion = new Promotion();
        promotion.setNumberOfItemToBeApplied(4);
        promotion.setDiscountPerUnit(new BigDecimal("3"));
        promotion.setLimitPerBill(1);

        actualDiscount = promotionService.calculateDiscount(sku, 0, promotion);
        expectedDiscount = new BigDecimal("0");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 1, promotion);
        expectedDiscount = new BigDecimal("0");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 2, promotion);
        expectedDiscount = new BigDecimal("0");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 3, promotion);
        expectedDiscount = new BigDecimal("0");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 4, promotion);
        expectedDiscount = new BigDecimal("12");
        assertEquals(expectedDiscount, actualDiscount);

        actualDiscount = promotionService.calculateDiscount(sku, 6, promotion);
        expectedDiscount = new BigDecimal("12");
        assertEquals(expectedDiscount, actualDiscount);
    }
}
