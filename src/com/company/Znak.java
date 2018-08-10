package com.company;

public class Znak {
    static void methodZnak(double num1, double num2, String znak){
        if (znak.equals("+")) Sum.culc(num1, num2);
        else if (znak.equals("-")) Sub.culc(num1, num2);
        else if (znak.equals("*")) Multi.culc(num1, num2);
        else (znak.equals("/")) Div.culc(num1, num2);
    }
}
