import java.util.Random;
import java.util.Scanner;
public class Red_Dog{
	private static int c1,c2,player;
	private static int lives = 3;
	private static int score = 0;
	private static String choi,high_low;
	private static String c1_num,c1_suit;
	private static String c2_num,c2_suit;
	private static String player_num,player_suit;
	private static int[] deck = new int[52];
	private static String[] cards = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	private static String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
public static void main(String[]args){
	Card_Procedures();
}

 public Red_Dog(){
	this.c1 = c1;
	this.c2 = c2;
 }

 public static void Same_Cards(){
	 System.out.println("\n \n");
			Scanner input = new Scanner(System.in);
			System.out.print("Want to bet?[Y/N]:");
	  choi = input.next();
	   if(choi.equalsIgnoreCase("Y")){
			System.out.println("Higher or Lower?[H/L]:");
					high_low = input.next();
					player = (int)(Math.random() * deck.length); 
					if(player == c1 || player == c2)
					 {
						 player = (int)(Math.random() * deck.length);
					 } 
					Player_Card();
					if(high_low.equalsIgnoreCase("H")){
						if(player > c1)
							{
								System.out.println("You Win!");
								  score+=1;
								  System.out.println("\n");
								  System.out.println("Score: "+score);
								  System.out.println("Lives: "+lives);
							}
						else if(player < c1)
							{
								System.out.println("You Lose!");
								   lives--;
								   System.out.println("\n");
								  System.out.println("Score: "+score);
								  System.out.println("Lives: "+lives);
							}
						else if(player == c2)
							{
								System.out.println("You Lose!");
								System.out.println("\n");
								  lives--;
								  System.out.println("Score: "+score);
								  System.out.println("Lives: "+lives);
							}
							
					}
					else if(high_low.equalsIgnoreCase("L")){
						if(player > c1)
							{
								System.out.println("You Lose!");
								System.out.println("\n");
								  lives--;
								  System.out.println("Score: "+score);
								  System.out.println("Lives: "+lives);
							}
						else if(player < c1)
							{
								System.out.println("You Win!");
								  score+=1;
								  System.out.println("\n");
								  System.out.println("Score: "+score);
								  System.out.println("Lives: "+lives);
							}
						else if(player == c1)
							{
								System.out.println("You Lose!");
								System.out.println("\n");
								  lives--;
								  System.out.println("Score: "+score);
								  System.out.println("Lives: "+lives);
							}
							
					}
					
	   }
					
					
		}
 
public static void Diff_Cards()
{
	System.out.println("\n \n");
	Scanner input = new Scanner(System.in);
System.out.print("Want to bet?[Y/N]:");
	  choi = input.next();
	   if(choi.equalsIgnoreCase("Y"))
	  {
		  
		player = (int)(Math.random() * deck.length); 
		if(player == c1 || player == c2)
		 {
			 player = (int)(Math.random() * deck.length);
		 } 
		Player_Card();  
	 if(player > c1 && player > c2)
		  {
		  System.out.println("You Lose!");
		  lives--;
		  System.out.println("\n");
			}
	 else if(player < c1 && player < c2)
		  {
		  System.out.println("You Lose!");
		  lives--;
		  System.out.println("\n");
			}
			
	 if(player < c1 && player > c2)
		  {
		  System.out.println("You Win!");
		  score+=1;
		  System.out.println("\n");
		  
			}
	 else if(player > c1 && player < c2)
		  {
		  System.out.println("You Win!");
		  score+=1;
		  System.out.println("\n");
		  
			}
	System.out.println("Score: "+score);
	System.out.println("Lives: "+lives);
	
	  }
	 
	 
}
	
 
public static void Card_Procedures(){
	Scanner input = new Scanner(System.in);
	  while(lives>0){
	  c1 = (int)(Math.random() * deck.length);
	  c2 = (int)(Math.random() * deck.length);
	  System.out.println("\n \n Cards Reshuffled! \n");
	  while(c1 == c2)
	  {
	 c1 = (int)(Math.random() * deck.length);
	  c2 = (int)(Math.random() * deck.length);
	  }
	  Cards_Match();
	  if(c1_num==c2_num)
	  {
	  Same_Cards();
	  }
	  else{Diff_Cards(); }
			
	
		/* System.out.println("Your final score is: "+score); */
}
}




/* public static int getRandom(int[] array) {
    int rnd = new Random().nextInt(array.length);
    return array[rnd];
}
 */
 public static void Player_Card()
 {
	 if(player >= 0 && player <=3)
	 {
		player_num = cards[0];
	 }
	 else if(player >= 4 && player <=7)
	 {
		player_num = cards[1];
	 }
	 else if(player >= 8 && player <=11)
	 {
		player_num = cards[2];
	 }
	 else if(player >= 12 && player <=15)
	 {
		player_num = cards[3];
	 }
	 else if(player >= 16 && player <=19)
	 {
		player_num = cards[4];
	 }
	 else if(player >= 20 && player <=23)
	 {
		player_num = cards[5];
	 }
	 else if(player >= 24 && player <=27)
	 {
		player_num = cards[6];
	 }
	 else if(player >= 28 && player <=31)
	 {
		player_num = cards[7];
	 }
	 else if(player >= 32 && player <=35)
	 {
		player_num = cards[8];
	 }
	 else if(player >= 36 && player <=39)
	 {
		player_num = cards[9];
	 }
	 else if(player >= 40 && player <=43)
	 {
		player_num = cards[10];
	 }
	 else if(player >= 44 && player <=47)
	 {
		player_num = cards[11];
	 }
	 else if(player >= 48 && player <=51)
	 {
		player_num = cards[12];
	 }
	 
	 if(player % 4 == 0)
	 {
		player_suit = suits[0];
	 }
	 
	 else if(player % 4 == 1)
	 {
		player_suit = suits[1];
	 }
	 
	 else if(player % 4 == 2)
	 {
		player_suit = suits[2];
	 }
	 
	 else if(player % 4 == 3)
	 {
		player_suit = suits[3];
	 }
	  System.out.println("Player Card: " +player_num +" of " +player_suit);
 }
 
 public static void Cards_Match(){
	 if(c1 >= 0 && c1 <=3)
	 {
		c1_num = cards[0];
		
	 }
	 else if(c1 >= 4 && c1 <=7)
	 {
		c1_num = cards[1];
	 }
	 else if(c1 >= 8 && c1 <=11)
	 {
		c1_num = cards[2];
	 }
	 else if(c1 >= 12 && c1 <=15)
	 {
		c1_num = cards[3];
	 }
	 else if(c1 >= 16 && c1 <=19)
	 {
		c1_num = cards[4];
	 }
	 else if(c1 >= 20 && c1 <=23)
	 {
		c1_num = cards[5];
	 }
	 else if(c1 >= 24 && c1 <=27)
	 {
		c1_num = cards[6];
	 }
	 else if(c1 >= 28 && c1 <=31)
	 {
		c1_num = cards[7];
	 }
	 else if(c1 >= 32 && c1 <=35)
	 {
		c1_num = cards[8];
	 }
	 else if(c1 >= 36 && c1 <=39)
	 {
		c1_num = cards[9];
	 }
	 else if(c1 >= 40 && c1 <=43)
	 {
		c1_num = cards[10];
	 }
	 else if(c1 >= 44 && c1 <=47)
	 {
		c1_num = cards[11];
	 }
	 else if(c1 >= 48 && c1 <=51)
	 {
		c1_num = cards[12];
	 }
	 
	 if(c1 % 4 == 0)
	 {
		c1_suit = suits[0];
	 }
	 
	 else if(c1 % 4 == 1)
	 {
		c1_suit = suits[1];
	 }
	 
	 else if(c1 % 4 == 2)
	 {
		c1_suit = suits[2];
	 }
	 
	 else if(c1 % 4 == 3)
	 {
		c1_suit = suits[3];
	 }
	 
	if(c2 >= 0 && c2 <=3)
	 {
		c2_num = cards[0];
	 }
	 else if(c2 >= 4 && c2 <=7)
	 {
		c2_num = cards[1];
	 }
	 else if(c2 >= 8 && c2 <=11)
	 {
		c2_num = cards[2];
	 }
	 else if(c2 >= 12 && c2 <=15)
	 {
		c2_num = cards[3];
	 }
	 else if(c2 >= 16 && c2 <=19)
	 {
		c2_num = cards[4];
	 }
	 else if(c2 >= 20 && c2 <=23)
	 {
		c2_num = cards[5];
	 }
	 else if(c2 >= 24 && c2 <=27)
	 {
		c2_num = cards[6];
	 }
	 else if(c2 >= 28 && c2 <=31)
	 {
		c2_num = cards[7];
	 }
	 else if(c2 >= 32 && c2 <=35)
	 {
		c2_num = cards[8];
	 }
	 else if(c2 >= 36 && c2 <=39)
	 {
		c2_num = cards[9];
	 }
	 else if(c2 >= 40 && c2 <=43)
	 {
		c2_num = cards[10];
	 }
	 else if(c2 >= 43 && c2 <=47)
	 {
		c2_num = cards[11];
	 }
	 else if(c2 >= 48 && c2 <=51)
	 {
		c2_num = cards[12];
	 }
	 
	if(c2 % 4 == 0)
	 {
		c2_suit = suits[0];
	 }
	 
	 else if(c2 % 4 == 1)
	 {
		c2_suit = suits[1];
	 }
	 
	 else if(c2 % 4 == 2)
	 {
		c2_suit = suits[2];
	 }
	 
	 else if(c2 % 4 == 3)
	 {
		c2_suit = suits[3];
	 }

	 System.out.println("Your 1st card is: " +c1_num +" of " +c1_suit);
	 System.out.println("Your 2nd card is: " +c2_num +" of " +c2_suit);

 }
 }
   

  