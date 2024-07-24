package Coding_Questions;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        List<Integer> fibonacci= new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);
        fibonacci.add(2);

        int number= 5;
        for (int i = 1; i < number; i++) {
            fibonacci.add(fibonacci.get(i)+fibonacci.get(i+1));
        }
        System.out.println(fibonacci);
    }
}
