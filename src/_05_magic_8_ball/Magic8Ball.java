//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	

	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random never =new Random();
int no=never.nextInt(4);
	// 3. Print out this variable
	System.out.println(no);
	// 4. Get the user to enter a question for the 8 ball
	JOptionPane.showInputDialog("give me a qustin ");
	// 5. If the random number is 0
	if (no == 0) {
		JOptionPane.showMessageDialog(null, "yes");
	} else if (no== 1) {
		JOptionPane.showMessageDialog(null, "no");
	} else if (no == 2) {
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google");
	} else if (no == 3) {
		JOptionPane.showMessageDialog(null,"you will never know" );	
	} else {
		
	}
}
	// -- tell the user "Yes"
	
	// 6. If the random number is 1
	
	// -- tell the user "No"
	
	// 7. If the random number is 2
	
	// -- tell the user "Maybe you should ask Google?"
	
	// 8. If the random number is 3
	
	// -- write your own answer

}
