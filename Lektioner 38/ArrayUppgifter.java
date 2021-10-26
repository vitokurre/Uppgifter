public class ArrayUppgifter {
  public static void main(String[] args){

    int[] testArray = createArray(6);
    int[] nummer1 = {1, 3, 4, 6};
    doubleUpArray(nummer1);
    printArray(testArray);

    //System.out.println(testArray[5]); detta är en rad om man vill skriva ut en enskild låda
  }
  public static int[] createArray(int x){
    int[] arr = new int[x];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    //uppgift 1 och 2
    return arr;
  }

  public static void printArray(int[] metodArr){
    for(int i = 0; i < metodArr.length; i++) {
    //  System.out.print(metodArr[i]+" ");
      //uppgift 1 och 2
    }
  }
  public static int[] doubleUpArray(int[] arr){
        int size = arr.length * 2;
        int[] test = new int[size];
        for(int i = 0; i < size; i++) {
        test[i] = arr[i];
         System.out.println(test[i]);
       }

  return arr;

  }
}


/*

En metod, createArray(int x) som returnerar en array med alla värden från 1 till x.
ex. createArray(3) ska returnera en array: 1, 2, 3


. En metod, doubleUpArray(int[] arr) som returnerar en ny array med dubbelt så
många platser. Det som fanns i den ursprungliga arrayen skall ligga i första halvan av
den nya arrayen.

*/
