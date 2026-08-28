package exerciseAfterClass3;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    @Test
    public void testNoDiscount() {
        // 模拟总价 180
        // 这里假设你把计算逻辑提取成了一个独立的方法 calculateFinalPrice(price, amount)
        DiscountCalculator disCalculate = new DiscountCalculator();
        double expected = 180.0;

        double actual = disCalculate.calculateFinalPrice(15,12.0);

        assertEquals(expected, actual, 0.001);

    }

    @Test
    public void testWithDiscount() {

        DiscountCalculator disCalculate = new DiscountCalculator();
        double expected = 1080;

        double actual = disCalculate.calculateFinalPrice(10,120.0);

        assertEquals(expected, actual, 0.001);


    }

    @Test
    public void testBoundaryExact1000() {
        DiscountCalculator disCalculate = new DiscountCalculator();

        double expected = 900;

        double actual = disCalculate.calculateFinalPrice(10,100.0);

        assertEquals(expected,actual,0.001);



    }




}