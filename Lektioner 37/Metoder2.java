import java.util.Scanner;
public class Metoder2 {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Skriv in tre olika tal som du vill mutiplicera med 2");

    int number = sc.nextInt();
      multiplyByTwo(number);

    number = sc.nextInt();
      multiplyByTwo(number);

    number = sc.nextInt();
      multiplyByTwo(number);

  }

  public static void multiplyByTwo(int x) {
    System.out.println(x*2);
  }
}

/*
1. Skriv en metod som multiplicerar ett tal med ett argument och skriver ut i terminalen. Kalla
på metoden 3 gånger med olika värden i argumentet.
Tips: ett argument är något man matar in i en metod t.ex
Deklarering: public static void minMetod(int number){
// KOD
}
Användning: minMetod(25);
I detta fallet är number vårt argument 25, men går också att mata in en variabel.
*/
