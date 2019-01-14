/*Remove zeros- Given an array of integers return an array in the same
order with all 0's removed. For e.g. is the input is 1,2,3,4,5,0,1,2,0,0,2 the expected
output is 1,2,3,4,5,1,2,2. If the input is 0,0,1,2 the output is 1,2. If the input is
0,0,0,0 the expected output is .*/

//define the class eliminate zero
import java.util.Arrays;
public class eliminate_zero {

	//define function which convert the given array into array without zer
	//first convert array into string
	//then eliminate its zero
	//then convert to the int array
	public static int[] eliminate(int[] x) {
		
		//make string from the array
		String str = Arrays.toString(x);
		
		//replace zero,space, , , [ and ] from string from str
		str = str.replace("0","");
		str = str.replace(" ","");
		str = str.replace(",","");
		str = str.replace("]","");
		str = str.replace("[","");
		
		//now convert it to array
		String[] anst = str.split(""); 
		
		//now convert str to int
		int n = anst.length;
		
		//make int array of n length
		int ansi[] = new int[n];
		
		//if n = 0 then return the simple empty list
		if (n == 0) {
			
			//just return ansi with empty array
			return(ansi);
		}
		
		//else convert each element to int
		else {
			
			//loop the array to convert each string to int
			for (int i = 0; i<n ; i++) {
				
				//convert each element to int
				ansi[i] = Integer.parseInt(anst[i]);
			}
		//now return the array
		return(ansi);
		}
				
	}
	//write the main function
	public static void main(String args[]) { 
		
		//define the array
		int[] c = {1,0,3,4,5,6,7}; 
		System.out.println(eliminate(c)[1]);
	}
}
