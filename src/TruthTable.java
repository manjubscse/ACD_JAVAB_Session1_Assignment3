// Importing the Scanner class used for taking input from user
import java.util.Scanner;
public class TruthTable {

	//main method 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare variable type integer for Bitwise AND Operation
		int a; 
		int b;
		//Declare variable type Boolean for Logical AND Operation
		boolean x;
		boolean y;
		
		//Define Scanner object for taking input from user
		Scanner Obj =new Scanner(System.in);
		
		//Print the Message for user
		System.out.println("Please Enter the Value for a and b");
		
		// to take the input from user for a and b
		
		a=Obj.nextInt(); //must be type integer
				
		b=Obj.nextInt(); //must be type integer
		
		//Print the Bitwise AND Operation result
		System.out.println("Output for Bitwise AND is :" +  ( a & b ));
		System.out.println(" "); //Print Space 
		
		//Print the LOGICAL AND operation result
		System.out.println("LOGICAL AND operation using if condition" );
		if ((a==b)==true && (b==1)==true)
		{
			System.out.println("Output for Logical AND is :" + "True" );
		}
		else
		{
			System.out.println("Output for Logical AND is :" + "false" );
		}

		//Print the Message for user
		System.out.println(" "); //Print Space 
		System.out.println("LOGICAL AND operation using Inputs from user" );
		System.out.println("Please Enter the Value for x and y");
				
		// to take the input from user for a and b
		x=Obj.nextBoolean(); //must be type Boolean
		y=Obj.nextBoolean(); //must be type Boolean
		
		//Printing Logical AND operation for User Input
		System.out.println("Output for Logical AND is :" + (x && y) );
		
		Obj.close(); // Close the Object of Scanner
		
	
	}

}
