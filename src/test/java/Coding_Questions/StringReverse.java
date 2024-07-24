package Coding_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("Type a word");
        String str= scan.nextLine();
        System.out.println("Reversed : "+ strrevers(str));

    }
    public static String strrevers (String str){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length() ; i++) {
            String strr= String.valueOf(str.charAt(i));
            list.add(strr);
        }

        String str2= "";
        for (int i = list.size()-1; 0 <= i; i--) {
           // str2.(list.get(i).toString());
            str2=str2+list.get(i).toString();
        }

      return str2;
    }
}
