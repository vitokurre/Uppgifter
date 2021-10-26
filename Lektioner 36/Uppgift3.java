import java.util.Scanner;
public class Uppgift3 {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);


    System.out.println("Give me any number and I shall multiply it with 2");

    int number = sc.nextInt();

    number = number * 2;

    System.out.println("I give you " + number);

  }
}
