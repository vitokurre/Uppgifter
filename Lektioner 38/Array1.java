public class Array1 {
  public static void main(String[] args){

    int[] testArray = createArray(12);

    int[] uppGift3 = {2, 3, 5, 7};
    int[] uppGift3returned = doubleUpArray(uppGift3);
  //  printArray(uppGift3returned);

    int[] nummer1= {1, 3, 4, 6};
    int[] nummer2 = nummer1;
    printArray(nummer1);
    printArray(nummer2);
    nummer2[0] = 100;
    printArray(nummer1);
    printArray(nummer2);

  //  printArray(testArray);

    //System.out.println(testArray[5]); detta är en rad om man vill skriva ut en enskild låda
  }
  public static int[] createArray(int x){
    int[] arr = new int[x];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    return arr;
  }

  public static void printArray(int[] metodArr){
    for(int i = 0; i < metodArr.length; i++) {
      System.out.print(metodArr[i]+" ");
    }
  }
  public static int[] doubleUpArray(int[] arr) {
    int size = arr.length*2;
    int[] nyArr = new int[size];

    for(int i = 0; i < arr.length; i++) {
      nyArr[i] = arr[i];
    }
    return nyArr;
  }
}


/*

En metod, createArray(int x) som returnerar en array med alla värden från 1 till x.
ex. createArray(3) ska returnera en array: 1, 2, 3


. En metod, doubleUpArray(int[] arr) som returnerar en ny array med dubbelt så
många platser. Det som fanns i den ursprungliga arrayen skall ligga i första halvan av
den nya arrayen.

*/
