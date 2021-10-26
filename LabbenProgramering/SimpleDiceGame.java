import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class SimpleDiceGame {
  public static void main(String[] args){




   runGameMenu();    // <----- denna funktion/metod skall starta programmet från main

  }
  public static String userStringInput(){
      Scanner sc = new Scanner(System.in);
      String temporaryString = sc.nextLine();
      return temporaryString;
    }
  public static int userIntInput(){
    Scanner sc = new Scanner(System.in);
    int temporaryInt = -2;
    while (temporaryInt < 1 ) {
      try{
        temporaryInt= sc.nextInt();
        if (temporaryInt >= 1){
          break;
        }
          }
      catch(Exception e) {
      //System.out.println("Skriv in ett positivt tal ");
      }
    }
    return temporaryInt;
  }
  public static void runGameMenu(){


   System.out.println(" ");
   System.out.println("Welome to the Simple Dice Game");
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
  public static void runOrderGame(){

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

    ArrayList<Player> Players =  initialize(numberOfPlayers, numberOfDices, diceSize);

  System.out.println(" ");
  System.out.println("Let's start the game");


  for(int i = 1; i <=5; i++){

      System.out.println(" ");
      System.out.println("ROUND " + counter);
      counter = counter + 1;
        takeTurn(Players);
  }
  Players = getWinners(Players);

  System.out.println("Sista delen att lösa");


  System.out.println(" ");
  System.out.println(" Här är listan på vinnare ");
   for(int i = 0; i < Players.size(); i++){
     System.out.println(Players.get(i).name + " fick totalt " + Players.get(i).points + " poäng!");   //    <--- fungerande forloop som printar ut alla namnen i ordningen
    }
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

    for(int i = 0; i < Players.size(); i++)
      System.out.println(Players.get(i).name);
  }




System.out.println(" ");
System.out.println("***********************************");
System.out.println(" ");
  runGameMenu();

  }
  public static ArrayList<Player> initialize(int numberOfP, int numberOfD, int diceS) {
  //---> Skall initialisera spelet genom att ta emot användarinput och skapa alla instanser
  //som behövs, samt en lista av spelare som sedan returneras. GLÖM EJ ATT RETURNERA EN ARRAYLIST, JUST NU ÄR DEN SATT SOM VOID
  //public static ArrayList<Player> initialize()

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
    //  System.out.println("Lägg till tärningar test " + counter);
      counter = counter + 1;
      for(int j = 1; j <= numberOfDices; j++){
        Players.get(i).addDie(diceSize);
        //Players.get(i).rollDice();
      }
    }
  return Players;
 }
  public static void takeTurn(ArrayList<Player> playersList){

    ArrayList<Player> Players = playersList;

  //  System.out.println("Prövar att skriva ut namnen");
  //  for(int i = 0; i < Players.size(); i++){
  //  System.out.println(Players.get(i).name);
//    }

      for(int j = 0; j < Players.size(); j++){  // <--- denna forloop rullar genom varje spelares runda.

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
          System.out.println("The right total dice value was: "+ rightNumber);
          System.out.println(" ");
       }
      }
  } // <--- takeTurn slutmåsvinge
  public static ArrayList<Player> getWinners(ArrayList<Player> playersList){

      ArrayList<Player> Players = playersList;
      ArrayList<Player> ScoreList = new ArrayList<Player>();
      ArrayList<Player> Winners = new ArrayList<Player>();

      for(int i = 0; i < Players.size(); i++){
        System.out.println(Players.get(i).name + " fick totalt " + Players.get(i).points + " poäng!");   //    <--- fungerande forloop som printar ut alla namnen i ordningen
       }
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
      //  System.out.println("högsta poäng är: "+highestScore);
        System.out.println("*Sorterar*");
        for(int i = 0; i < ScoreList.size(); i++){             // <--- denna listan lägger till spelarna med högst poäng i listan winners
          if(ScoreList.get(i).points == highestScore && highestScore !=0){
            Winners.add(ScoreList.get(i));
          //  System.out.println("Lägger till "+ ScoreList.get(i).name+ " i listan med winnare");
          }
        }
      //  System.out.println("Skriver ut listan med spelare sortetat på poäng");
        for(int i = 0; i < ScoreList.size(); i++){
          System.out.println(ScoreList.get(i).name + " fick totalt " + ScoreList.get(i).points + " poäng!");   //    <--- fungerande forloop som printar ut alla namnen i ordningen
         }


// vad gör jag nu? Ja jag har nu en sorterad lista. Nu behöver jag plocka ut vinnarna, kanske lägga till dem i en ny lista och sedan skickar den till runOrderGame


    return Winners;
  }     // <---- slutet på måsvinge för getwinners

}
