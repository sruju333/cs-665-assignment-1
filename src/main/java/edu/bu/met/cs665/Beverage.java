package edu.bu.met.cs665;

public abstract class Beverage implements Condiment{

    private static final int MAX_MILK_UNIT = 3;
    private static final int MAX_SUGAR_UNIT = 3;

    private String beverageName;
    private double basePrice;
    private int milkUnit;
    private int sugarUnit;

    Beverage(String beverageName, double basePrice) {
        this.beverageName = beverageName;
        this.basePrice = basePrice;
        this.milkUnit = 0;
        this.sugarUnit = 0;
    }

    // Encapsulation
    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getBeverageName() {
        return beverageName;
    }

    public void setBeverageName(String beverageName) {
        this.beverageName = beverageName;
    }

    public int getMilkUnit() {
        return milkUnit;
    }

    public void setMilkUnit(int milkUnit) {
        this.milkUnit = milkUnit;
    }

    public int getSugarUnit() {
        return sugarUnit;
    }

    public void setSugarUnit(int sugarUnit) {
        this.sugarUnit = sugarUnit;
    }

    // Condiments limit = 3 units, total = 6 units
    @Override
    public void addMilk(int milkUnits) {
        if (milkUnits < 0) {
            throw new IllegalArgumentException("Milk units cannot be negative.");
        }
        if (this.milkUnit + milkUnits > MAX_MILK_UNIT) {
            throw new IllegalArgumentException("Cannot exceed " + MAX_MILK_UNIT + " units of milk.");
        }
        this.milkUnit += milkUnits;
    }

    @Override
    public void addSugar(int sugarUnits) {
        if (sugarUnits < 0) {
            throw new IllegalArgumentException("Sugar units cannot be negative.");
        }
        if (this.sugarUnit + sugarUnits > MAX_SUGAR_UNIT) {
            throw new IllegalArgumentException("Cannot exceed " + MAX_SUGAR_UNIT + " units of sugar.");
        }
        this.sugarUnit += sugarUnits;
    }

    // Calculate beverage price
    public double getBeveragePrice(){
        double condimentPrice = (milkUnit + sugarUnit) * 0.50;
        return this.basePrice + condimentPrice;
    }

    public abstract void brew();

}
