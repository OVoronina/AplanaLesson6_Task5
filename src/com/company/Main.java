package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Я четенький калькулятор, умею считать!");
        while(true) {
            System.out.println("Выберите действие: \n\"*\" - умножить" +
                    "\n\"/\"  - делить\n\"-\" - вычесть\n\"+\" - сложить\n\"666\" - чтобы я пошел отдыхать");
            String znak = scanner.nextLine();
            if (znak.equals("666")) break;
            //String musor = scanner.nextLine();
            if (!znak.equals("*") && !znak.equals("/") && !znak.equals("+") && !znak.equals("-")) {
                System.out.println("Могу считывать только это(((((");
                continue;
            }
            System.out.println("Введите первое число:");
            double num1 = scanner.nextDouble();

            System.out.println("Введите второе число:");
            double num2 = scanner.nextDouble();

            System.out.println("Результат вычисления:");
            String musor = scanner.nextLine();

            Znak znak1 = new Znak();
            znak1.method(num1, num2, znak);
        }
    }
}
