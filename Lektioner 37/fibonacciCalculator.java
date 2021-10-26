import java.util.Scanner;
public class fibonacciCalculator{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int counter = 0;
    int n = sc.nextInt();
    int a = 1;
    int b = 1;
    int c = 2;
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");

    for(int i = 1; i <=n; ++i){

      counter ++;
      System.out.println(counter);
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);

      for(int y = 1; y < 2; ++y){

        a = b + c;
        b = c + a;
        c = a + b;




      }
    }
  }
}


/*
Skriv en rekursiv som skriver ut n nummer av Fibonacci-serien. Om du
vill kan du också skriva en metod som kallar på denna metod och skriver ut
en bestämd längd av serien.
• Rekursiv metod: En metod som kallar på sig själv. Den slutar kalla på sig
själv när ett särskilt värde uppnåtts.
• Fibonacci-serie: Varje ny siffra är summan av de två tidigare:
1,1,2,3,5,8,13,21,…
• Exempel:
Om du kallar på metoden fibonacci(6);
Så skall resultatet vara 8.
*/
