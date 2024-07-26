package Coding_Questions;

import java.util.ArrayList;
import java.util.List;

public class TwoStringAnagram {
    public static void main(String[] args) {
        String string1= "";
        String string2= "";
        System.out.println(twostringanagram(string1,string2));
    }


    public static boolean twostringanagram(String s, String ss){


        boolean result;

        String[] list1= list1= s.split("");
        String[] list2= list1= s.split("");

        for (int i = 0; i <list1.length ; i++) {
            if (ss.contains(list1(i)))
                    }

        return result;
    }
}
