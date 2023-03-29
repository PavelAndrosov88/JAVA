package lesson1.task;

import java.util.Scanner;

public class Task4 {
    public static void calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1-е число: ");
        double num1 = scanner.nextDouble();
        System.out.println("Введите действие(+, -, *, /): ");
        char op = scanner.next().charAt(0);
        System.out.println("Введите 2-е число: ");
        double num2 = scanner.nextDouble();
        double ans = 0;
        switch (op) {
            case '+' -> ans = num1 + num2;
            case '-' -> ans = num1 - num2;
            case '*' -> ans = num1 * num2;
            case '/' -> ans = num1 / num2;
        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
    }
}
