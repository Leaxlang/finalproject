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
   * - Puzzle 3: Tic-Tac-Toe ✔
   * - Final game
   * - Epilogue
   * - Skeleton of the script (all the print statements) ✔
   */

  //main method
  public static void main(String[] args){

    if(args.length != 0 && args[0].equals("-help")) {
      displayHelp();
    }
    finalGame();

    Title();
    String playerName = Prologue();
    TextSequene1(playerName);

  }

  public static void displayHelp() {
    Scanner input = new Scanner(System.in);
    System.out.println("Follow instructions for each mini game to escape the"
                    + "haunted house. To quit game while playing, press: "
                    + "Ctrl + C");
    pause(2000);
    System.out.println("Press Enter to exit help menu!");
    input.nextLine();
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
    ASCIImap();
    return name;
  }

  public static void TextSequene1(String name){
    Scanner input = new Scanner(System.in);

    System.out.println("");
    System.out.println(name + " looks up at the mirror covered in dirt, and "
                        + "notices something(or someone) is writing on it. ");
    System.out.println("They open the vanity and find a paper and a pen.");
    pause(2000);
    System.out.println("Are you going to: ");
    System.out.println("1. Try and copy down the words?");
    System.out.println("2. Use a pen to pick the lock?");

    int playerChoice = input.nextInt();

    if(playerChoice == 2){
      System.out.println("You pick the lock and open the door to find yourself "
                        + "faced at the edge of a cliff; back inside! ");
      pause(2000);
      TextSequene1(name);
    }else if(playerChoice == 1){
      System.out.println("Correct Choice, " + name + " won't mess up! ");
      Typing(name);
    }
    else{
      TextSequene1(name);
    }
  }

  //Puzzle 1: Typing Game
  public static void Typing(String name){
    Scanner input = new Scanner(System.in);

      //creating random characters
      char ch1 = (char)('a' + (Math.random() * ('z' - 'a' + 1)));
      char ch2 = (char)('A' + (Math.random() * ('Z' - 'A' + 1)));
      char ch3 = (char)('a' + (Math.random() * ('z' - 'a' + 1)));
      char ch4 = (char)('A' + (Math.random() * ('Z' - 'A' + 1)));

      //making a "word" from the random characters
      String word = "" + ch1 + ch2 + ch3 + ch4;

      //Asking the user to type the "word"
      System.out.println("Copy down the following: " + word );

      String userInput = input.next();

      //giving the user feedback; depending if they typed the word right
      if (userInput.equals(word)){
        System.out.println("Perhaps we've been too easy on you...");
        TextSequene2();
      }else if (userInput.equalsIgnoreCase(word)){
        System.out.println("Never been to grade school? Mind the case!");
        Typing(name);
      }else{
        System.out.println("Your future is looking dim... try again");
        Typing(name);
      }
  }
  public static void TextSequene2(){
    System.out.println("The door creaks open, you enter the living room. "
                      + "It is pitchblack.");
    pause(2000);
    System.out.println("The voice returns: ' A home owner should  know how to "
                      + "do some basic math.' ");
    pause(2000);
    Mathgame();
  }


  //Puzzle 2: MathGame
  public static void Mathgame(){
    Scanner input = new Scanner(System.in);
    //generate random numbers + operator
    int num1 = (int)(Math.random()*(100-5+1)+1);
    int num2 = (int)(Math.random()*(50-6+1)+6);
    String operator = (new Random().nextInt() < 0) ? "*" : "/";
    //calculate the result
    double result = (operator.equals("*"))? num1*num2 : (double)num1/num2;
    result = Math.round(result*100.0)/100.0;

    //get the users answer
    System.out.println("What is the answer? (2 decimal places)");
    System.out.println(num1 + " " + operator + " " +  num2);
    double userInput = input.nextDouble();

    //check the users answer and give feedback
    if (userInput == result){
      System.out.println("Im impressed, the last guy wasn't so lucky..."
                        + "lights on please!");
        TextSequene3();

    }else{
      System.out.println("Our ghost hiring budget is tight, ill give you"
                        + " another chance");
      Mathgame();
    }
  }
  public static void TextSequene3(){
    Scanner input = new Scanner(System.in);
    System.out.println("Ah yes! The light turns on, you see a rocking chair and"
                      + " the Queen of England is sitting on it !!!");
    pause(2000);
    System.out.println("");
    while(true){
      System.out.println("What will you say?");
      pause(500);
      System.out.println("1. oy Im bri'ish too!");
      System.out.println("2. USA USA USA!");
      int choice = input.nextInt();
      if(choice == 1){
        System.out.println("I don't think you are. I challenge you to TicTacToe!");
        TicTacToe();
      }else if(choice == 2){
        System.out.println("LET'S FIGHT AND SEE WHO'S BETTER! TIC-TAC-TOE!");
        TicTacToe();
      }else{
        System.out.println("I didn't hear you can you repeat that?");
      }
    }
  }

  //Puzzle 3: TicTacToe
  public static void TicTacToe(){

    Scanner input = new Scanner(System.in);
    //creating array as the  field
    String[] board = {"1","2","3","4","5","6","7","8","9"};


    while(checkBoard(board) == "GOING"){
      printBoard(board);

      if(checkBoard(board) != "WIN"){
        System.out.println("Type the number where you want to set your symbol:");
        int choosenField = input.nextInt();
        if((board[choosenField-1] == "X")||(board[choosenField-1]=="O")){
          System.out.println("This field has already been claimed.");
          choosenField = input.nextInt();
        }

        board[choosenField-1] = "X";
        printBoard(board);

      }
      while(true){

        int randomNumber = (int)(Math.random()*(8)+1);
        if (board[randomNumber] != "X" &&  board[randomNumber] != "O"){
          board[randomNumber] = "O";
          if(checkBoard(board)!="WIN"){
            System.out.print("let me think");
            pause(500);System.out.print(".");
            pause(500);System.out.print(".");
            pause(500);System.out.println(".");
          }
          break;
        }else{
          randomNumber = (int)(Math.random()*(8)+1);
        }

      }

    }

  }
  //method to print the tictactoe board
  public static void printBoard(String[] board){
    System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
    System.out.println("----------");
    System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
    System.out.println("----------");
    System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
  }

  //method to check the tictactoe board for wins
  public static String checkBoard(String[] board){
    int count = 0;
    //check eery String in the array to see if 'empty' spaces are left
    for(String s:board){
      if((s.equals("X"))||(s.equals("O"))){
        count++;
        if(count > 8){
          System.out.println("It's a draw");
          TicTacToe();
          return "DRAW";
        }
      }
    }
    //Execute if player has won
    if((board[0].equals("X") && board[1].equals("X") && board[2].equals("X")) ||
        (board[3].equals("X") && board[4].equals("X") && board[5].equals("X")) ||
        (board[6].equals("X") && board[7].equals("X") && board[8].equals("X")) ||
        (board[0].equals("X") && board[3].equals("X") && board[6].equals("X")) ||
        (board[1].equals("X") && board[4].equals("X") && board[7].equals("X")) ||
        (board[2].equals("X") && board[5].equals("X") && board[8].equals("X")) ||
        (board[0].equals("X") && board[4].equals("X") && board[8].equals("X")) ||
        (board[2].equals("X") && board[4].equals("X") && board[6].equals("X")) ){
          System.out.println("You won!");
          finalGame();
          return "WIN";

    }
    //Execute when computer has won
    else if((board[0].equals("O") && board[1].equals("O") && board[2].equals("O")) ||
                (board[3].equals("O") && board[4].equals("O") && board[5].equals("O")) ||
                (board[6].equals("O") && board[7].equals("O") && board[8].equals("O")) ||
                (board[0].equals("O") && board[3].equals("O") && board[6].equals("O")) ||
                (board[1].equals("O") && board[4].equals("O") && board[7].equals("O")) ||
                (board[2].equals("O") && board[5].equals("O") && board[8].equals("O")) ||
                (board[0].equals("O") && board[4].equals("O") && board[8].equals("O")) ||
                (board[2].equals("O") && board[4].equals("O") && board[6].equals("O"))){
                  printBoard(board);
                  System.out.println("You lost!");
                  GameOver();
                  return "LOSS";
      }
      //if there is no winner or a draw the game continues
      else{
        return "GOING";
      }
  }

  //Final Game
  public static void finalGame(){
    Scanner input = new Scanner(System.in);
    System.out.println("I have one final challenge for you.");
    pause(500);
    System.out.println("Rock-Paper-Scissors! Type your choice at 3.");
    pause(1000);
    System.out.println("1");pause(700);
    System.out.println("2");pause(700);
    System.out.println("3");
    String userChoice = input.nextLine();
    userChoice.toLowerCase();
    int userChoiceNum = 0;

    //transform user String into number (if possible)
    if(userChoice.equals("rock")){
      userChoiceNum = 0;
    }else if(userChoice.equals("paper")){
      userChoiceNum = 1;
    }else if(userChoice.equals("scissors")){
      userChoiceNum = 2;
    }else{
      System.out.println(userChoice + " is not part of 'Rock 'Paper' 'Scissors'. Again.");
      finalGame();
    }

    //random choice for computer
    int rand = (int)(Math.random() * 3);

    //evalute both choices against each other
    if(((rand == 0 )&&(userChoiceNum == 0)) ||
       ((rand == 1 )&&(userChoiceNum == 1)) ||
       ((rand == 2 )&&(userChoiceNum == 2))){
        System.out.println("We tied. Again.");
        pause(2000);
        finalGame();

    }else if(((rand == 0 )&&(userChoiceNum == 2)) ||
             ((rand == 1 )&&(userChoiceNum == 0)) ||
             ((rand == 2 )&&(userChoiceNum == 1))){
        System.out.println("I won!");
        pause(2000);
        System.out.println("");
        NotQuite();
        
    }else if(((rand == 0 )&&(userChoiceNum == 1)) ||
             ((rand == 1 )&&(userChoiceNum == 2)) ||
             ((rand == 2 )&&(userChoiceNum == 0))){
        System.out.println("You won :(");
        pause(2000);
        System.out.println("");
        Epilogue(userChoice);
     }

      
  }

  //Epilogue
  public static void Epilogue(String name){

    System.out.println("Suddenly you hear the tall front door creak open...");
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
    EndText();
    System.exit(0);
  }

  public static void GameOver() {

    pause(2000);
    System.out.println("You look up and the Queen of England is gone. The empty"
                      + " chair creaks and you can only hear your breath. You "
                      + "blink, suddenly there's light and music in the house."
                      + "You hear people talking at the dining table and walk "
                      + "over, recognizing a voice. *Realization* ");
    pause(2000);
    System.out.println("It's the ghost you've been hearing this whole time.");
    Ghost();
    pause(2000);
    System.out.println("Shi-");
    GameOverText();
    System.exit(0);
  }

  public static void NotQuite() {

    pause(2000);
    System.out.println(" 'It's a shame!' you hear booming through the walls.'We "
                      + "will have to call HR to start your on-boarding process."
                      + " Can I get you a coffee?' ");
    pause(2000);
    Ghost();
    GameOverText();
    System.exit(0);

  }

   public static void pause(long milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch (InterruptedException ie) {}
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

  public static void Title(){
    System.out.println("▓█████   ██████  ▄████▄   ▄▄▄       ██▓███  ▓█████    ");
    System.out.println("▓█   ▀ ▒██    ▒ ▒██▀ ▀█  ▒████▄    ▓██░  ██▒▓█   ▀    ");
    System.out.println("▒███   ░ ▓██▄   ▒▓█    ▄ ▒██  ▀█▄  ▓██░ ██▓▒▒███      ");
    System.out.println("▒▓█  ▄   ▒   ██▒▒▓▓▄ ▄██▒░██▄▄▄▄██ ▒██▄█▓▒ ▒▒▓█  ▄    ");
    System.out.println("░▒████▒▒██████▒▒▒ ▓███▀ ░ ▓█   ▓██▒▒██▒ ░  ░░▒████▒   ");
    System.out.println("░░ ▒░ ░▒ ▒▓▒ ▒ ░░ ░▒ ▒  ░ ▒▒   ▓▒█░▒▓▒░ ░  ░░░ ▒░ ░   ");
    System.out.println(" ░ ░  ░░ ░▒  ░ ░  ░  ▒     ▒   ▒▒ ░░▒ ░      ░ ░  ░   ");
    System.out.println("   ░   ░  ░  ░  ░          ░   ▒   ░░          ░      ");
    System.out.println("   ░  ░      ░  ░ ░            ░  ░            ░  ░   ");
    System.out.println("");
    System.out.println(" ██░ ██  ▒█████   █    ██   ██████ ▓█████             ");
    System.out.println("▓██░ ██▒▒██▒  ██▒ ██  ▓██▒▒██    ▒ ▓█   ▀             ");
    System.out.println("▒██▀▀██░▒██░  ██▒▓██  ▒██░░ ▓██▄   ▒███               ");
    System.out.println("░▓█ ░██ ▒██   ██░▓▓█  ░██░  ▒   ██▒▒▓█  ▄             ");
    System.out.println("░▓█▒░██▓░ ████▓▒░▒▒█████▓ ▒██████▒▒░▒████▒            ");
    System.out.println(" ▒ ░░▒░▒░ ▒░▒░▒░ ░▒▓▒ ▒ ▒ ▒ ▒▓▒ ▒ ░░░ ▒░ ░            ");
    System.out.println(" ▒ ░▒░ ░  ░ ▒ ▒░ ░░▒░ ░ ░ ░ ░▒  ░ ░ ░ ░  ░            ");
    System.out.println(" ░  ░░ ░░ ░ ░ ▒   ░░░ ░ ░ ░  ░  ░     ░               ");
    System.out.println(" ░  ░  ░    ░ ░     ░           ░     ░  ░           ");
    System.out.println("");
  }
  public static void GameOverText(){
  System.out.println("  ▄▀  ██   █▀▄▀█ ▄███▄       ████▄     ▄   ▄███▄   █▄▄▄▄ ");
  System.out.println("▄▀    █ █  █ █ █ █▀   ▀      █   █      █  █▀   ▀  █  ▄▀ ");
  System.out.println("█ ▀▄  █▄▄█ █ ▄ █ ██▄▄        █   █ █     █ ██▄▄    █▀▀▌  ");
  System.out.println("█   █ █  █ █   █ █▄   ▄▀     ▀████  █    █ █▄   ▄▀ █  █  ");
  System.out.println(" ███     █    █  ▀███▀               █  █  ▀███▀     █   ");
  System.out.println("    █    ▀                            ██             ▀    ");
  System.out.println("    ▀                                  █                 ");
  }


  public static void EndText(){
    System.out.println(".-') _    ('-. .-.   ('-.           ('-.       .-') _  _ .-') _       ");
    System.out.println("(  OO) )  ( OO )  / _(  OO)        _(  OO)     ( OO ) )( (  OO) )       ");
    System.out.println("/     '._ ,--. ,--.(,------.      (,------.,--./ ,--,'  |     .'_       ");
    System.out.println("|'--...__)|  | |  | |  .---'       |  .---'|   | |  ||  ,`'--..._)      ");
    System.out.println("'--.  .--'|   .|  | |  |           |  |    |    ||  | ) |  |   | |'      ");
    System.out.println("   |  |   |       |(|  '--.       (|  '--. |  .     |/  |  |   ' |      ");
    System.out.println("   |  |   |  .-.  | |  .--'        |  .--' |  ||    |   |  |   / :      ");
    System.out.println("   |  |   |  | |  | |  `---.       |  `---.|  | |   |   |  '--'  /      ");
    System.out.println("   `--'   `--' `--' `------'       `------'`--'  `--'   `-------'       ");
    System.out.println("");
  }


  public static void Ghost(){
  System.out.println("  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⡤⠖⠒⠛⠛⠛⠛⠛⠓⠶⢤⣄⡀⠀⠀⠀⠀⠀");
  System.out.println("⠀⠀⠀⠀⠀⢀⣠⡶⠞⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠷⣄⡀⠀⠀⠀ ");
  System.out.println("⠀⠀⠀⣠⡴⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣄⠀   ");
  System.out.println("⠀⢀⡼⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣧⠀  ");
  System.out.println("⠀⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣄⠀⠀⠀⠀⠈⣇  ");
  System.out.println("⢸⠃⠀⠀⠀⠀⣴⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣧⠀⠀⠀⠀⢹  ");
  System.out.println("⣿⠀⠀⠀⠀⣸⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⡆⠀⠀⠀⢸  ");
  System.out.println("⣿⠀⠀⠀⠀⢿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⡿⠃⠀⠀⠀⢸  ");
  System.out.println("⢿⠀⠀⠀⠀⠘⢿⣿⠟⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠓⠤⠀⠀⠀⠀⠀⣼  ");
  System.out.println("⢸⡄⠀⠀⠀⠀⠀⠀⠊⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠇  ");
  System.out.println("⠀⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠋⠀   ");
  System.out.println("⠀⠈⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⠀⠀⠀");
  System.out.println("⠀⠀⠈⠻⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠶⠋⠀⠀⠀⠀⠀");
  System.out.println("⠀⠀⠀⠀⠀⠉⠓⠒⠶⣤⡀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠐⠻⢧⡀⠀⠀⠀⠀⠀⠀");
  System.out.println("⠀⠀⠀⠀⠀⠀⢀⣤⠖⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢷⡀⠀⠀⠀⠀");
  System.out.println("⠀⠀⠀⠀⢀⡴⠋⠀⢀⣀⡠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢦⠀⠀⠙⣄⠀⠀⠀");
  System.out.println("⠀⠀⠀⠀⠘⠛⠚⠛⢹⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣷⣤⣀⣸⡆⠀⠀");
  System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠈⠁⠀⠀⠀");
  System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠇⠀⠀⠀⠀⠀⠀");
  System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠋⠀⠀⠀⠀⠀⠀⠀");
  System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢦⣄⣀⠀⠀⠀⠀⠀⠀⠀⣴⠇⠀⠀⠀⠀⠀⠀⠀⠀");
  System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠳⢤⡀⠀⠀⠀⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀");
  System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠞⠛⢆⠀⣠⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀");
  System.out.println("                ⠘⢷⣄⣤⠶⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
  System.out.println("");
}
}
