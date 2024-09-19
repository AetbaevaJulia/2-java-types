package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String num = String.valueOf(x);
        String evenNums = "02468";
        boolean flag = true;
        for (int i = 0; i < num.length(); i++) {
            char e = num.charAt(i);
            if (evenNums.indexOf(e) == -1)
                flag = false;
        }
        if (flag) {
            return "TRUE";
        }
        return "FALSE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
