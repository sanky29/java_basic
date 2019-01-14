/*Java les- You have been given the list of the names of the les in a
directory. You have to select Java les from them. A le is a Java le if it's name
ends with ".java". For e.g. "File- Names.java" is a Java le, "FileNames.java.pdf"
is not. If the input is \can.java", \nca.doc", \and.java", \dan.txt", \can.java",
\andjava.pdf",the expected output is "can.java", \and.java", \can.java"*/

//import * class
import java.util.*;

//import io class
import java.io.*;

//import scanner class
import java.util.Scanner;

//DEFIN THE MAIn class
public class java_file {
	
	//define fuction which takes file name as input and read from it
	//it also take output file name and add to it
	public static void scan(String input, String output) {
		
		//will have to use try catch bloack to avoid exceptions
		try {
		//open input file stream by 
		FileInputStream instream = new FileInputStream(input);
		
		//define scanner to read from input stream
		Scanner read = new Scanner(instream);
		
		//similarly define theoutstream
		FileOutputStream outstream = new FileOutputStream(output);
		
		//define the output flush which will follow the out stream
		PrintStream write = new PrintStream(outstream);
		
		//define temprory string to store current line of file
		
		//run while loop and read each input line
		//till you have the inputs in file
		while (read.hasNextLine()) {
			
			//read the line from the file
			String temprory;
			temprory = read.nextLine();
            
            //check the input file name
            if (temprory.substring(temprory.length() - 5).matches(".java") ) {
            	
            	//now push this name to output file
            	write.print(temprory + '\n');
                }
            //else do nothing
		    }
		}
		//if exception is catched output the not valid file string 
		catch(FileNotFoundException e){
			
			//output the not valid file command
			System.out.println("file not found");
		}
	}
	//write main function to check this
	public static void main(String args[]) {
		
		//call the function
	scan("input.txt","output.txt");
		
	}

}
