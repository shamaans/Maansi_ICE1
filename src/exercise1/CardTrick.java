package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * hii this maansi
 *that is funny fetch and merge
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            int randomSuit =random.nextInt(4);
            String suit = suits[randomSuit];
            
            int randomCard = random.nextInt(13);
            String card = cards[randomCard];
            
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            hand [i]=card;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the value of your card (1-13): ");
        int value = scanner.nextInt();
        System.out.print("Please enter the suit of your card (1-4): ");
        int suit = scanner.nextInt();
        String card = value + " of " + suit;
        boolean found = false;
        for(Card c: hand) {
            if(c.equals(card)) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("Your card was found!");
            printInfo();
        } else {
            System.out.println("Your card was not found!");
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Maansi Sharma, but you can call me Maansi ");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active in collge activities");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Driving");
        System.out.println("-- Cooking");
        System.out.println("-- Reading");
        System.out.println("-- Travelling");

        System.out.println();
        
    
    }

}
