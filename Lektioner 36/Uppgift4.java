import java.util.Scanner;
public class Uppgift4 {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
      System.out.println("Please insert 3 different (or same) numbers and I shall give you the sum of them:");

      int number1 = sc.nextInt();
      int number2 = sc.nextInt();
      int number3 = sc.nextInt();

      int sum = number1 + number2 + number3;

      System.out.println("The sum of your numbers is: " + sum);
  }
}
