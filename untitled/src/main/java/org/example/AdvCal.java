package org.example;

public class AdvCal implements Function {

    public AdvCal()
    {
        System.out.println("AdvCal()");
    }
    public void compile()
    {
        System.out.println("Hello from adv calculator");
    }
    public int addSubtract(int a,int b)
    {
        int i=a+b;
        int j=a-b;
        return i+j;
    }
}
