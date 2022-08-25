package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKElements {

    public static void main(String[] args) {
        int[] nums = {5,5,6,7,7,7,8,9};
        System.out.println(findTopKFrequentElements(nums, 2));
    }

    private static List<Integer> findTopKFrequentElements(int[] num, int k){

        return Arrays.stream(num)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> (int)(e2.getValue() - e1.getValue()))
                .limit(k)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
    }



}
