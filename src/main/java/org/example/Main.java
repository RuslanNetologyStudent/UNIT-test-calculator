package org.example;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        // предупреждение - деление на 0,
        // решение - исключение ArithmeticException

        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Предупреждение! На 0 делить нельзя!");
        }
    }
}