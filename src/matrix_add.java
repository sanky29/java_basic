/*Matrix addition- Given two matrices M1 and M2, the objective to add
them. Each matrix is provided as an int[][], a 2 dimensional integer array. The
expected output is also 2 dimensional integer array.*/

//this class adds two different matrices 
public class matrix_add {

	//define the function
	public static int[][] add(int[][] m1 , int[][] m2) { 
		
		//just crate the variable of output
		int ans[][] = new int[m1.length][(m1[0].length)];
		
		//just run the for loop
		for (int i = 0 ; i < m1.length ; i++) {
			
			//need to concider second for loop for colomun
			for (int j = 0 ; j < m1[0].length ; j ++) {
				
				//now add ith and jth element
				ans[i][j] = m1[i][j] + m2[i][j];
			}
		}
		//now just return the answer
		return(ans);
	}
}
