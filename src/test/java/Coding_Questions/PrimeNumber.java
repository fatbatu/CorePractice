package Coding_Questions;

public class PrimeNumber {
    public static void main(String[] args) {

        int number= 12;
        System.out.println(isPrime(number));

    }
    public static boolean isPrime(int number){


        int sayac=0;
        for (int i = number-1 ; 1 < i ; i--) {
            if (number%i==0){
                sayac++;
                System.out.println(i);
            break;}


        }

        if (sayac==0){return true;}
        else return false;

    }
}
