/** Jonathan Nelson Castillo. Oracle Certified Associate - Java SE 8 Programmer I.
	March 18, 2016. Lab 7. String and StringBuilder.
*/

import java.util.Scanner; //Scanner library
import javax.swing.*; //Swing Library for the GUI
public class LabSeven{
	//static variables - outside of method - can be accessed in any method
	public static int choi;
	public static String name,c;
	public static void main(String[]args){
	JFrame frame = new JFrame(); //Used for the title box of showInputDialog
	StringBuilder sb = new StringBuilder();
	name = JOptionPane.showInputDialog(frame,"Enter your name: ","Lab 07 Activity",JOptionPane.WARNING_MESSAGE); //Prompting user to input their name/s
	//Gets the name - and print 2nd box with a message
	JOptionPane.showMessageDialog(null, "Hello " + name +	 "! Welcome to the String and StringBuilder Manipulation!","Welcome Message Box",JOptionPane.INFORMATION_MESSAGE);
	Activity_Choices(); //calling Activity_Choices method
	}
	
	
	public static void Switch_Statements(){
	JFrame frame = new JFrame(); //Used for the title box of showInputDialog
	StringBuilder sb = new StringBuilder(); //StringBuilder object - mutable
	switch(choi)
	{
		case 1: //LAB07A
		String lab07a = JOptionPane.showInputDialog(frame,"Enter a words to de-space: ","Lab07A",JOptionPane.WARNING_MESSAGE); //Asking the user to input words
		JOptionPane.showMessageDialog(null, "De-spaced word:" +removeSpaces(lab07a),"De-Spaced Successful!",JOptionPane.INFORMATION_MESSAGE); //calling removeSpaces method and passing the lab07a variable from it
		break;
		
		
		case 2: //LAB07B
		String lab07b = JOptionPane.showInputDialog(frame,"Enter word here to expand: ","Lab07B",JOptionPane.WARNING_MESSAGE); //Asking the user to input words
	
		for(int b1 = 0; b1 < lab07b.length(); b1++) //outer loop - testing if b1 is still lesser than the String length
		{
			for(int b2 = 0; b2 < b1; b2++) //inner loop - b2 < b1 so that if the index is 0 - it will not store anything in the memory because 0 is 0 time. 1 will be stored 1 time and so forth
			{
				sb.append(lab07b.charAt(b1)); //Appending the input to StringBuilder object
			}
		}
		String b_result = sb.toString(); //toString() - converting StringBuilder object to a String
		JOptionPane.showMessageDialog(null, "Expanded word: " +b_result,"Expanded Successful!",JOptionPane.INFORMATION_MESSAGE); //message output of the word expanded
		break;
		
		case 3:
		String lab07c = JOptionPane.showInputDialog(frame,"Enter word here: ","Lab07C",JOptionPane.WARNING_MESSAGE); //Asking the user to input words
		sb.append(lab07c); //User's input appended to StringBuilder
		while(sb.length() > 0) // testing if the length of the user's input is still greater than 0
		{
		String lab07c1 = JOptionPane.showInputDialog(frame,"Enter index number here <empty to quit>: ","Lab07C",JOptionPane.WARNING_MESSAGE); 
		Integer c_int = Integer.parseInt(lab07c1); //parsing String
		while(c_int < 0 || c_int >= sb.length()) //If the user's input is less than 0 or greater than the reduced length
		{
			lab07c1 = JOptionPane.showInputDialog(frame,"Enter valid index number here(index starts with 0): ","Lab07C",JOptionPane.WARNING_MESSAGE); 
			c_int = Integer.parseInt(lab07c1); //parsing String
			
		} 
		String c2 = sb.toString(); //toString() - converting StringBuilder object to a String
		JOptionPane.showMessageDialog(null, "Result: " + sb.deleteCharAt(c_int),"Delete Successful!",JOptionPane.INFORMATION_MESSAGE); //sb.deleteCharAt(c_int) - deleting the specific String depends on the user input
		}
		break;
		case 4:
		String lab07d = JOptionPane.showInputDialog(frame,"Enter a string here(lowercase only): ","Lab07D",JOptionPane.WARNING_MESSAGE); //Asking the user to input words in lowercase - did this because Strings are case sensitive.
		sb.append(lab07d);  //User's input appended to StringBuilder
		while(sb.length() > 0) //testing if the user input's length is still greater than 0
		{ 
		JOptionPane.showMessageDialog(null, "Strings left: " + sb.toString(),"Lab07D",JOptionPane.INFORMATION_MESSAGE); //toString() - converting StringBuilder object to a String
		String x2 = JOptionPane.showInputDialog(frame,"Enter a string to be deleted(lowercase only):","Lab07D",JOptionPane.WARNING_MESSAGE); 
		int z2 = sb.indexOf(x2); //getting the index number of the user's input
		int j2 = z2 + x2.length(); //getting the indexOf up to the length - for example hellow - user's input is ello then e is index 1 and o is index 4 so telling the program to delete a string from the index 1 to 4.
		sb.replace(z2,j2,""); //replacing a blank space based on the part of the user's input String
		JOptionPane.showMessageDialog(null, "Result: " + sb,"Delete Successful!",JOptionPane.INFORMATION_MESSAGE);  //Result
		JOptionPane.showMessageDialog(null, "EMPTY TO QUIT","Delete Successful!",JOptionPane.INFORMATION_MESSAGE); //Message box telling the user that it will not end until String is not empty
		}
		
		break;
		case 5: //if user's input is to quit
		JOptionPane.showMessageDialog(null, "Thank you " + name,"Goodbye!",JOptionPane.INFORMATION_MESSAGE); //Goodbye box
		JOptionPane.showMessageDialog(null, "Developer: Jonathan Nelson Castillo","Copyright Disclaimer",JOptionPane.INFORMATION_MESSAGE); //showing the copyright
		System.exit(0); //exiting the GUI
		break;
		}
	Activity_Choices(); //calling Activity_Choices method
	Switch_Statements(); //calling Switch_Statements method
	}
	
	
	public static void Activity_Choices()
	{
		JFrame frame = new JFrame(); //JFrame for the input title box
		c = JOptionPane.showInputDialog(frame,"Choose Activity below: " +
	"\n *********************************************"+
	"\n 1. Lab07A" +
	"\n 2. Lab07B" +
	"\n 3. Lab07C" +
	"\n 4. Lab07D" +
	"\n 5. <Quit>","LAB SEVEN CHOICES",JOptionPane.WARNING_MESSAGE); //choices
	choi = Integer.parseInt(c); //parsing String
		while(choi <= 0 || choi >= 6) //if user's input is out of scope, then it will keep asking to prompt valid choice
		{
			
			c = JOptionPane.showInputDialog(frame,"Choose Activity below: "+
			"\n *********************************************"+
			"\n 1. Lab07A" +
			"\n 2. Lab07B" +
			"\n 3. Lab07C" +
			"\n 4. Lab07D" +
			"\n 5. <Quit>","LAB SEVEN CHOICES",JOptionPane.WARNING_MESSAGE); //choices
			choi = Integer.parseInt(c); //parsing String
		}
		Switch_Statements(); // calling Switch_Statements method
	}
	

	public static String removeSpaces(String lab07a) //String lab07a is being passed to case 1
	{
		StringBuilder result = new StringBuilder(); // StringBuilder object
		for(int i = 0; i < lab07a.length(); i++) //testing if i is lesser than the length of the string
		{
			if(lab07a.charAt(i) != ' ') //if there is a space
			{
				result = result.append(lab07a.charAt(i)); //then eliminate the space or just append it on the previous word
			}
		}
		return result.toString(); //returning the answer to be in String
    }
}
	
