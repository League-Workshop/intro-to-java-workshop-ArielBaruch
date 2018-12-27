package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
	String sentence = JOptionPane.showInputDialog(null, "Where was the biggest tsunami");
		
		// 3.  Use an if statement to check if their answer is correct
		if(sentence.equalsIgnoreCase("Lituya Bay")){
		// 4.  if the user's answer is correct
		JOptionPane.showMessageDialog(null, "Yes you are correct");
		
		// -- add one to their score 
		score++;
		}else {
			JOptionPane.showMessageDialog(null, "Sorry you are wrong");
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
