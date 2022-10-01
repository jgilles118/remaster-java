/*
 *  The fantastic for-loop and the short-hand IF statement is fun.
 *
 *
 * */

class forLoop {

    public static void main(String[] args){

    
        for(int i = 0; i <= 10; i++ ){
            
            //An empty String variable to display a message.
            String sayWhat = "";
            
            //A short-hand IF statement. (condition) ? true result : else result.
            sayWhat = (i == 1) ? i + " Little kitten!" :  i + " Little kittens!";

            //Show me the message.
            System.out.println(sayWhat);
            
        }//close for loop

    }//close main

}//close forLoop
