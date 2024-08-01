package Coding_Questions;

public class IncreasingNumbersTotal {
    public static void main(String[] args) {
        int number= 20;
        System.out.println(sum(number));


    }

    public static int sum(int in){

        int sum= 0;

        for (int i = 1; i <in+1 ; i++) {
            sum= sum+i;

        }

        return sum;

    }

}
