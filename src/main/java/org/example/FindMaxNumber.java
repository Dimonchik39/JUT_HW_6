package org.example;

public class FindMaxNumber {
    public static String findMaxNum(double num, double num2) {
        String result = "";
        if (num > num2) {
            result = ("Первый список имеет большее среднее значение: " + num);
        } else if (num < num2) {
            result = ("Второй список имеет большее среднее значение: " + num2);
        } else {
            result = ("Среднее значение списков равны: " + num);
        }
        return result;
    }
}
