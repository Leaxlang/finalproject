import java.util.*;

public class projectcode{

   /*
   * TASKS:
   * - command line -help ✔
   * - storage of name ✔
   * - Prologue ✔
   * - ASCII map of house ✔
   * - Puzzle 1: Typing Game ✔
   * - Puzzle 2: Mathgame ✔
   * - Puzzle 3: Tic-Tac-Toe
   * - Final game
   * - Epilogue
   * - Skeleton of the script (all the print statements) ✔
   */


  //main method
  public static void main(String[] args){
    String playerName = Prologue();
    ASCIImap();
    TextSequene1(playerName);
    Typing();
    TicTacToe();

  }
  //method to put the prologue in
  public static String Prologue(){
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = input.nextLine();


    System.out.println(name + " is bored of your everyday life, so they decide"
                        + " to buy a house "
                        + "in the country.");
    pause(2000);
    System.out.println("When " + name + " arrives, the house looks different"
                        + " than it did on Zillow...");
    pause(2000);
    System.out.println(name +" decides to check it out, but as soon as they"
                        + " step inside a cold breeze hits them "
                        + "and all the windows and doors slam shut!");
    pause(2000);
    System.out.println(name + " hears a voice: In order to make it out of here "
                          + "alive, you must prove your wit! Or you will haunt "
                          + "this house for all eternity");
    return name;
  }

  //method for the map
   public static void ASCIImap(){
    // Print the roof of the house
    System.out.println("   /\\");
    System.out.println("  /  \\");
    System.out.println(" /    \\");

    // Print the walls of the house
    System.out.println("+------+");
    System.out.println("|      |");
    System.out.println("|      |");

    // Print the foundation of the house
    System.out.println("+------+");
  }
 }

 if(args.length != 0 && args[0].equals("-help")) {
   displayHelp();
 }

public static void displayHelp() {
    System.out.println("Follow instructions for each mini game to escape the"
                    + "haunted house. To quit game while playing, press: "
                    + "Ctrl + C");
    pause(2000);
    System.out.println("Press Enter to exit help menu!")
}

  public static void TextSequene1(String name){
    Scanner input = new Scanner(System.in);

    System.out.println("");
    System.out.println(name + " looks up at the mirror covered in dirt, and "
                        + "notices something(or someone) is writing on it. "
                        + "They open the vanity and find a paper and a pen.");
    pause(2000);
    System.out.println("Are you going to: ");
    System.out.println("1. Try and copy down the words?");
    System.out.println("2.Use a pen to pick the lock?");

    int playerChoice = input.nextInt();

    if(playerChoice == 2){
      System.out.println("You pick the lock and open the door to find yourself "
                        + "faced at the edge of a cliff; back inside! ");
      pause(2000);
      TextSequene1(name);
    }else if(playerChoice == 1){
      Typing();
    }
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

      System.out.println("Correct Choice, " + name + "don't mess up! ");

      //Asking the user to type the "word"
      System.out.println("Copy down the following: " + word );

      String userInput = input.next();

      //giving the user feedback; depending if they typed the word right
      if (userInput.equals(word)){
        System.out.println("Perhaps we've been too easy on you...");
        TextSequene2();
      }else if (userInput.equalsIgnoreCase(word)){
        System.out.println("Never been to grade school? Mind the case!");
        Typing();
      }else{
        System.out.println("Your future is looking dim... try again");
        Typing();
      }
  }
  public static void TextSequene2(){
    System.out.println("The door creaks open, you enter the living room. "
                      + "It is pitchblack.");
    pause(2000);
    System.out.println("The voice returns: ' A home owner should  know how to "
                      + "do some basic math.' ");
  }
  pause(2000);

  //Puzzle 2: MathGame
  public static void Mathgame(){
    Scanner input = new Scanner(System.in);
    //generate random numbers + operator
    int num1 = (int)(Math.random()*(100-5+1)+1);
    int num2 = (int)(Math.random()*(50-6+1)+6);
    String operator = (new Random().nextInt() < 0) ? "*" : "/";
    //calculate the result
    int result = (operator.equals("*"))? num1*num2 : num1/num2;
    //get the users answer
    System.out.println("What is the answer?");
    System.out.println(num1 + " " + operator + " " +  num2);
    int userInput = input.nextInt();
    //check the users answer and give feedback
    if (userInput == result){
      System.out.println("Im impressed, the last guy wasn't so lucky...");

    }else{
      System.out.println("Our ghost hiring budget is tight, ill give you"
                        + " another chance");
      TextSequene3();
    }
  }
  public static void TextSequene3(){
    Scanner input = new Scanner(System.in);
    System.out.println("Ah yes! The light turns on, you see a rocking chair and"
                      + " the Queen of England is sitting on it !!!");
    pause(2000);
    System.out.println("What will you say?");
    pause(2000);
    System.out.println("1. oy Im bri'ish too!");
    System.out.println("2. USA USA USA!");
    int choice = input.nextInt();
    if(choice == 1){

    }else{

    }
  }

  //Puzzle 3: TicTacToe
  public static void TicTacToe(){
  }

  //Final Game
  public static void finalGame(){
      System.out.println("Final game"); //just here for test purposes
  }

  //Epilogue
  public static void Epilogue(){

    System.out.println("Suddenly you hear the tall front door creak open...")
    System.out.println("The spirits announce: You have outwitted us! Which "
                      + "makes you too smart to spend the afterlife "
                      + "haunting people. ");
    pause(2000);
    System.out.println(name + " steps into the outside world. The sun shines a "
                      + "little too brightly; it's a shame, that house was "
                      + "starting to feel like a home");
    pause(2000);
    System.out.println("Suddenly a fresh new idea hits you...");
    pause(2000);
    System.out.println("What if people paid to do this! Something like "
                        + name + "'s Escape Rooms!");
    pause(3000);
    System.out.println("THE END")

  }

   public static void pause(long milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch (InterruptedException ie) {}
  }

}
