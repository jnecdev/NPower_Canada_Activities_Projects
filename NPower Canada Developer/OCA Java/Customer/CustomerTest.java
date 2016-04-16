/** 
Jonathan Castillo. Oracle Certified Associate - Java SE 8 Programmer I
March 3, 2016. Lab 2. CustomerTest.java
*/

class CustomerTest{
  public static void main(String[] args)
  {
      //should be in the same path so CustomerTest class can call Customer class
      // Creating object
      //Customer customer1 is declaration
      // new Customer is instantiating and initializing
      
      Customer customer1 = new Customer();
      Customer customer2 = new Customer();
     
      //Dot notation - object.variable
      //for referencing, getting the value of variable from Customer class
     
      //displayCustomerInfo is the void method from Customer class
      //customerID, name, and emailAddress are the variables called from Customer class
      //object.displayCustomerInfo is for printing whatever is printing from Customer file
      //"String is here" + the value that is stored (i.e. customer1.name)
      
      customer1.customerID = 1;
      customer2.customerID = 2;
      
      customer1.name="Jonathan";
      customer2.name="Cosmin";
      
      customer1.emailAddress="jonathan@npowercanada.ca";
      customer2.emailAddress="cosmin@npowercanada.ca";
     
      customer1.displayCustomerInfo();
      customer2.displayCustomerInfo();
      
      //customer1 value becomes the value of customer2
      //read from left to right
      customer1 = customer2;
      
      customer1.displayCustomerInfo();  
	  customer2.displayCustomerInfo();	

	//output here instead of 2 customer1 and customer 2, it is 1 customer 1 and 3 customer 2
	//because value of customer 1 becomes customer 2
	//old value of customer 1 is somewhere in the memory
  }
}
  
  