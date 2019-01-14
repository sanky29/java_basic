/*Same last digit- Given two non-negative integers, return true if they
have the same last digit, such as with 27 and 57. Note that the % "mod" operator
computes remainder, so 17%10 is 7.*/

//import the scanner file for the reading input
import java.util.Scanner;

//define the class for the last_digit finding function
public class last_digit {
	
	//defining the main function with void type return
	public static void main(String args[]) {
		
	//declare two integers that will be used for storing inputs
	int x,z;
	
	//create scanner variable for taking input from the command line
	Scanner y = new Scanner(System.in);
	
	//taking first integer and storing it to x
	x = y.nextInt();
	
	//taking second input and storing it in z
	z = y.nextInt();
	
	//now the last digit is same means remainder by dividing 10 will be same
    System.out.println(x % 10 ==  z % 10);
	}
}

