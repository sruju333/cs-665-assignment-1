package edu.bu.met.cs665;

public class Americano extends Coffee{

    public Americano() {
        super("Americano", 2.00);
    }

    @Override
    public void brew() {
        System.out.println("Americano is brewing...");
    }
}
