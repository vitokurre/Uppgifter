import java.util.Scanner;
public class repeteraArrayerMain{
  public static void main(String[] args){
    /*
    int[] sparaIntArray = createArray1();
    printIntArray(sparaIntArray);
    sparaIntArray = createArray2();
    System.out.println(" ");
    printIntArray(sparaIntArray);
    */
    String[] sparaGronsaker = gronsaksArray();
    printStringArray(sparaGronsaker);
  }
  /*
  public static void printIntArray(int[]arrayAttPrinta){
    for(int i = 0; i < arrayAttPrinta.length; i++) {
      System.out.print(arrayAttPrinta[i]+", ");
    }
  */
  public static void printStringArray(String[]arrayAttPrinta){
    for(int i = 0; i < arrayAttPrinta.length; i++) {
      System.out.print(arrayAttPrinta[i]+", ");
    }
  }
/*
  public static int[] createArray1() {
    int[] intArray = {1, 7, 2, 3, 4, 6, 5};
   return intArray;
 }
  public static int[] createArray2() {
    int[] intArray = new int[7];
    intArray[0] = 1;
    intArray[1] = 2;
    intArray[2] = 3;
    intArray[3] = 4;
    intArray[4] = 5;
    intArray[5] = 6;
    intArray[6] = 7;

    return intArray;
  */
  public static String[] gronsaksArray(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Hur lång skall grönsaksarrayen vara?");
    String[] listaMedGronsaker = new String[sc.nextInt()];
    System.out.println("Vilka grönsaker skall vi ha?");
    System.out.println(" ");
    sc.nextLine();

    for(int i = 0; i < listaMedGronsaker.length; i++) {
      listaMedGronsaker[i] = sc.nextLine();
    }
    return listaMedGronsaker;
  }
}
/*
Arrays
Syntax:
Skapa array kan göras på två sätt
1. int[] intArray = new int[längPåArray] ;
Detta skapar en array som är längdPåArray lång som är fylld med 0 i detta fallet, det går att
använda annat än int t.ex String, byte m.m. (testa gärna lite olika saker)
2. String[] grönsaker = {tomat, gurka, kål};
Detta skaper en array som innehåller tomat gurka och kål och då är den automatiskt 3 index
lång. Detta är bättre om man vill sätta in värden på en gång.
Använda Arrays (här står i för index det vill säga vilken plats i arrayen vi vill göra något med)
Sätt in värde: grönsaker[i] = 2;
Printa ett värde från en array: System.out.print(grönsaker[i]);
Ta reda på antalet värden i din array: grönsaker.length
Printa alla värden: Här används samma metod som ovan men man måste skapa
en loop som går igenom alla index Detta är en del av
övningen!
Uppgifter:
1. Skapa en String array som heter bilar som innehåller 4 Strings med olika bilmärken.
2. Printa vilken bil som finns på index 0 i din bilar array från uppgift 1.
3. Printa alla bilar som finns i din bilar array från uppgift 1. Tips: använd en loop!
4. Skapa en array countTo5 som är 5 index lång och kommer innehålla ints, använd metod ett
som beskriv i syntaxdelen. Fyll sedan denna array med 1 2 3 4 5 genom att använda en loop
Tips: tänk på att en array börjar räkna på sina index på 0 och inte 1!
5. Printa hela countTo5 arrayen som du skapade i uppgift 4. Det går att använda samma metod
som på uppgift 3.

*/
