package com.company;

public class Sum{
    double a, b;


    public Sum(double num1, double num2) {
        this.a = num1;
        this.b = num2;
    }
    public double qaz(){
        return a + b ;
    }

    public void culc() {
        System.out.println(qaz());
    }
}


