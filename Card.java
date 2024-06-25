import org.jetbrains.annotations.NotNull;

/**
 * Card.java
 * Card represents a playing card.
 *
 *  < Your Name >
 *  < Today's Date >
 */

public class Card {

   private String suit;      // the suit of the card
   private String rank;      // the rank of the card
   private int pointValue;   // the point value of the card

    /**
    * Creates a new Card instance.
    *
    * @param cardRank  a String value
    *                  containing the rank of the card
    * @param cardSuit  a String value
    *                  containing the suit of the card
    * @param cardPointValue an int value
    *                  containing the point value of the card
    */
   public Card(String cardRank, String cardSuit, int cardPointValue) {
      rank = cardRank;
      suit = cardSuit;
      pointValue = cardPointValue;
   }
   
    public String suit() {
      return suit;
    }
    
   public String rank() {
      return rank;
   }
   
   public int pointValue() {
      return pointValue;
   }

   /** Compare this card with the argument.
    * @param otherCard the other card to compare to this
    * @return true if the rank, suit, and point value of this card
    *              are equal to those of the argument;
    *         false otherwise.
    */
   public boolean matches(@NotNull Card Card1, @NotNull Card otherCard){
      return Card1.rank.equals(otherCard.rank) && Card1.suit.equals(otherCard.suit) && Card1.pointValue == otherCard.pointValue;
   }

  
   @Override
   public String toString(){
      return rank + " of " + suit + " (point value = " + pointValue + ")";
   }
}
