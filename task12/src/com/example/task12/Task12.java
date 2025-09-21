package com.example.task12;

import java.math.BigDecimal;


public class Task12 {

    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {

        // TODO раскомментируйте и исправьте код
        BigDecimal one = new BigDecimal("1.0");
        int scale = 9;

        // Применяем формулу сложных процентов: A = P * (1 + r)^n
        // где n = 12 месяцев.

        // Вычисляем (1 + r)
        BigDecimal factor = one.add(percent);

        // Вычисляем (1 + r)^12 с помощью метода pow
        BigDecimal totalFactor = factor.pow(12);

        // Умножаем начальную сумму на общий множитель и округляем результат.
        // Используем константу округления напрямую, без переменной.
        return sum.multiply(totalFactor).setScale(scale, BigDecimal.ROUND_HALF_UP);
    }

    public static void main(String[] args) {

        BigDecimal sum = new BigDecimal(500).setScale(9, BigDecimal.ROUND_HALF_UP); // 500 руб. на счете
        BigDecimal percent = new BigDecimal(0.00000001f).setScale(9, BigDecimal.ROUND_HALF_UP); // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
