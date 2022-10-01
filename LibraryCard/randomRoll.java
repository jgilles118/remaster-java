/* 
    Using the java.util.Random class to generate a 
    random list of numbers.

*/
//Import the random number generator utility
import java.util.Random;

class randomRoll{

    public static void main(String [] args){

        //Variable gen
        Random gen = new Random();

        //To genereate INT values between -2147483648 and 2147483648.
        int value = gen.nextInt();
        System.out.println("Here is a random integer between -2147483648 and 2147483648: " + value);

        
        //To have a selected range of numbers between 1 and 100.
        value = gen.nextInt(1, 100);
        System.out.println("Here\'s another random integer in range of 1 - 100: " + value);

    }//close main

}//close randomRoll
