import java.util.Scanner;
public class Overloading1 {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int a;
    int b;
    int c;
    int d;
    int sum;

    System.out.println("Skriv in två tal");
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println("summan blir: ");
    sum = add(a, b);
    System.out.println(sum);
    System.out.println(" ");


    System.out.println("Skriv in tre tal");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    System.out.println("summan blir: ");
    sum = add(a, b, c);
    System.out.println(sum);
    System.out.println(" ");


    System.out.println("Skriv in fyra tal");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();
    System.out.println("summan blir: ");
    sum = add(a, b, c, d);
    System.out.println(sum);
  }
  public static int add(int a, int b){
    int sum = a + b;

    return sum;

  }
  public static int add(int a, int b, int c){
    int sum = a + b + c;

    return sum;
  }
  public static int add(int a, int b, int c, int d){
    int sum = a + b + c + d;

    return sum;
  }

}


/*

Method overloading (en fil)
skriv en metod add() som kan ta 2-4 argument.
• Om det är 2 argument ska den addera ihop dom.
• Om det är 3 argument ska den addera ihop dom.
• Om det är 4 argument ska den addera ihop dom.
Alla versioner ska returnera resultatet av additionen

*/
