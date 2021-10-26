public class Metod2Four {
  public static void main(String[] args){

    int testPilot = 40;
    divideByFour(testPilot);
  }

  public static void divideByFour(int x) {

    System.out.println("Den här metoden delar ett tal med 4, vi kommer att sända in 40 i metoden");

    int number = x / 4;

    //System.out.println("Talet blir: " + number);
  }
}

/*Skriv en metod som dividerar ett argument med 4 och sparar resultatet i en variabel.
Försöka sedan nå denna variabeln från din main funktion(t.ex genom att försöka printa dne i
terminalen), fungerar det? om inte, varför inte?
*/
