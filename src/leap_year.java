/*Leap year- Given a year, return true if it is a leap year otherwise return
false. Please note that years that are multiples of 100 are not leap years, unless
they are also multiples of 400.*/

//import scanner class for taking input from command line
import java.util.Scanner;

//define the class with name leap_year containing main function
public class leap_year {
	
	//the main function with void type return
	public static void main(String args[]) {
		
    //declare variable to store input from command line
	int x;
	
	//the scanner variable for reading input
	Scanner y = new Scanner(System.in);
	
	//reading inpput from the command line
	x = y.nextInt();
	
	//applying leap year conditions on x
    System.out.println((x % 4 == 0 && x % 100 != 0 ) || x % 400 == 0);
	}
}
