package com.bankApp;

import java.util.Arrays;
import java.util.List;

public class SumOfEven {
    public static void main(String[] args){
        //TODO Auto-generated method stub

        //Convert array to List
        List<Integer> numbers = Arrays.asList(36,45,24,64,78,99,75,47,18);

        System.out.println("Sum of even numbers : ");

        //Use stream and lambda expression to filter and reduce sum of even numbers to print
        System.out.println(
                numbers.stream()
                        .filter(e->e%2==0)
                        .reduce(0,Integer::sum));
    }
}
