package Coding_Questions;

public class MinMaxNumberArray {
    public static void main(String[] args) {
        int[] array= new int[]{1,2,3,4,5,6,7,8,9,10};

        System.out.println("Max value : "+ max(array)+ "\nMin value : "+min(array));


    }

    public static int min(int[] arr){

        int min=0;
        for (int number :arr) {
            if (min==0) min=number;
            if (number<min) min=number;

        }
        return min;
    }

    public static int max(int[] arr){
        int max=0;
        for (int number :arr) {
            if (max==0) max=number;
            if (number>max) max=number;

        }
        return max;
    }
}
