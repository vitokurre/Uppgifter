import java.util.Scanner;
import java.util.ArrayList;
public class SimpleDiceGame {
  public static void main(String[] args){
   runGameMenu();
   // Lab 1, MT21, IT-Högskolan,
   // Marcus Davidsson
   // 2021-10-08

   // Kommentar: Jag fick viss hjälp/input av Jacob och Liban(Liban var min labbpartner, dock gjorde vi labbarna enskilt).
   // Försökte skriva en sortmetod till arraylistan men fattade inte riktigt hur den fungera. Så jag löste den på mitt eget vis.
  }
  public static String userStringInput(){
    Scanner sc = new Scanner(System.in);
    String temporaryString = sc.nextLine();
    return temporaryString;
  }
  public static int userIntInput(){
    Scanner sc = new Scanner(System.in);
    int temporaryInt = sc.nextInt();
    return temporaryInt;
  }

  public static void runGameMenu() {
    System.out.println(" ");
    System.out.println("WELCOME TO SIMPLE DICE GAME");
    System.out.println(" ");
    System.out.println("Type in 1 to start a new game");
    System.out.println("Type in 2 to quit");
    int gameOn = 0;
    while (gameOn != 2 || gameOn != 1) {
      try{
        gameOn = userIntInput();
        if(gameOn == 2) {
          break;
        }
        else if(gameOn == 1){
          break;
        }
      }
      catch(Exception e) {
        System.out.println("Use 1, or 2 to navigate" + e);
      }

    }
    if (gameOn == 1) {
      System.out.println("");
      System.out.println("*Setting up a new game*");

      runOrderGame();
    }
    else {
      System.out.println("");
      System.out.println("Ending game");
      System.out.println("");
    }
  }

  public static void runOrderGame() {
    int numberOfPlayers;
    int numberOfDices;
    int diceSize;
    int counter = 1;
    System.out.println("Please type in number of players");
    numberOfPlayers = userIntInput();
    System.out.println(" ");
    System.out.println("How many dices do you want to use?");
    numberOfDices = userIntInput();
    System.out.println(" ");
    System.out.println("Which size of the dice do you want to use?");
    diceSize = userIntInput();
    ArrayList<Player> Players = initialize(numberOfPlayers, numberOfDices, diceSize);
    System.out.println(" ");
    System.out.println("Let's start the game");

    for(int i = 1; i <=5; i++){
      System.out.println(" ");
      System.out.println("ROUND " + counter);
      counter = counter + 1;
      takeTurn(Players);
    }
    Players = getWinners(Players);
    System.out.println("***********************************");
    System.out.println(" ");
    int firstPlaceInArrayList = 0;

    if(Players.size() == 1){
      System.out.println("***CONGRATULATIONS***");
      System.out.println("The winner is " + Players.get(0).name + " with a total score of " + Players.get(0).points + " points!");
    }
    else if(Players.size() > 1){
      System.out.println("***CONGRATULATIONS***");
      System.out.println("The winners with the highest total score of " + Players.get(0).points + " points are: ");

      for(int i = 0; i < Players.size(); i++) {
        System.out.print(Players.get(i).name+", ");
      }
      System.out.println(" ");
    }
    System.out.println(" ");
    System.out.println("***********************************");
    System.out.println(" ");
    runGameMenu();
  }
  public static ArrayList<Player> initialize(int numberOfP, int numberOfD, int diceS) {

    int numberOfPlayers = numberOfP;
    int numberOfDices = numberOfD;
    int diceSize = diceS;
    ArrayList<Player> Players = new ArrayList<Player>();
    int counter = 1;

    for(int i = 0; i < numberOfPlayers; i++){
      System.out.println(" ");
      System.out.println("What is the name of player nr: " + counter);
      Players.add(new Player(userStringInput()));
      counter = counter + 1;
    }
    counter = 1;
    for(int i = 0; i < Players.size(); i++) {
      counter = counter + 1;
      for(int j = 1; j <= numberOfDices; j++){
        Players.get(i).addDie(diceSize);
      }
    }
    return Players;
  }

  public static void takeTurn(ArrayList<Player> playersList){
    ArrayList<Player> Players = playersList;

    for(int j = 0; j < Players.size(); j++){
      System.out.println(Players.get(j).name + ", it's your turn!");
      System.out.println("What is the total dice value?");
      System.out.println("Make a guess!");
      System.out.println(" ");
      Players.get(j).rollDice();
      int rightNumber = Players.get(j).getDieValue();
      int guess = userIntInput();

      if (guess == rightNumber){
        Players.get(j).increaseScore();
        System.out.println("BINGO");
        System.out.println("Your score is: "+ Players.get(j).points + " points!");
        System.out.println(" ");
      }
      else{
        System.out.println("WRONG");
        System.out.println("The right value was: "+ rightNumber);
        System.out.println(" ");
      }
    }
  }

  public static ArrayList<Player> getWinners(ArrayList<Player> playersList){
    ArrayList<Player> Players = playersList;
    ArrayList<Player> ScoreList = new ArrayList<Player>();
    ArrayList<Player> Winners = new ArrayList<Player>();
    int counter = 5;
    for(int j = 0; j <=5; j++) {
      for(int i = 0; i < Players.size(); i++){
        if (Players.get(i).points == counter){
          ScoreList.add(Players.get(i));
        }
      }
      counter = counter -1;
    }
    if(ScoreList.get(0).points == 0){
      System.out.println("***********************************");
      System.out.println("THERE WHERE NO WINNERS THIS GAME");
      System.out.println("Better luck next time");
    }
    int highestScore = ScoreList.get(0).points;

    for(int i = 0; i < ScoreList.size(); i++){
      if(ScoreList.get(i).points == highestScore && highestScore !=0){
        Winners.add(ScoreList.get(i));
      }
    }
    return Winners;
  }
}
