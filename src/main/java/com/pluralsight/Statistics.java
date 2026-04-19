package com.pluralsight;
import java.lang.Math;

import static java.lang.Math.*;

public class Statistics {
    public static void main(String[] args) {
        int[] scores ={100,55,95,78,45,96,106,64,88,42,};
        int avg = 0;
       int sum = 0;
       int arrayLength = scores.length;


        for (int i = 0; i < arrayLength; i++) {

            //  for each cylce/(i)nstance sum(s) value is set to the current (i)nstance place value in the array and added to itself, resulting in a new higher value or lower if a negative number
            sum += scores[i];

            // the value of sum is then divided by the array length
            avg = sum / arrayLength;


        }
        // when the loop is complete you will have the average or the integers on that list.
        System.out.println("The average score is : " + avg);

        System.out.println();



        int lowest = scores[0];
        for (int i = 0; i < arrayLength; i++){

           if   (lowest >  scores[i]){

               lowest = scores[i];


           }
        }
        System.out.println();
        System.out.println(lowest + " is the lowest score.");

        int highest = scores[0];
        for (int score : scores){

            if (highest < score){

                highest = score;
            }
        }
        System.out.println();
        System.out.println(highest + " is the highest score.");

    }


}
