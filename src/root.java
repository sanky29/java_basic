/*Roots of polynomial- Write a Java program that given b and c, com-
putes the roots of the polynomial x*x+b*x+c. You can assume that the roots are
real valued and need to be return in an array.*/

//import scanner library for taking input from 
import java.util.Scanner;

//make root class for finding the roots of equations
public class root {
	
	//define public main function 
	public static void main(String args[]) {
		
		//declare the variables of equation ax*x + b*x + c = 0 
		double a,b,c;
		
		//define scanner variable x as
		Scanner scan = new Scanner(System.in);
		
		//initiate the value to command line input
		System.out.println ("give value of x^2 coefficient");
		
		//now add input to variable a 
		a = scan.nextDouble();

        //initiate the value to command line input
		System.out.println ("give value of x coefficient");
		
		//now add input to variable a 
		b = scan.nextDouble();

        //initiate the value to command line input
		System.out.println ("give value of contant");
		
		//now add input to variable a 
		c = scan.nextDouble();
        
        //declare discriminant of the equation as b^2 - 4*a*c
        double d = Math.pow(b, 2.0) - 4.0*a*c;
        
        //apply the rules for quadratic equations
        //if d =0.0 then roots are equal
        if (d == 0.0) {
        	
        	//the root in these situation is -b/2a
        	System.out.println("the equation has "+(-1.0*b/(2.0*a)) + " as only real root");
        }
        else if (d >=0.0) {
        	
        	//the root in this situation is (-b +- d^0.5)/2a
        	//the first root is x1
        	double x1 = (-1.0*b + Math.pow(d, 0.5))/(2.0*a);
        	
        	//the second root is x2
        	double x2 = (-1.0*b - Math.pow(d, 0.5))/(2.0*a);
        	System.out.println("the equation has "+(x1) + " and "+(x2) +" as two real roots");
        }
        else {
        	
        	//the root in this situation are complex (-b +- d^0.5i)/2a
        	//the real part of root is r
        	double real = (-1.0*b)/(2.0*a);
        	
        	//the complex part of root is c
        	double com = (Math.pow(-1.0*d, 0.5))/(2.0*a);
        	System.out.println("the equation has "+(real) + "+"+(com) +"i and "+real+"-"+com+"i as two complex root" );
        }
	}

}
