package edu.bu.met.cs665;

public class Macchiato extends Coffee{

    public Macchiato() {
        super("Macchiato", 2.00);
    }

    @Override
    public void brew() {
        System.out.println("Macchiato is brewing...");
    }
}
