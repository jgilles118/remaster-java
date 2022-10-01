/*  The lesserGREAT conditional will compare two values
 *  using <, >
 *
 *  Oct. 1, 2022
 * */

class lesserGREAT{
    
    public static void main(String[] args){
        int elephant = 2800;
        int cat = 17;
        
        // The greater than operator >
        if (elephant > cat){
            System.out.println("The elephant weigh more than the cat.");

        }
        // The less than operator <
        if (cat < elephant){
            System.out.println("The cat weigh less than the elephant.");

        }
        // The is_equal comparitor ==. Using ! not to display the message.
        if (elephant != cat){
            System.out.println("The elephant and the car are not equal in weight.");

        }
        
    }


}
