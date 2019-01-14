/*Score Marks- The \key" array is an array containing the correct answers
to an exam, like 'a','a','b','c'. The "answers" array contains a student's answers,
with ' ?' representing a question left blank. The two arrays are not empty and are
the same length. Return the score for the provided array of answers, giving a +4
for each correct answer, -1 for each incorrect answer and 0 for each blank answer.
For e.g. key = 'a','c','d','b' answers = 'c','c',' ?','b' then score is -1 + 4 + 0 + 4 =7*/

//define the main class
public class score_marks {
	   
	  //define the main function
	  public static int scoma(char[] anke , char[] resp) {
		  
		  //define the initial score to be 0
		  int score = 0;
		  
		  //now just use for loop
		  for (int i = 0 ; i < anke.length ; i++) {
			  
			  //if answer matches add four to score
			  if (anke[i] == resp[i]) {
				  
				  //add four to score
				  score += 4;
			  }
			  //if ans is wrong then
			  else if (resp[i] != anke[i] && resp[i] != '?') {
				  
				  //add -1 to score
				  score += -1;
			  }
		  }
		 
	      //just return the answer
		  return(score);
	  }
	  //check the function
	  public static void main(String args[]) {
		  char[] anske = {'a','c','d','b'};
		  char[] resp = {'c','c','?','b'};
		  System.out.println(scoma(anske,resp));
	  }
	  

}
