package game_management;
import java.util.*;

public class Game {

  public void startGame() {
    Deck deck = new Deck();
    deck.shuffle();
    // deck.printDeck();
    getPlayerName();
    
  }


  // public void alternatePlayer() {
    
  // }

  public String getPlayerName() {
    Scanner nameInput = new Scanner(System.in);
    System.out.print("Enter Player Name: ");
    String name = nameInput.nextLine();
    return name;
  }


}