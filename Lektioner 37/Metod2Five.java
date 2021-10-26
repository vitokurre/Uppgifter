import java.util.Scanner;
public class Metod2Five {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Välkommen till FizzBuzz. Det här programmet skriver en FizzBuzz-talserie, men du bestämmer dess längd.");
    System.out.println("Vilket tal skall vi räkna upp till först? Du får pröva 3 ggr sen stängs programmet!");

    try {
      int argument1 = sc.nextInt();
      fizzBuzz(argument1);
      int argument2 = sc.nextInt();
      fizzBuzz(argument2);
      int argument3 = sc.nextInt();
      fizzBuzz(argument3);

    } catch(Exception e) {
      System.out.println("Du måste skriva in ett tal för att programmet skall funka!");
      System.out.println(e);
    }
  }

    public static void fizzBuzz(int n){

      for(int i = 1; i <=n; ++i) {

        if (i % 3 == 0 && i % 5 == 0) {
          System.out.println("FizzBuzz");
        }

        else if (i % 3 == 0) {
          System.out.println("Fizz");
        }

        else if (i % 5 == 0) {
          System.out.println("Buzz");
        }

        else {
          System.out.println(i);
        }
      }
    }

}

/*
(Överkurs) Skriv fizzbuzz programmet i form av en metod som tar ett argument. Argumentet
ska vara talet som fizzbuzz ska räkna upp till. Testa med lika olika argument!
Fizzbuzz
*/
