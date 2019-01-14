/*Least common multiple- Given two integers n and m, the objective is
to compute the LCM (least common multiple) of n and m. LCM is the smallest
number that is divisble by both n amd m. For e.g. is n is 12 and m is 14, the LCM
is 84. If n is 32 and m is 16, the LCM is 32.*/

//import the scanner class for reading input from command line
import java.util.Scanner;

//the main public class LCM defined and declared
public class lcm {
	 
	 //define the main function
	 public static void main(String args[]) {
		 
		 //now define new scanner variable for reading input from command line
		 //the new variable is initiated with scanning through command line input
		 Scanner scan = new Scanner(System.in);
		 
		 //declare the b and c of which lcm we need to find
		 //they are of type double
		 int b,c;
		 
		 //just need to declare two different variables as d and e
		 int d,e;
		 
		 //read b from command line
		 b = scan.nextInt();
		 
		 //read c from command line
		 c = scan.nextInt();

         //assign value to d to max (c,d)
         d =Math.max(c,b);
         
         //assign e the minimum value of c and d
         e = Math.min(c,b);
         
         //declare three variables as remainder,current remainder and divisor for while loop 
         //beach help us to change values between remainder and divisor
         int remainder, divisor, beach; 
         
         //now initiate the values of above variables remainder and divisor
         remainder = d % e;
         divisor = e;
         beach = remainder;
         
         //now we need to use while loop for finding a minimum prime factor "a" from both
         //we assume b = (a^m)*k1 and d = (a^n)*k2
         while (remainder > 0) {
        	 
        	 //assign new values to remainder and divisor
        	 //make remainder as new divisor 
        	 remainder = divisor % remainder;
        	 divisor = beach;
        	 beach = remainder;
        	 }
         
         //so we get divisor as our a
         
         //but if a is one the we know both of them are prime hence we just print out c*b
         if (divisor == 1) {
        	 System.out.println(c*b);
         }
         
         //else we need to find m and n for highest power of a in b and c
         else {
              int m,n,b1,c1;
         
              //we define two cloning variable b1 and c1 equal b and c
              b1 = b;
              c1 = c;
         
              //initiate m and n with 0 
              m = 0;
              n = 0;
              
              //now need to find m using while loop
              while (b1 % divisor > 0 ) {
        	 
        	      //now assign b1 with b1/divisor and add 1 to m
        	      b1 = b1 / divisor;
        	      m++;
                  }
              
              //similarly find n
              while (c1 % divisor > 0 ) {
             	 
        	      //now assign b1 with b1/divisor and add 1 to m
        	      c1 = c1 / divisor;
        	      n++;
                  }
              
              //need to find a^m and a^n
              b1 = 1;
              for (int i=0; i<= m; i++) {
            	  b1 = b1*divisor; 
              }
              
              //similarly need to find a^n
              c1 = 1;
              for (int i=0; i<= n; i++) {
            	  c1 = c1*divisor; 
              }
              
              //output the result
              System.out.println(Math.max(c1, b1)*(b/b1)*(c/c1));
         }   
	 }
}
