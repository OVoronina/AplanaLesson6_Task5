package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Введите первое число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        int num1 = Integer.parseInt(number1);
        System.out.println("Выбрать действие (+ - * /)");
        String znak = reader.readLine();
        String number2 = reader.readLine();
        int num2 = Integer.parseInt(number2);
        System.out.println("Результат вычисления:");
        Znak znak = new Znak(num1, znak, num2);
        znak.methodZnak();
    }
}
