/** Jonathan Nelson Castillo. Oracle Certified Associate - Java SE 8 Programmer I.
	March 11, 2016. Lab 5. Solar System Activity.
*/

import javax.swing.*; //Swing Library
public class Planets_Activity_GUI{ 
	//Instance Variables - purpose of other methods (besides main method) can call instance variables
	// static means can be accessed without instantiation 
	public static String c, weight, name; //used for input for JOptionPane functions
	public static double w; //variable that is going to be used for parsing weight
	public static int choi; //variable that is going to be used for parsing c
	public static void main(String[]args){
	//showMessageDialog - Message box with no input
	JFrame frame = new JFrame(); //created this object for title box for showInputDialog
	//showInputDialog like showMessageDialog but with a prompting of user's input
	name = JOptionPane.showInputDialog(frame,"Enter your name: ","Introduction - Solar System",JOptionPane.WARNING_MESSAGE);  //Syntax for showInputDialog - requirement
	JOptionPane.showMessageDialog(null, "Hello " + name +	 "! Welcome to the Milky Way Weight Converter!","Welcome Message Box",JOptionPane.INFORMATION_MESSAGE);
	ImageIcon icon_ss = new ImageIcon("images/Solar_System.png");
	ImageIcon icon_earth = new ImageIcon("images/Earth.png");
	JOptionPane.showMessageDialog(null, "This is the Milky Way Solar System " + name + "!", "Solar System Illustration ",JOptionPane.INFORMATION_MESSAGE,icon_ss);
	JOptionPane.showMessageDialog(null, "This is where we live " + name + "!", "Planet Earth ",JOptionPane.INFORMATION_MESSAGE,icon_earth);
	JOptionPane.showMessageDialog(null, "Now, let us convert your weight from Earth to other objects in the Solar System " + name + "!", "Start Now",JOptionPane.INFORMATION_MESSAGE);
	Planets_Choices(); //calling the Planets_Choices method
	}
	
	public static void Planets_Choices(){
	//showInputDialog means it has a text inside it together with an input box.
	JFrame frame = new JFrame(); //JFrame object for title box of showInputDialog
	c = JOptionPane.showInputDialog(frame,"************************************************"+
	"\n Choose a Solar System object below:" +
	"\n 1. Mercury" +
	"\n 2. Venus" +
	"\n 3. Mars" +
	"\n 4. Jupiter" +
	"\n 5. Saturn" +
	"\n 6. Uranus" +
	"\n 7. Neptune" +
	"\n 8. Pluto" +
	"\n 9. Ceres" +
	"\n 10. Haumea" +
	"\n 11. Makemake" +
	"\n 12. Eris" +
	"\n 13. Sun" +
	"\n ************************************************","Solar System Planets",JOptionPane.WARNING_MESSAGE); //Syntax for showMessageDialog - requirement
	//Integer - primitive wrapper class
	//parse - reading and analyzing the data
	//Int - if the program reads the user input as Int then String is converted to int data type.
	choi = Integer.parseInt(c); 
	//If choice is not in the option, then it will keep looping to display Planets_Choices method.
	while(choi >= 14 || choi <= 0)
		{
		Planets_Choices(); //Self-referencing
		}
	Switch_Statements(); // calling Switch_Statements method
	}
	
	public static void Weight_Input(){
		JFrame frame = new JFrame(); //JFrame object for the title box of showInputDialog
		weight = JOptionPane.showInputDialog(frame,"Enter weight here in pounds(lbs): ", "Weight Input Box", JOptionPane.WARNING_MESSAGE); //Syntax for showInputDialog - requirement
		//Double - primitive wrapper class
		//parse - reading and analyzing the data
		//Double - if the program reads the user input as Double then String is converted to double data type.
		w = Double.parseDouble(weight);
		//If weight is less than or equal to 0, it will keep asking the user to enter the weight
		while(w <= 0)
		{
			weight = JOptionPane.showInputDialog(frame,"Enter weight here in pounds(lbs): ", "Weight Input Box", JOptionPane.WARNING_MESSAGE);
			w = Double.parseDouble(weight);
		}
	}
	//method with functions or procedures inside it
	public static void Switch_Statements(){	
	Weight_Input(); //calling Weight_Input method
	//ImageIcon is an object used for referencing images
	ImageIcon icon_mercury = new ImageIcon("images/Mercury.png");
	ImageIcon icon_venus = new ImageIcon("images/Venus.png");
	ImageIcon icon_mars = new ImageIcon("images/Mars.png");
	ImageIcon icon_jupiter = new ImageIcon("images/Jupiter.png");
	ImageIcon icon_saturn = new ImageIcon("images/Saturn.png");
	ImageIcon icon_uranus = new ImageIcon("images/Uranus.png");
	ImageIcon icon_neptune = new ImageIcon("images/Neptune.png");
	ImageIcon icon_pluto= new ImageIcon("images/Pluto.png");
	ImageIcon icon_ceres = new ImageIcon("images/Ceres.png");
	ImageIcon icon_haumea = new ImageIcon("images/Haumea.png");
	ImageIcon icon_makemake= new ImageIcon("images/Makemake.png");
	ImageIcon icon_eris = new ImageIcon("images/Eris.png");
	ImageIcon icon_sun = new ImageIcon("images/Sun.png");
		switch(choi) // efficient if-else statement
		{
			// break needed so that switch can see case as an option.
			//number after case means if user input corresponds to the case.
			//Math.round(variable * 10.0) / 10.0 - so that answer becomes 1 decimal place.
			case 1: //if user's input is 1, then it will convert Earth's weight to Mercury's weight.
			JOptionPane.showMessageDialog(null, name + "! Your weight here in Mercury is: " +(Math.round(w * 0.37 * 10.0) / 10.0) +" lbs","Conversion Successful!",JOptionPane.INFORMATION_MESSAGE,icon_mercury);
			break; 
			
			case 2: //if user's input is 2, then it will convert Earth's weight to Venus's weight.
			JOptionPane.showMessageDialog(null, name + "! Your weight here in Venus is: " +(Math.round(w * 0.88 * 10.0) / 10.0) +" lbs","Conversion Successful!",JOptionPane.INFORMATION_MESSAGE, icon_venus);
			break;
			
			case 3: //if user's input is 3, then it will convert Mars's weight to Mar's weight.
			JOptionPane.showMessageDialog(null, name + "! Your weight here in Mars is: " +(Math.round(w * 0.38 * 10.0) / 10.0) +" lbs","Conversion Successful!",JOptionPane.INFORMATION_MESSAGE,icon_mars);
			break;
			
			case 4: //if user's input is 4, then it will convert Earth's weight to Jupiter's weight.
			JOptionPane.showMessageDialog(null, name + "! Your weight here in Jupiter is: " +(Math.round(w * 2.64 * 10.0) / 10.0) +" lbs","Conversion Successful!",JOptionPane.INFORMATION_MESSAGE,icon_jupiter);
			break;
			
			case 5: //if user's input is 5, then it will convert Earth's weight to Saturn's weight.
			JOptionPane.showMessageDialog(null, name + "! Your weight here in Saturn is: " +(Math.round(w * 1.15 * 10.0) / 10.0) +" lbs","Conversion Successful!",JOptionPane.INFORMATION_MESSAGE,icon_saturn);
			break;
			
			case 6: //if user's input is 6, then it will convert Earth's weight to Uranus's weight.
			JOptionPane.showMessageDialog(null, name + "! Your weight here in Uranus is: " +(Math.round(w * 1.15 * 10.0) / 10.0) +" lbs","Conversion Successful!",JOptionPane.INFORMATION_MESSAGE,icon_uranus);
			break;
			
			case 7: //if user's input is 7, then it will convert Earth's weight to Neptune's weight.
			JOptionPane.showMessageDialog(null, name + "! Your weight here in Neptune is: " +(Math.round(w * 1.12 * 10.0) / 10.0) +" lbs","Conversion Successful!",JOptionPane.INFORMATION_MESSAGE,icon_neptune);
			break;
			
			case 8: //if user's input is 8, then it will convert Earth's weight to Pluto's weight.
			JOptionPane.showMessageDialog(null, name + "! Your weight here in Pluto is: " +(Math.round(w * 0.04 * 10.0) / 10.0) +" lbs","Conversion Successful!",JOptionPane.INFORMATION_MESSAGE,icon_pluto);
			break;
			
			case 9: //if user's input is 9, then it will convert Earth's weight to Ceres's weight.
			JOptionPane.showMessageDialog(null, name + "! Your weight here in Ceres is: " +(Math.round(w * 0.03 * 10.0) / 10.0) +" lbs","Conversion Successful!",JOptionPane.INFORMATION_MESSAGE,icon_ceres);
			break;
			
			case 10: //if user's input is 10, then it will convert Earth's weight to Haumea's weight.
			JOptionPane.showMessageDialog(null, name + "! Your weight here in Haumea is: " +(Math.round(w * 0.04 * 10.0) / 10.0) +" lbs","Conversion Successful!",JOptionPane.INFORMATION_MESSAGE,icon_haumea);
			break;
			
			case 11: //if user's input is 11, then it will convert Earth's weight to Makemake's weight.
			JOptionPane.showMessageDialog(null, name + "! Your weight here in Makemake is: " +(Math.round(w * 0.05 * 10.0) / 10.0) +" lbs","Conversion Successful!",JOptionPane.INFORMATION_MESSAGE,icon_makemake);
			break;
			
			case 12: //if user's input is 12, then it will convert Earth's weight to Eris's weight.
			JOptionPane.showMessageDialog(null, name + "! Your weight here in Eris is: " +(Math.round(w * 0.08 * 10.0) / 10.0) +" lbs","Conversion Successful!",JOptionPane.INFORMATION_MESSAGE,icon_eris);
			break;
			
			case 13: //if user's input is 13, then it will convert Earth's weight to Sun's weight.
			JOptionPane.showMessageDialog(null, name + "! Your weight here in Sun is: " +(Math.round(w * 27.93 * 10.0) / 10.0) +" lbs","Conversion Successful!",JOptionPane.INFORMATION_MESSAGE,icon_sun);
			break;
		}
		 Try_Again(); //calling Try_Again method.
	
	}
	 public static void Try_Again(){
		JFrame frame = new JFrame(); //JFrame object for the title box of showInputDialog
		c = JOptionPane.showInputDialog(frame,"Do you want to try again? [0/1]" +
		"\n 0 - NO" +
		"\n 1 - YES", "Want to try again?",JOptionPane.WARNING_MESSAGE); //Syntax for showInputDialog - requirement
		choi = Integer.parseInt(c);
		//If choice is 0 - it exits the program.
		if(choi == 0)
		{
			JOptionPane.showMessageDialog(null, "Thank you very much " + name + "! :)", "Goodbye " + name + "!",JOptionPane.INFORMATION_MESSAGE );
			JOptionPane.showMessageDialog(null, "Developer: Jonathan Nelson Castillo","Copyright Disclaimer", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		//if choice is 1 - will call Planets_Choices method or it will start over again
		else if(choi == 1)
		{
			Planets_Choices(); //if user inputs 1, it will call the Planets_Choices() method
		}
		//if user's input is not in the options, it will keep asking the user to input
		while(choi > 1 || choi < 0)
		{
			Try_Again(); //self-referencing
		} 
	 }		
}
	
	
		

	
	
	
