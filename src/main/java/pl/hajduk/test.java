package pl.hajduk;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class test {
    public static void main(String[] args) {
        System.out.println(binaryAddition(1,1));

    }

    public static String binaryAddition(int a, int b){
        //your code here
        return Integer.toBinaryString(a+b);
    }
}
