package edu.bu.met.cs665;

public class BlackTea extends Tea {

    public BlackTea() {
        super("Black Tea", 3.00);
    }

    @Override
    public void brew() {
        System.out.println("Black Tea is brewing...");
    }
}
