import java.util.*;

public class projectcode{

   /*
   * TASKS:
   * - command line -help
   * - storage of name ✔
   * - Prologue ✔
   * - ASCII map of house
   * - Puzzle 1: Typing Game ✔
   * - Puzzle 2: Mathgame ✔
   * - Puzzle 3: Tic-Tac-Toe ✔
   * - Final game
   * - Epilogue
   * - Skeleton of the script (all the print statements)
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
    

    System.out.println(name + " is bored of your everyday life, so you decide to buy a house "
                          + "in the country.");
    pause(2000);
    System.out.println("When " + name + " arrives, the house looks different than it"
                          + " was on the website, looks scary and dark.");
    pause(2000);
    System.out.println(name +" goes inside anyway,"
                          + " but as soon as you step in a cold breeze goes over his back "
                          + "and a couple seconds later all the doors and windows close.");
    pause(2000);
    System.out.println("The ghost appear and tell Bob that he has to prove he are worthy"
                          + " to still live, else he will become one of them to haunt the "
                          + "house for all eternity");
    return name;
  }

  //method for the map
  public static void ASCIImap(){

  }
  public static void TextSequene1(String name){
    Scanner input = new Scanner(System.in);

    System.out.println("");
    System.out.println(name + " looks up at the mirror covered in dirt, and notices something"
                          + "(or someone) is writing in it. He opens the vanity and finds a paper and a pen.");
    System.out.println("Are you going to ");
    System.out.println("1. Try copy down the words?");
    System.out.println("2.Use a pen to pick the lock?");

    int playerChoice = input.nextInt();

    if(playerChoice == 2){
      System.out.println("You open the door but the door opens to the edge of a cliff. You have to go back inside ");
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

      //Asking the user to type the "word"
      System.out.println("Type in the following: " + word );

      String userInput = input.next();

      //giving the user feedback; depending if they typed the word right
      if (userInput.equals(word)){
        System.out.println("You got it!");
        TextSequene2();
      }else if (userInput.equalsIgnoreCase(word)){
        System.out.println("Almost, mind the case.");
        Typing();
      }else{
        System.out.println("Wrong!");
        Typing();
      }
  }
  public static void TextSequene2(){
    System.out.println("The door creaks open, you enter the living room. It is pitchblack.");
    System.out.println("A voice says: Are you smart enough?");
  }

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
      System.out.println("Good job!");

    }else{
      System.out.println("Wrong!");
      TextSequene3();
    }
  }
  public static void TextSequene3(){
    Scanner input = new Scanner(System.in);
    System.out.println("Ah yes! The light turns on, you see a rocking chair and the Queen of England sitting on it.");
    System.out.println("What will you say?");
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

  }
   
   public static void pause(long milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch (InterruptedException ie) {}
  }

}
