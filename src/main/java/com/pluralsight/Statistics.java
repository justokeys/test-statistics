package com.pluralsight;
import java.lang.Math;
import java.util.Arrays;

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


        // set a int variable to store the lowest score





        int lowest = scores[0];
        // Created a for loop that cycyles the length of the array
        for (int i = 0; i < arrayLength; i++){
            // set an if statement that compares the current array value with a new score in the loop
           if   (lowest >  scores[i]){
            // if the new score is greater the cycle continues until , the (int lowest) value is the lowest
               lowest = scores[i];


           }
        }
        System.out.println();

        System.out.println(lowest + " is the lowest score.");

        int highest = scores[0];
        // this is acually a for each loop  ( score:scores) in psudo code is for each score in the array scores, check if highest is less than score.
        for (int score : scores){
            // compares variable highest with current score in loop
            if (highest < score){
            // if highest is less than current score  , then highest is updated to the new "highest score"
                highest = score;
            }
        }
        System.out.println();
        System.out.println(highest + " is the highest score.");

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));


            int upperMid = scores[4];
            int lowerMid = scores[5];

            int med = (lowerMid + upperMid) / 2 ;

            System.out.println(med);





    }







}
