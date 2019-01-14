/*Most frequent digit- Given a number, the objective is to nd out
the most frequently occuring digit in the number. If more than 2 digits have the
same frequency, return the smallest digit. The number is input as a string and the
output should be the digit as an integer. For e.g. if the number is 12345121, the
most frequently occuring digit is 1. If the number is 9988776655 the output should
be 5 as it is the smallest of the digits with the highest frequency.*/

//import the scanner library for reading input from command line
import java.util.Scanner;

//define the public class most_frquent
public class most_frequent {
	
	//define the function which catches this most frequnt digit
	public static int mostf(long num) {
		
		//now define array to catch the score of each digit
		int[] score = {0,0,0,0,0,0,0,0,0,0};
		
		//mow define the string to find length
		String str = Long.toString(num);
		
		//find the length of string
		int len = str.length();		
		
		//define temprory char
		char tempc = '.';
		
		//define the max score no
	    int leader = 0;	
	    
	    //define temp no at that index
	    int tempi = 0;
	
		//run the for loop for catching the answer
		for (int i = 0 ; i < len ; i ++ ) {
			
			//check the ith index
			tempc = str.charAt(i);
			
			//check tempi
			tempi = Character.getNumericValue(tempc);
			
			//add score to tempi
			score[tempi] += 1;
			
			//compare score to existing leader and then change
			if (score[leader] < score[tempi] || (score[leader] == score[tempi] && leader > tempi)) {
				
				//the existing tempi is new leader
				leader = tempi;
			}
			
		}
		return(leader);
	}
	public static void main (String args[]) {
		Scanner x = new Scanner(System.in);
		long y = x.nextLong();
        System.out.println(mostf(y));
	}

}
