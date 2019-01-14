/*
 * Average of numbers- Given an array of integers nds the average of
all the elements. For e.g. for 4,7,9,4 the average is 6 and for 1,3,8,5 the average is
4.25. Please note that if the array has no elements, the average should be 0.*/

//define the average class
public class average {
	
	//define the function for average
	public static double cal_average(double x[]) {
		
		//define the variable for the temp sum 
		double sum = 0.0;
		
		//define the length of array
		int n = x.length;
		
		//update sum by adding all elements from array
		for (int i = 0 ; i < n; i++ ) {
			
			//add ith element to sum
			sum += x[i];
		}
		
		//return the average
		return (sum/n);
	}
	//define main function to calculate the thing
	public static void main(String args[]) {
		
		double y[]= {1,2,3,4,5,6};
		System.out.println(cal_average(y));
	}
}
