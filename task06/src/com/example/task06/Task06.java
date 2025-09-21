package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int z = x + y;
        if (z<0)
            z = String.valueOf(z).length()-1;
        else
            z = String.valueOf(z).length();
        return z;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(1225, 8775);
        System.out.println(result);

    }

}
