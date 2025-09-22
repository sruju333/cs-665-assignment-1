package edu.bu.met.cs665;

public class Espresso extends Coffee{

    public Espresso() {
        super("Espresso", 2.00);
    }

    @Override
    public void brew() {
        System.out.println("Espresso is brewing...");
    }
}
