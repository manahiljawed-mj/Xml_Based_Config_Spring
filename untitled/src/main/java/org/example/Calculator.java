package org.example;

import java.beans.ConstructorProperties;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
public class Calculator {
//    @Autowired
//    Advance_Calculator adv;
     Function fun;
     private int first;

    public Calculator() {

        System.out.println("Calculator Object Created");
    }

    public Function getFun() {
        return fun;
    }

    public void setFun(Function fun) {
        this.fun = fun;
    }

    public void display()
    {
        fun.compile();
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        System.out.println("Setting First");
        this.first = first;
    }

    public int add(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }
    public int subtract(int a, int b) {
        System.out.println(a - b);
        return a - b;
    }
    public int multiply(int a, int b) {

        System.out.println(a * b);
        return a * b;
    }
    public int divide(int a, int b) {
        System.out.println(a / b);
        return a / b;
    }
//    public int advance(int a, int b) {
//        adv.addSubtract(a,b);
//        return adv.addSubtract(a,b);
//    }
}
