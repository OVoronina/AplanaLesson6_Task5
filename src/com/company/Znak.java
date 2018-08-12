package com.company;

public class Znak {
    public void method(double num1, double num2, String znak){
        if (znak.equals("+"))
        {
            Sum sum = new Sum(num1,num2);
            sum.culc();
        }
        else if (znak.equals("-"))
        {
            Sub sub = new Sub(num1, num2);
            sub.culc();
        }
        else if (znak.equals("*"))
        {
            Multi multi = new Multi(num1,num2);
            multi.culc();
        }
        else {
            Div div = new Div(num1,num2);
            div.culc();
        }
    }
}
