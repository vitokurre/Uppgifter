import java.util.Scanner;
public class Metod2Three {
  public static void main(String[] args) {

    ask();

  }

  public static void calculator(int x, int y, int z) {
    int sum = x*y;
    sum = sum + z;
    System.out.println("The sum of al three numbers are: " + sum);

  }

  public static void ask(){

    Scanner sc = new Scanner(System.in);
    System.out.println("Please, insert three numbers and I shall multiply the first two and then add the third number to the total");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    calculator(a, b, c);

  }


}

/*
Skriv en metod som frågar användaren efter tre nummer som sedan matas in i metoden från
uppgift 2.

*/
