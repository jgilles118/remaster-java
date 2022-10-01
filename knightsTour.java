/*HW01 James Gilles
 * CS280 
 * Knight's Tour
 *****************/
import java.util.Scanner;

public class knightsTour {

	//Variables needed for board dimensions and knight movements
	private static Scanner scan1;
	private static Scanner scan2;
	private static int row, col;
	static int counter = 1;
	static int steps = 1;
	
	public static void main(String[] args) {
		scan1 = new Scanner(System.in);
		scan2 = new Scanner(System.in);
		
		//Ask the user dimensions of the board				
		System.out.print("Enter board row dimensions: ");
		row = scan1.nextInt();
		System.out.print("Enter board column dimensions: ");
		col = scan2.nextInt();
		
		//Empty array to be used by board dimension input
	 	int board[][] = new int[row][col];
	 	
		//if dimensions are too small
		if (row <= 3 || col <= 3){
			System.out.println("\nThe dimensions are too small!!\n");
			//Recalling the main method
			knightsTour.main(args);

		}
		
		else{
			display(board);
			//kMoves(board);	
		//Loop to display a matrix of zeros
		/**/
		}
	}
	public static void kMoves(int brd[][]){
		//The knight's possible moves starting form board[0][0]
		int xMove[] =  {2,1,-1,-1,-2,-1,1,2};
		int yMove[] = {-1,-2,-2,-1,1,2,2,1};
		int currRow = 0, currCol = 0;
		int pastRow = 0, pastCol = 0;
		
		brd[currRow][currCol] = counter;
		counter++;
		
		for(int i = 0; i < row*col; i++){
			//for(int j = 0; j < col; j++){
				//brd[i][j] = 0;
								
		if(counter <= row*col){
			//pastRow = currRow;
			//pastCol = currCol;
			currRow += yMove[steps];
			currCol += xMove[steps];
		}	
		if(brd[currRow][currCol] != 0){
				currRow = pastRow;
				currCol = pastCol;
				steps++;
		}
		else{
			brd[currRow][currCol] = counter;
			counter++;
			steps ++;
		}
		//System.out.print(brd[i][j] + "\t");
		//System.out.println();
			}
			//System.out.println();
			
		display(brd);
	}	
	public static void display(int brd[][]){
		//Loop to display a matrix
		
				for(int i = 0; i < row; i++){
					for(int j = 0; j < col; j++){
						brd[i][j] = 0;
						System.out.print(brd[i][j] + "\t");
					}
					System.out.println();
					}
			System.out.println();
	}
		
	
}
//Review and continue to get this game to work
//April 25, 2022
