import java.util.Scanner;
public class Instansmetod2b {

  public static int multiply() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Hej, ge mig en siffra så skall jag multiplicera den med 10");

    int number = sc.nextInt();
    number = number * 10;

    return number;

  }


}



/*
Skriv en metod som frågar användaren efter en siffra och multiplicerar den med 10.
Retunera sedan resultatet. Denna metod ska skapas i en klass som inte innehåller
din main metod. testa sedan att använda denna metod genom att skapa ett objekt av
klassen.
*/
