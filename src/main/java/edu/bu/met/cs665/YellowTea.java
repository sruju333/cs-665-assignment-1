package edu.bu.met.cs665;

public class YellowTea extends Tea{

    public YellowTea() {
        super("Yellow Tea", 3.00);
    }

    @Override
    public void brew() {
        System.out.println("Yellow Tea is brewing...");
    }
}
