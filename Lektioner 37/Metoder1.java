import java.util.Scanner;
public class Metoder1{
  public static void main(String[] args){

    for(int i = 1; i <=10; ++i) {
    printHelloWorld();
    }

    int a = 5;
    int b = 3;

    addNumbers(a,b);
    addNumbers(a,b);

    multiplyNumbers();
  }

  public static void printHelloWorld() {
    int i= 1;
    System.out.println(i +" Hello World");
    ++i;
  }

  public static void addNumbers(int x, int y) {
    System.out.println(x+y);
  }

  public static void multiplyNumbers() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Var god skriv in två tal");

    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("Efter en multiplikation av dina båda tal får vi:");
    System.out.println(" ");
    System.out.println(a*b);



  }
}

/*
1. Skriv en metod som skriver ut hello world i terminalen och kalla på den 10 gånger.
2. Skriv en metod som adderar två tal och skriver ut i terminalen, kalla på den 2 gånger.
3. Skriv en metod som frågar användaren efter två tal och multiplicerar ihop dom. Och skriver
ut i terminalen. Kalla på metoden 2 gånger.

*/
