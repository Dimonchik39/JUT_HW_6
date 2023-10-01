package org.example;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class AverageNumberList {
    public static double getAverage(List<Integer> list) {
        IntSummaryStatistics stats = list.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        return stats.getAverage();
    }
}
