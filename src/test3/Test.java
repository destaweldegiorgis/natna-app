package test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("bags","baggage","banner","box","cloths");

        searchMatch(list, "b").forEach(word -> System.out.print(word + " "));

        System.out.println();
        searchMatch(list, "ba").forEach(word -> System.out.print(word + " "));

        System.out.println();
        searchMatch(list, "bag").forEach(word -> System.out.print(word + " "));
        System.out.println();
        searchMatch(list, "bags").forEach(word -> System.out.print(word + " "));

        /*
        System.out.println();
        searchMatch(list, "havana").forEach(word -> System.out.print(word + " "));*/



    }

    private static List<String> searchMatch(List<String> input, String searchWord) {

        return input.stream()
                .sorted()
                .filter(word-> word.startsWith(searchWord))
                .limit(3)
                .collect(Collectors.toList());
    }
    /*Example 1:

    Input: products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
    Output: [
            ["mobile","moneypot","monitor"],
            ["mobile","moneypot","monitor"],
            ["mouse","mousepad"],
            ["mouse","mousepad"],
            ["mouse","mousepad"]
            ]

    After typing m and mo all products match and we show user ["mobile","moneypot","monitor"]
    After typing mou, mous and mouse the system suggests ["mouse","mousepad"]

    Example 2:
    Input: products = ["havana"], searchWord = "havana"
    Output: [
            ["havana"],
            ["havana"],
            ["havana"],
            ["havana"],
            ["havana"],
            ["havana"]
            ]

    Example 3:
    Input: products = ["bags","baggage","banner","box","cloths"], searchWord = "bags"
    Output: [
            ["baggage","bags","banner"],
            ["baggage","bags","banner"],
            ["baggage","bags"],
            ["bags"]
            ]*/
}
