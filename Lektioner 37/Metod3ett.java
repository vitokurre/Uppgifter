import java.util.Scanner;
public class Metod3ett {
  public static void main(String[] args) {

  int number = getNumber("HUr gammal är du?");
  number = multiplyBTen(number);

  String name = userText("Vilket är ditt favoritdjur?");


  System.out.println(number);
  System.out.println(name);

    }

    public static int getNumber(String prompt) {

      int x = 0;
      while (true) {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        x = sc.nextInt();
        }
        catch(Exception e) {
          System.out.println("Du måste skriva ett tal");
          System.out.println("Se felmeddelande:");
          System.out.println(e);
        }
        if (x >= 1){
          break;
        }
    }
    return(x);
  }

  public static int multiplyBTen(int x){


    x = x*10;
    return(x);
  }
  public static String userText(String prompt){

    Scanner sc = new Scanner(System.in);
    System.out.println(prompt);
    String name = sc.nextLine();

    return (name);

  }

}









/*
    //System.out.println(Add());
    int number = userInput();

    System.out.println(multiplyBTen(number));

  }


  /*public static int Add() {

    int a = 15;
    int b = 35;

    int sum = a + b;

    return (sum);

  }

  public static int multiplyBTen(int x){


    x = x*10;
    return(x);
  }

  public static int userInput();

  int number = 0;

  while (number < 1 ) {
    try {
    Scanner sc = new Scanner(System.in);
    System.out.println("Var god skriv in ett tal");
    number = sc.nextInt();
    }
    catch(Exception e) {
      System.out.println("Du måste skriva ett tal");
      System.out.println("Se felmeddelande:");
      System.out.println(e);
    }

  return(number);
  }



/* Metoder – kombinera allt
Dessa uppgifter bygger på varandra så ni kommer bara ha en fil för hela denna uppgiften. Överkurs
för tillfället men gör gärna ett försök!
1. Dela upp Return uppgift 2 i 2 metoder. En som Tar emot användarens int(se till att ha med
try and catch i denna) och en som multiplicerar talet med 10 och skriver ut i terminalen.
Testa så att båda metoderna fungerar.
2. Bygg vidare på Kombinera allt uppgift 1 och lägg till en metod som frågar efter en String
denna gången och sparar i en String variabel. Gör din main metod tom och lägg sedan in
metoderna som frågar efter en int och String och spara i två variabler, skriv sedan ut dessa i
terminalen.
3. I din int metod kan du nu lägga in ett argument, detta argumentet ska vara texten som
användaren ska ta emot innan den ska skriva in sin int i terminalen
4. I din String metod kan du nu lägga in ett argument, detta argumentet ska vara texten som
användaren ska ta emot innan den ska skriva in sin egna text i terminalen.
5. I din main metod kan du nu skapa ett program som med hjälp av dina metoder frågar efter
användarens favoritdjur och ålder och skriver sen ut i terminalen.
*/
