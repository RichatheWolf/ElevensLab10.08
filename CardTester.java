
/**
 * This is a class that tests the Card class.
 *
 *  < Richa Limaye>
 *  < June 25th, 2024 >
 */

public class CardTester{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {
      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      
      Card nineSpade = new Card("nine", "spades", 9);
      
      System.out.println("**** Tests Card 2: queen of spades ****");
      System.out.println("  rank: " + nineSpade.rank());
      System.out.println("  suit: " + nineSpade.suit());
      System.out.println("  pointValue: " + nineSpade.pointValue());
      System.out.println("  toString: " + nineSpade.toString());
      System.out.println();

      // Test card 3
      
      Card fourClubs = new Card("four", "clubs", 4);
      
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + fourClubs.rank());
      System.out.println("  suit: " + fourClubs.suit());
      System.out.println("  pointValue: " + fourClubs.pointValue());
      System.out.println("  toString: " + fourClubs.toString());
      System.out.println();
      
   }
}
