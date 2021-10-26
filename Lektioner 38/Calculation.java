import java.util.Scanner;
public class Calculation {
  public static int Add15and35() {
    int value1 = 15;
    int value2 = 35;
    int sum = value1 + value2;
    return sum;
  }
  public static int MultiplyByTen() {
    Scanner sc = new Scanner(System.in);
    int sum = sc.nextInt() * 10;
    return sum;
  }
}

/*1. Skriv en metod som deklarerar två ints med värdena 15 och 35. Addera sedan dessa
variabler och returnera resultatet. Denna metod ska skapas i en klass som inte
innehåller din main metod. testa sedan att använda denna metoden genom att skapa
ett objekt av klassen.
2. Skriv en metod som frågar användaren efter en siffra och multiplicerar den med 10.
Retunera sedan resultatet. Denna metod ska skapas i en klass som inte innehåller
din main metod. testa sedan att använda denna metod genom att skapa ett objekt av
klassen.
*/
