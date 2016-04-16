/** Jonathan Nelson Castillo. Oracle Certified Associate - Java SE 8 Programmer I NPower Canada. 
*   Java Game. In-Between Poker or Red-Dog Poker 
    Simple rule: Player's card should be in between the two cards you bet on.
	             If your card is the same, player would have the choice of betting higher or lower
	
*/

import java.util.Random;
import java.util.Scanner;
import java.lang.*;

public class Red_Dog{
	private static String choi,high_low,pa;
	private final Suit suit;
    private final Face face;
	enum Suit {
        CLUBS,SPADES,HEARTS,DIAMONDS
    }
    static final Suit[] SUITS = Suit.values();

    enum Face {
        ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING
    }
    static final Face[] FACES = Face.values();

    static final Random RAND = new Random();
public static Red_Dog random() {
        return new Red_Dog(SUITS[RAND.nextInt(SUITS.length)], 
                          FACES[RAND.nextInt(FACES.length)]);
    }

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        int lives = 3;
		int score = 0;
		do{
		
		Red_Dog c1 = Red_Dog.random();
        Red_Dog c2 = Red_Dog.random();
		Red_Dog player = Red_Dog.random();
		Face f1 = c1.face;
		Face f2 = c2.face;
		Face fp = player.face;
		while(c1.equals(c2))
		{
			c1 = Red_Dog.random();
			c2 = Red_Dog.random();
		}
		
        System.out.println("First card: "+c1 +  " \nSecond card: " + c2);
		System.out.print("Want to play?[Y/N]:");
		choi = input.next();
		 
		if(choi.equalsIgnoreCase("Y")){
			while(player.equals(c2) || player.equals(c1))
			{
				player = Red_Dog.random();
			}
			
			if(c1.face == c2.face){
				System.out.print("Higher or Lower[H/L]:");
				high_low = input.next();
				System.out.println("Player card: "+player);
				if(high_low.equalsIgnoreCase("H")){
					 if(fp.ordinal() == f1.ordinal()){
						lives--;
						System.out.println("You Lose!");
					}
					else if(fp.ordinal() > f1.ordinal()){
						score++;
						System.out.println("You Win!");
					}
					else if(fp.ordinal() < f1.ordinal()){
						lives--;
						System.out.println("You Lose!");
					}
					System.out.println("Score: "+score);
					System.out.println("Lives: "+lives);
				}
				if(high_low.equalsIgnoreCase("L")){
					if(fp.ordinal() == f1.ordinal()){
						lives--;
						System.out.println("You Lose!");
					}
					else if(fp.ordinal() < f1.ordinal()){
						score++;
						System.out.println("You Win!");
					}
					else if(fp.ordinal() > f1.ordinal())
					{
						lives--;
						System.out.println("You Lose!");
					}
				System.out.println("Score: "+score);
				System.out.println("Lives: "+lives +"\n");
				}
			}
			else if(c1.face != c2.face)
			{
				System.out.println("Player card: "+player);
				if(fp.ordinal() == f1.ordinal() || fp.ordinal() == f2.ordinal())
				  {
				  lives--;
				  System.out.println("You Lose! \n");
				  }
				if(fp.ordinal() > f1.ordinal() && fp.ordinal() > f2.ordinal())
				  {
				  lives--;
				  System.out.println("You Lose! \n");
				  }
				else if(fp.ordinal() < f1.ordinal() && fp.ordinal() < f2.ordinal())
				  {
				  lives--;
				  System.out.println("You Lose! \n");
				  }
				
				 
				 if(fp.ordinal() < f1.ordinal() && fp.ordinal() > f2.ordinal())
					{
					  score++;
					  System.out.println("You Win! \n");
					}
				else if(fp.ordinal() > f1.ordinal() && fp.ordinal() < f2.ordinal())
					{
					  score++;
					  System.out.println("You Win! \n");
					}
				System.out.println("Score: "+score);
				 System.out.println("Lives: "+lives +"\n");
				
			}
		}
		
	}while(lives>0);
}


public Red_Dog(Suit suit, Face face) 
	{
        this.suit = suit;
        this.face = face;
    }

@Override
public boolean equals(Object o) 
	{ 
        if (this == o) return true;
        Red_Dog Red_Dog = (Red_Dog) o;
        if (suit != Red_Dog.suit) return false;
        return face == Red_Dog.face;
    }
	
@Override
    public String toString() 
	{ 
		return face + " of " + suit;
    }
}
	
	
 
 
 
 

   

  