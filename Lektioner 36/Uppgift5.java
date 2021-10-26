import java.util.Scanner;
public class Uppgift5 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Well hello there, what is your name?");

    String name = sc.nextLine();

    System.out.println("Cool, and what is your age if I may ask");

    int age = sc.nextInt();

    System.out.println("And the last question, what is your favorite colour?");

    sc.nextLine();

    String colour = sc.nextLine();

    System.out.println("Your name is " + name + ". Your age is " + age + ". And your favorite colour is " + colour + ". Nice to meet you!");
  }
}


//Skapa ett program som frågar användaren efter deras namn, ålder och
//favoritfärg. Detta ska sedan skrivas ut på ett trevligt sätt i terminalen.
