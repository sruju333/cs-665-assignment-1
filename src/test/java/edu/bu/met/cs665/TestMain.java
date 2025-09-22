package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Written unit test cases for testing Automated Beverage Vending Machine
 */

public class TestMain {

    // Implemented 3-5 JUnit tests

    @Test
    public void testEspressoPrice(){
        Espresso espresso = new Espresso();
        espresso.addMilk(2);
        espresso.addSugar(1);

        assertEquals(espresso.getBasePrice(), 2.00, 0);
        assertEquals(espresso.getBeveragePrice(),espresso.getBasePrice()+(0.5*3), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxCondimentUnits(){
        GreenTea greenTea = new GreenTea();
        greenTea.addMilk(2);
        greenTea.addMilk(2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSugarUnit(){
        Latte latte = new Latte();
        latte.addSugar(-10);
    }

    @Test
    public void testMaxValidCondiments() {
        Americano americano = new Americano();
        americano.addMilk(3);
        americano.addSugar(3);

        assertEquals(3, americano.getMilkUnit());
        assertEquals(3, americano.getSugarUnit());
        assertEquals(americano.getBasePrice() + (6 * 0.5), americano.getBeveragePrice(), 0.0001);
    }

    @Test
    public void testNoCondimentsPrice() {
        BlackTea blackTea = new BlackTea();
        assertEquals(blackTea.getBasePrice(), blackTea.getBeveragePrice(), 0.0001);
    }

}
