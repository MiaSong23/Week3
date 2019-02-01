/*
2019.1.30
 Mia Song
991492491

Practice
commnets add
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
       
      
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            int number = (int)(Math.random()*12) + 1;
            c.setValue(number);
            
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int index = (int)(Math.random())*3;
            c.setSuit(Card.SUITS[index]);
            
            magicHand[i]=c;
          
       
        }//for loop
        
     
        //
        Card luckyCard = new Card();
        
        
        //System.out.println();
        //System.out.println();
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number beween 0 and 13: ");
        int a = sc.nextInt();
        
        Card card = new Card();
        card.setValue(a);

        System.out.println("Please select card suit (Hearts, Diamonds, Spades, Clubs)");
        card.setSuit(sc.next());
        
        
        
        // and search magicHand here
        boolean b = false;
        for(Card c : magicHand){
            if(card.getSuit().toLowerCase().equals(c.getSuit().toLowerCase())&&card.getValue()==c.getValue()){
                b = true;   
            }
        }
//        // and search magicHand here
//        for(int i=0 ; i < magicHand.length; i++){
//            if(magicHand[i].getValue() == a)
//                System.out.println(magicHand[i].getSuit());
//        }
            
        //Then report the result here
        if(b){
             System.out.println("That matches");
        }else{
             System.out.println("That does not match");
        }
        
    }
    
}
