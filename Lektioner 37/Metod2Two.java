import java.util.Scanner;
public class Metod2Two {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Please, insert three numbers and I shall multiply the first two and then add the third number to the total");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    calculator(a, b, c);

  }

  public static void calculator(int x, int y, int z) {
    int sum = x*y;
    sum = sum + z;
    System.out.println("The sum of al three numbers are: " + sum);

  }
}

/*
Skriv en metod som tar 3 argument. Metoden ska multiplicera de två första argumenten och
sen addera det tredje och skriva ut i terminalen

*/
