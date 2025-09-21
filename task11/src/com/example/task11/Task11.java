package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {

        // Вычисляем итоговую сумму по формуле сложных процентов
        // A = P * (1 + r)^n
        // где A - итоговая сумма, P - начальная сумма, r - процентная ставка, n - количество периодов

        // В нашем случае n = 12 (12 месяцев)
        return (float) (sum * Math.pow((double)1.0f + percent, 12));
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
