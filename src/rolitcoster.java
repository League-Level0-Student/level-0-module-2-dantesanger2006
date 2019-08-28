import javax.swing.JOptionPane;

public class rolitcoster {
public static void main(String[] args) {
String hith=JOptionPane.showInputDialog("how tall are you");	
int  num= Integer.parseInt(hith);
if (num >48) {
JOptionPane.showMessageDialog(null, "you can go on the rollercoaster");	

}

else {
	JOptionPane.showMessageDialog(null, "you need to grow more first");
}




}
}
