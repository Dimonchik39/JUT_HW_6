package org.example;

import java.util.Arrays;
import java.util.List;

import static org.example.AverageNumberList.getAverage;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 43, 66, 25, 4, 67);
        List<Integer> list2 = Arrays.asList(2, 43, 6, 25, 4, 67);

        double avg = getAverage(list);
        double avg2 = getAverage(list2);

        System.out.println(FindMaxNumber.findMaxNum(avg,avg2));
    }
}