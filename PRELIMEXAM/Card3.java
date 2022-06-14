package PRELIMEXAM;

import java.util.Random;

public class Card3 {
    private final Rank rank; 
    private final Suit suit;
    
    public Card3(Rank rank2, Suit suit) { 
        this.rank = (Rank) rank2;
        this.suit = suit;
    }
    
    public Suit getSuit() {
     
    
    return suit;
    }
    
    public Rank getRank() { 
        return rank;
    }
    
    public String toString() { 
        return rank + " of " + suit;
    }
    }
    