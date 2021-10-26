import java.util.Scanner;
public class RepetetionArrList{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Hur många bilar vill du ha i din array?");
    String[] bilar = new String [sc.nextInt()];
    sc.nextLine();
    for(int i = 0; i < bilar.length; i++) {
      bilar[i] = sc.nextLine();
    }


    for(int i = 0; i < bilar.length; i++) {
        System.out.print(bilar[i]+", ");
        System.out.println(" ");  
    }
    int[] countTo5 = new int[5];
    int counter = 1;
    for(int i = 0; i < 5; i++){
    countTo5[i] = counter;
    counter++;
    }
    for (int i = 0; i < 5; i++) {
      System.out.println(countTo5[i]);
    }
  }
}


/*

1. Skapa en String array som heter bilar som innehåller 4 Strings med olika bilmärken.
2. Printa vilken bil som finns på index 0 i din bilar array från uppgift 1.
3. Printa alla bilar som finns i din bilar array från uppgift 1. Tips: använd en loop!
4. Skapa en array countTo5 som är 5 index lång och kommer innehålla ints, använd metod ett
som beskriv i syntaxdelen. Fyll sedan denna array med 1 2 3 4 5 genom att använda en loop
Tips: tänk på att en array börjar räkna på sina index på 0 och inte 1!
5. Printa hela countTo5 arrayen som du skapade i uppgift 4. Det går att använda samma metod
som på uppgift 3.

*/
