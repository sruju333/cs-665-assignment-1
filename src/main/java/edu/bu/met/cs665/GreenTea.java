package edu.bu.met.cs665;

public class GreenTea extends Tea{

    public GreenTea() {
        super("Green Tea", 3.00);
    }

    @Override
    public void brew(){
        System.out.println("Green Tea is brewing...");
    }
}
