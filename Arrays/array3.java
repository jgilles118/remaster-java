/*
 *  An array example:
 *  A frequency counter.
 *
 *
 * */


class array3{

    public static void main(String[] args){
    
        String phrase[] = {
            "PLEASE DO NOT TELL STUPID PEOPLE ANYTHING",
            "EVERY GOOD BOT DOES FINE",
            "DON'T EAT YELLOW SNOW",
            "ONE MORE FOR THE ROAD",
            "THE QUICK SLY BROWN FOX JUMPED OVER THE LAZY DOG"
        };//close phrase[]

       for(int i=0; i< phrase.length; i++){
        
           //Display the phrase 
           System.out.println(phrase[i]);

       }

       System.out.println(); 

        
        //Let the fun begin. Here's the code
       int[] letterCount = new int[26];
        
        for(int c1=0; c1 < phrase.length; c1++){
            
            String current = phrase[c1];
            char[] characters = current.toCharArray();

            for(int c2=0; c2 < characters.length; c2++){
                
                char chara = characters[c2];

                if((chara >= 'A') & (chara <= 'Z')){
                
                    letterCount[chara - 'A']++;

                }//close if-statement1

            }//close nested-loop


        }//close for-loop

        for(char count = 'A'; count <= 'Z'; count++){
            
            System.out.print(count + ": " + letterCount[count - 'A'] + "\t");

            if(count == 'M')  System.out.print("\n");

        }//close for-loop2


    }//close main


}//close class array3
