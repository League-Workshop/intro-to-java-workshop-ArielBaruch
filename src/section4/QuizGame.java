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
		JOptionPane.showMessageDialog(null, "You are correct");
		
		// -- add one to their score 
		score++;
		}else {
			JOptionPane.showMessageDialog(null, "Sorry you are wrong");
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String sentence1 = JOptionPane.showInputDialog(null, "What is the biggest ride of 2019");
		if(sentence1.equalsIgnoreCase("VAUGHAN")) {
			JOptionPane.showMessageDialog(null, "You are correct");
		score++;
		
		}else {
			JOptionPane.showMessageDialog(null, "Sorry you are wrong");
		}
		// 6.  After all the questions have been asked, print the user's score 
		String sentence2 = JOptionPane.showInputDialog(null, "What is the biggest statue in the world");
		
		if(sentence2.equalsIgnoreCase("Spring Temple Buddha")){
		
		JOptionPane.showMessageDialog(null, "You are correct");
		score++;
	}else {
		JOptionPane.showMessageDialog(null, "Sorry you are wrong");
	}
		
		
		
		System.out.println(score);
	}
}
