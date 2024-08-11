package Coding_Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GreatestCandy {

    public static void main(String[] args) {
        int[] candies= {2,4,5 ,6,6,7,3};
        int extraCandies =3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }


        public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {


            List<Boolean> willBeGreatest= new ArrayList<Boolean>();
            System.out.println(willBeGreatest);


            for (int i = 0; i <willBeGreatest.size() ; i++) {


            }

            for ( int i = 0 ; i< candies.length ; i++){
                candies[i]= candies[i] + extraCandies;
                for (int u=0 ; u< candies.length ; u++){
                    if (i != u ){
                        if (candies[i] < candies[u]) {
                            try {
                                willBeGreatest.add(false);
                            } catch (Exception e) {
                                willBeGreatest.set(i,false);
                            }

                        } else {
                            try {
                                willBeGreatest.add(true);
                            } catch (Exception e) {
                                willBeGreatest.set(i,true);
                            }

                            break;
                        }
                    }


                }
            }

            return willBeGreatest;
        }

}
