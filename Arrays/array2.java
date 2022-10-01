/*
 *  More arrays review
 *  Placing a list in alpha order
 * */

import java.util.*;

class array2 {

    public static void main(String[] args){

        String names[] = {"Glimmer", "Marvel","Rust", "Clove", "Alpha",
                            "Foxface", "Carton"};

        System.out.println("The original order: ");

        for( int i=0; i< names.length; i++){
            
            System.out.println(i + ": " + names[i]);

        }

        //put the list in alphabetical order
        Arrays.sort(names);

        System.out.println("\nThe aphabetical order:");

        
        for( int i=0; i< names.length; i++){
            
            System.out.println(i + ": " + names[i]);

        }


    }//close main


}//close arrays2


