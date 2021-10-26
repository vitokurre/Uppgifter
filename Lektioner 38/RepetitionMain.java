public class RepetitionMain {
  public static void main(String[] args) {

    System.out.println("Nu skall programmet skapa ett objekt av en klass, därefter skall den returnera summan av 15 och 35 vilket blir:");
    Calculation calculator = new Calculation();
    int sum = calculator.Add15and35();
    System.out.println(sum);

    System.out.println("Nu skall programmet be användare om ett tal som den skall multiplicera med 10");
    System.out.println("Detta gör vi genom att skapa ett objekt av samm klass vi använde innan MEN med en annan metod.");

    sum = calculator.MultiplyByTen();
    System.out.println("Produkten blir:");
    System.out.println(sum);


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
