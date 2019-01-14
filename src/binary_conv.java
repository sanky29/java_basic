/*Hex to binary- Given a string representing a number in hexadecimal
format, convert it into its equivalent binary string. For e.g. if the input if "1F1"
then its binary equivalent is "111110001". If the input is \13AFFFF", the output
should be \1001110101111111111111111".*/

//import scanner library for scanning ans
import java.util.Scanner;

//name the class same as file name
public class binary_conv {
	
	//define simple function which convert the one hexa to decimal
	//like F to 1111
	public static String equivalent(char hexa1) {
		
		//we have to use switch statement
		//because the content is large
		switch(hexa1) {
		
		//case1 will be if hexa1 = 0 then output is 0000
		case '0':
			return("0000");
			
		//case1 will be if hexa1 = 1 then output is 0001
	    case '1':
			return("0001");
			
		//case1 will be if hexa1 = 2 then output is 0010
		case '2':
			return("0010");
					
		//case1 will be if hexa1 = 3 then output is 0011
		case '3':
			return("0011");
		    
		//case1 will be if hexa1 = 4 then output is 0100
		case '4':
		    return("0100");
		  			
		//case1 will be if hexa1 = 5 then output is 0101
		case '5':
		  	return("0101");
		  			
		//case1 will be if hexa1 = 6 then output is 0110
		case '6':
		  	return("0110");
		  						
		//case1 will be if hexa1 = 7 then output is 0111
		case '7':
		  	return("0111");
		  		   
		//case1 will be if hexa1 = 8 then output is 1000
		case '8':
			return("1000");
				
		//case1 will be if hexa1 = 9 then output is 1001
		case '9':
			return("1001");
							
		//case1 will be if hexa1 = A then output is 1010
		case 'A':
			return("1010");
			
	    //case1 will be if hexa1 = B then output is 1011
		case 'B':
			  return("1011");
			  			
	    //case1 will be if hexa1 = C then output is 0101
	    case 'C':
			  return("1100");
			  			
	    //case1 will be if hexa1 = D then output is 1101
	    case 'D':
			  return("1101");
			  						
		//case1 will be if hexa1 = E then output is 1110
		case 'E':
			  return("1110");
			  
		//case1 will be if hexa1 = F then output is 1111
		case 'F':
			  return("1111");	   
	   
	    //in case input does not match
	    default:
	    	return ("not valid input");

		}
	}

	//declare function for the conversion
	public static String convert(String hexa) {
		
		//now declare the output string
		String ans = "";
		
		//now declare the variable length of string
		int n = hexa.length();
		
		//run for loop for the ans
		for (int i = 0 ; i < n ; i ++) {
			
			//convert ith element of hexa to binary
			//add it to ans
			ans = ans + equivalent(hexa.charAt(i));
		}
		//now need to trim the initial zeros
		//IF 1 IS AT 0 THEN DON'T TRIM THE STRING
		if(ans.indexOf('1')==0) {
			
			//return the whole string
			return(ans);
		}
		else {
			//need to trim the string
		    ans = ans.substring(ans.indexOf('1') - 1);
		
		    //now return this string
		    return(ans);
		}
	}
	//define main function to check the function
	public static void main(String args[]) { 
		
		//define scanner variable
		Scanner scan = new Scanner(System.in);
		
		//instruction
		System.out.println("enter your string ");
		
		//input string
		String input = scan.nextLine();
		
		//output the binary ans 
		System.out.println(convert(input));
	}
}
