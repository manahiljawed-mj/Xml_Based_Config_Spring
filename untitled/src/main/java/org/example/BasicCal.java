package org.example;

public class BasicCal implements Function{

    public BasicCal()
    {
        System.out.println("BasicCal()");
    }
    public void compile()
    {
        System.out.println("Hello from basic calculator");
    }
    public int addSubtract(int a,int b)
    {
        int i=a+b;
        int j=a-b;
        return i+j;
    }
}
