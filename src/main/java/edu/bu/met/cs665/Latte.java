package edu.bu.met.cs665;

public class Latte extends Coffee{

    public Latte() {
        super("Latte", 2.00);
    }

    @Override
    public void brew() {
        System.out.println("Latte is brewing...");
    }
}
