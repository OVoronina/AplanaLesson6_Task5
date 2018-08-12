package com.company;

public class Multi extends Sum{
    public Multi(double num1, double num2) {
        super(num1, num2);
    }
    public double qaz(){
        return a * b ;
    }

    @Override
    public void culc() {
        //double x = a*b;
        super.culc();
    }
}
