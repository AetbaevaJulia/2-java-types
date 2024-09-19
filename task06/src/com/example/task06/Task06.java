package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        int res;
        if (sum >= 0){
            res = String.valueOf(sum).length();
        }
        else{
            String str = String.valueOf(sum);
            res = str.substring(1 ).length();
        }
        return res;
    }

    public static void main(String[] args) {
        //Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int result = solution(-111, -222);
        System.out.println(result);
    }

}
