import java.util.*;

public class projectcode{

   /*
   * TASKS:
   * - command line -help
   * - Prologue
   * - ASCII map of house
   * - Puzzle 1: Typing Game ✔
   * - Puzzle 2: Lightbulb
   * - Puzzle 3: Tic-Tac-Toe
   * - Final game
   * - Epilogue
   */

  //main method
  public static void main(String[] args){
      Typing();
  }
  //method to put the prologue in
  public static void Prologue(){

  }

  //method for the map
  public static void ASCIImap(){

  }

  //Puzzle 1: Typing Game
  public static void Typing(){

    Scanner input = new Scanner(System.in);

    //creating random characters
    char ch1 = (char)('a' + (Math.random() * ('z' - 'a' + 1)));
    char ch2 = (char)('A' + (Math.random() * ('Z' - 'A' + 1)));
    char ch3 = (char)('a' + (Math.random() * ('z' - 'a' + 1)));
    char ch4 = (char)('A' + (Math.random() * ('Z' - 'A' + 1)));

    //making a "word" from the random characters
    String word = "" + ch1 + ch2 + ch3 + ch4;

    //Asking the user to type the "word"
    System.out.println("Type in the following: " + word );

    String userInput = input.nextLine();

    //giving the user feedback; depending if he typed the word right
    if (userInput.equals(word)){
      System.out.println("You got it!");
    }else if (userInput.equalsIgnoreCase(word)){
      System.out.println("Almost, mind the case.");
      Typing();
    }else{
      System.out.println("Wrong!");
      Typing();
    }
    input.close();
  }

  //Puzzle 2: Lightbulb
  public static void Lightbulb(){

  }

  //Puzzle 3:
  public static void TicTacToe(){

  }

  //Final Game
  public static void finalGame(){

  }

  //Epilogue
  public static void Epilogue(){

  }

}
