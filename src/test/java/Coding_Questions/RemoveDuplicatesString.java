package Coding_Questions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesString {
    public static void main(String[] args) {
        String string ="context";
        System.out.println(removeDuplicate(string));

    }

    public static String removeDuplicate(String str){

        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();


        for (char ch : str.toCharArray()) {

            if (seen.add(ch)) {
                result.append(ch);
            }
        }


        return result.toString();
    }
}
