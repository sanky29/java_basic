/*String concat- Given two strings s1,s2 and two indices m,n return a
string having chars from index m to end of s1 and then 0 to n of s2 (both m and n
are inclusive). For eg, if s1=\hello", s2=\world", m=3, n=0, then answer is \low"*/

//import scanner class for reading input
import java.util.Scanner;

//defined class to concanate the strings
public class string_concanat {
	
	//define the funcion for concatanation of the the string
	public static String strcon(String s1 , String s2, int n , int m) {
		
		//define answer string
		String answer;
		
		//now just define the sub string of two string and add them
		answer = s1.substring(n) + s2.substring(0 , m+1);
		
		//just return the answer
		return(answer);
		}
	//check function in main function
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in); 
		String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        int n = scan.nextInt();
        int m = scan.nextInt();
        System.out.println(strcon(s1,s2,n,m));
	}

}
