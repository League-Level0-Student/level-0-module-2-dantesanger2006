package _15_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {	

String age=JOptionPane.showInputDialog("how old are you");
int  num= Integer.parseInt(age);
if (num>18) {
	JOptionPane.showMessageDialog(null, "who next president should be");
}
else {
JOptionPane.showMessageDialog	(null,"nobody cares what they think");
}




}
}