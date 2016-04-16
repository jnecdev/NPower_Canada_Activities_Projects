/** 
Jonathan Castillo. Oracle Certified Associate - Java SE 8 Programmer I
March 3, 2016. Lab 2. Customer.java
*/

public class Customer {

  public int customerID = 0; // Default ID for the customer
  public String name = "-name required-"; // default
  public String emailAddress = "-email required-"; // default

  // This method displays the values for an item
  public void displayCustomerInfo() {
    System.out.println("********Customer Information********");
    System.out.println("Customer ID: " + customerID);
    System.out.println("Name:" + name);
    System.out.println("Email: " + emailAddress);
    System.out.println("************************************");
  } // end of display method
} // end of class



