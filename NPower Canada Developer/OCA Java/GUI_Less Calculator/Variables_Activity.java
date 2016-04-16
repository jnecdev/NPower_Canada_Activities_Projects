/** Jonathan Castillo. Oracle Certified Associate - Java SE 8 Programmer I.
	March 5, 2016. Lab 3. GUI-Less Calculator (2 numbers only)
*/

import java.util.Scanner; //Scanner library for the Scanner object
public class Variables_Activity {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //Scanner object to prompt user input.
        int num1; //1st number.
        int num2; //2nd number.
        int c;    //Choice for Arithmetic operations.
        int sum; // 1st choice - result for adding numbers.
        int diff; // 2nd choice - result for subtracting numbers.
        int product; // 3rd choice - result for multiplying numbers.
        int quotient; // 4th choice - result for dividing numbers. Global variable.
		int rem;// 5th choice - result for remainder of dividing numbers.
        System.out.println("");
	    System.out.print("Enter 1st integer:"); 
        num1=input.nextInt(); 
		System.out.println("");
		//Scanning user input. If integer - the program will continue, if not - the program will throw an exception.
        System.out.print("Enter 2nd integer:");
        num2=input.nextInt();
		//Scanning user input. If integer - the program will continue, if not - the program will throw an exception.
		
		//Hard code for the choices
        System.out.println("************************************************");
		System.out.println("");
		System.out.println("Pick an arithmetic operation to perform below:");
		System.out.println("");
		System.out.println("-----------------------------");
		System.out.println("|                           |");
		System.out.println("|                           |");
        System.out.println("| Choose 1 - Addition       |");
        System.out.println("| Choose 2 - Subtraction    |");
        System.out.println("| Choose 3 - Multiplication |");
        System.out.println("| Choose 4 - Division       |");
		System.out.println("| Choose 5 - Remainder      |");
		System.out.println("|                           |");
		System.out.println("-----------------------------");
		System.out.println("");
        System.out.print("Number of Choice(1-5): ");
		c = input.nextInt(); 
		//Scanning user input. If integer - the program will continue, if not - the program will throw an exception.
		
		//If user input choice is greater than 5 or lesser than 1, then it will keep asking the user to input from choices.
		//If user input choice is between 1 and 5 then the program will disregard this loop.
		while(c >= 6 || c <= 0) // || means OR - if either conditions are met.
		{
		System.out.println("Invalid pick!");
		System.out.println("");
		System.out.print("Please select from 1-5: ");
        c = input.nextInt();
		}

        if(c == 1) //If user input choice is 1, it will perform adding.
                {
                    sum = num1 + num2;
                    System.out.println("The sum for "+ "(" + num1+ " + " +num2 + ")" + " is" + ": " +sum);                   
                }
        
        else if(c == 2) //If user input choice  is 2, it will perform subtracting.
        {
            diff = num1 - num2;
            System.out.println("The difference for "+ "(" + num1+ " - " +num2 + ")" + " is" +  ": " +diff);
        }
        
        else if(c == 3) 
        {
            product = num1 * num2; //If user input choice is 3, it will perform multiplying.
            System.out.println("The product for "+ "(" + num1+ " x " +num2 + ")" + " is" +  ": " +product);
            
        }
		
        else if(c == 4) //If user input choice is 4, it will perform dividing.
        {
			//If user input for 2nd number is 0, program will tell the user that second number can't be 0 and ask to try again(do all over again).
			if(num2 == 0) 
			{
				System.out.println("");
				System.out.println("Second number can't be 0. It will result to INFINITY!");
				System.out.println("Please Try Again.");
				System.out.print("");
			}
			
			//If second number is greater than 1st number, the result will have a decimal OR if first number is not divisible by the second number.
			
			else if(num2 > num1 || num1 % num2 > 0)
			{
				//variable set to double so that result can have decimal.
				//multiplied by 1.0 to have a result of decimal.
				double quotient2 = num1 * 1.0 / num2; //local variable. 
				System.out.println("The quotient for "+ "(" + num1+ " / " +num2 + ")" + " is" + ": " +quotient2);
			}
			
			else
			{
			//If first number is greater than second number.
			//If second number is not equal to 0.
            quotient = num1 / num2;
            System.out.println("The quotient for "+ "(" + num1+ " / " +num2 + ")" + " is" + ": " +quotient);
            }
			
        }
		else if(c == 5) //If user input choice is 4, it will perform modulo.
		{
			//if first number is lesser than second number, result will be the first number.
			//if second number is lesser than first number, result will be the remainder when dividing second number from first number.
			rem = num1 % num2;
			System.out.println("The remainder for "+ "(" + num1+ " / " +num2 + ")" + " is" + ": " +rem);
		}
        else
         {
             System.out.println("Invalid choice!"); //If choice is invalid    
		 }
	}     
}

