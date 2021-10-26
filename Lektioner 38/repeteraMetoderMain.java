import java.util.Scanner;
public class repeteraMetoderMain{
  public static void main (String[] args){

  /*int investering = 23000;
  float vinst = 0.07f;
  */
  float slutsumma = stonks(askForInt(), askForFloat());
  System.out.println(slutsumma);

  //int nyttTal = askForInt();
  //System.out.println(nyttTal);

  //float nyFloat = askForFloat();
  //System.out.println(nyFloat);
  }
  public static float stonks(int x, float y){
    float vinst = x * y;
    return vinst;
  }
  public static int askForInt(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Skriv in en int");
    int userNumber = sc.nextInt();
    return userNumber;
  }
  public static float askForFloat(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Skriv in ett decimaltal");
    float nyFloat = sc.nextFloat();
    return nyFloat;
  }
}


/*



4. Använd askForFloat() och askForInt för att be användaren om de variabler som ska matas in i
stonks();
Glöm inte testa varje uppgift
*/
