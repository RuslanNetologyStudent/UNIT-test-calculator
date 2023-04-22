import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.BinaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    @DisplayName("Проверка операции сложения")
    void plus() {
        //вводные данные
        final int x = 12;
        final int y = 5;
        final int expected = 17;
        //операция
        final int result = calc.plus.apply(x, y);
        //результат
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Проверка операции вычитания")
    void minus() {
        //вводные данные
        final int x = 15;
        final int y = 5;
        final int expected = 10;
        //операция
        final int result = calc.minus.apply(x, y);
        //результат
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Проверка операции умножения")
    void multipy() {
        //вводные данные
        final int x = 8;
        final int y = 8;
        final int expected = 64;
        //операция
        final int result = calc.multiply.apply(x, y);
        //результат
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Проверка операции деления")
    void devide() {
        //вводные данные
        final int x = 40;
        final int y = 2;
        final int expected = 20;
        //операция
        final int result = calc.devide.apply(x, y);
        //результат
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Проверка деления на 0")
    void devideByZero() {
        //вводные данные
        final int x = 1;
        final int y = 0;
        //результат
        Assertions.assertThrows(
                ArithmeticException.class,
                () -> calc.devide.apply(x, y)
        );
    }


    @Test
    @DisplayName("Проверка исключения при делении на 0")
    void exceptionDevideByZero() {
        //вводные данные
        final int x = 1;
        final int y = 0;

        //операция
        final  ArithmeticException exception = Assertions.assertThrows(
                ArithmeticException.class,
                () -> calc.devide.apply(x, y)
        );
        //результат
        Assertions.assertEquals("Внимание! На 0 делить нельзя", "Внимание! На 0 делить нельзя");
    }

    @Test
    @DisplayName("Проверка операции возведения числа в квадратную степень")
    void pow() {
        //вводные данные
        Calculator calc = new Calculator();
        final int x = 8;
        final int expected = 64;
        //операция
        final int result = calc.pow.apply(x);
        //результат
        Assertions.assertEquals(expected, result);

    }

    @Test
    @DisplayName("Проверка на положительное число")
    void isPositive() {
        //вводные данные
        Calculator calc = new Calculator();
        final int x = -1;
        final Boolean expected = false;
        //операция
        final Boolean result = calc.isPositive.test(x);
        //результат
        Assertions.assertEquals(expected, result);
    }
}