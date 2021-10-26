import java.util.Scanner;
public class ovaArrayMain {
  public static void main (String[] args) {

//  int[] sparaArray = createArray();
//  printArray(sparaArray);

//  sparaArray = doubleUpArray(sparaArray);
//  printArray(sparaArray);

    int [] sparaArray = checkArrayOvn4();
  // printArray(sparaArray);
  // sparaArray = bubbleSort(sparaArray);
  //  printArray(sparaArray);
  int big = biggestIntInArray(sparaArray);
  System.out.println(big);
  }
  public static int[] createArray() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Hur lång skall arrayen vara?");
    int lengthOfArray = sc.nextInt();
    System.out.println(" ");
    System.out.println("Skriv ut hela arrayen:");
    System.out.println(" ");
    int[] talArray = new int [lengthOfArray];
      for(int i = 0; i < lengthOfArray; i++){
        talArray[i] = i + 1;
        System.out.println(talArray[i]);
      }
    return talArray;
  }
  public static void printArray(int[] sparaArray) {
    System.out.println(" ");
    System.out.println("Nu använder vi en metod för att skriva ut en array:");
    for(int i = 0; i < sparaArray.length; i++){
      System.out.print(sparaArray[i]+ ", ");
    }

  }
  public static int[] doubleUpArray(int[] arrayArgument) {
    System.out.println("Nu skall vi dubbla en array");
    int size = arrayArgument.length*2;
    int[] nyArray = new int[size];
    for(int i = 0; i < arrayArgument.length; i++) {
      nyArray[i] = arrayArgument[i];
    }
    return nyArray;
  }
  public static int[] checkArrayOvn4() {
    int[] nummer1 = {1, 23, 4, 6, 213, 34, 35, 46, 767, 67, 0 ,214, 2, 74, 8, 9};
    //int[] nummer2 = nummer1;
    //nummer2 [0] = 100;
    //printArray(nummer1);
    //printArray(nummer2);
    //System.out.println("Den här metoden är till för att förstå att arrayer referar till samma värden, tillksilnnad från en int som behåller ett nytt tilldelat värde");
    //System.out.println("array nummer1's längd är: " + nummer1.length);
    //System.out.println("array nummer1's dubbla längds är: " + nummer1.length*2);
    return nummer1;
  }
  public static int[]  bubbleSort(int[] arrayAttSortera) {
    int [] sorteradArray = arrayAttSortera;
    int temp;
    for(int i = 0; i < sorteradArray.length-1; i++) {
      for(int j = i; j < sorteradArray.length-1; j++) {
        if(sorteradArray[j] > sorteradArray[j+1]){
          temp = sorteradArray[j];
          sorteradArray[j] = sorteradArray[j+1];
          sorteradArray[j+1] = temp;
        }
      }
    }
    return sorteradArray;
  }
  public static int biggestIntInArray(int[] findBiggestValue){

    int big = 0;
    for(int i = 0; i < findBiggestValue.length-1; i++){
      if(big<findBiggestValue[i]){
        big = findBiggestValue[i];
      }
    }

  //System.out.println(big);
  return big;
  }
}
/*
6. (överkurs) Skriv en metod biggestIntInArray(int[] arr) som letar upp den största inten i
en array och skriver ut den i terminalen.



5. (överkurs) Skriv en metod bubbleSort(int[] arr) som tar en array av ints som argument
och returnerar en array av int men dom ska nu vara sorterade efter storlek. använd
er tidigare metod printArray(int[] arr) för att se om din funktion fungerar.
*/
/*
1. En metod, createArray(int x) som returnerar en array med alla värden från 1 till x.
ex. createArray(3) ska returnera en array: 1, 2, 3
2. En metod, printArray(int[] arr) som skriver ut en array på formatet [1,2,3].
3. En metod, doubleUpArray(int[] arr) som returnerar en ny array med dubbelt så
många platser. Det som fanns i den ursprungliga arrayen skall ligga i första halvan av
den nya arrayen.
4. I denna uppgift ska ni skapa en array int [] nummer1 = {1, 3, 4, 6}. och en array
int[] nummer2 = nummer1.
Använd sedan printArray() som ni skrev tidigare för att kolla innehållet i dessa två
arrays. Gör sedan ändringen nummer2[0]=100;
Använd printArray() på båda arraysen igen. vad blir det för resultat? varför då?
5. (överkurs) Skriv en metod bubbleSort(int[] arr) som tar en array av ints som argument
och returnerar en array av int men dom ska nu vara sorterade efter storlek. använd
er tidigare metod printArray(int[] arr) för att se om din funktion fungerar.
6. (överkurs) Skriv en metod biggestIntInArray(int[] arr) som letar upp den största inten i
en array och skriver ut den i terminalen.
7. Skriv en metod combineArrays(int[] arr1, int[] arr2) som kombinerar två lika långa
arrays. Den ska väva de två arraysen och returnera den vävda arrayen. om arraysen
inte är lika långa ska man få ett felmeddelande.
Exempel:
arr1 = {1, 1, 1}
arr2 = {2, 2, 2}
input: combineArrays(arr1, arr2)
returns: {1, 2, 1, 2, 1, 2}

*/
