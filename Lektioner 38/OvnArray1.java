import java.util.Scanner;
public class OvnArray1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Bestäm längden på arrayen:");

    int[] minArray = new int[sc.nextInt()]; //skapar en array och deklarerar att den heter minArray, låter sedan användare bestämma hur många platser den har

    System.out.println("Skriv in på plats 0 i arrayen:");

    minArray[0] = sc.nextInt();

    System.out.println("Skriv ut sista talet:");

    minArray[minArray.length-1] = sc.nextInt();
    
    System.out.println(minArray[minArray.length-1]);

    System.out.println("nu loopar vi ut hela arrayen");

    for(int i = 0; i < minArray.length; i++){
      System.out.println(minArray[i]);
    }


  }
}
