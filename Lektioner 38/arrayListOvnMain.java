import java.util.ArrayList;
import java.util.Scanner;
public class arrayListOvnMain {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    /*
    ArrayList<String> carList = new ArrayList<String>();

    carList.add("Volvo");
    carList.add("Opel");
    carList.add("Toyota");
    carList.add("Saab");

    carList.remove(0);
    carList.remove("Opel");
    System.out.println(carList);
    String car = carList.get(1);
    System.out.println(car);

    ArrayList<String> animalList = new ArrayList<String>();

    animalList.add("ape");
    animalList.add("monkey");
    animalList.add("gorilla");
    animalList.add("gaboon");
    animalList.add(sc.nextLine());

    System.out.println(animalList);
    String djur = animalList.get(2);
    System.out.println(djur);
    */
    ArrayListKLass objekt1 = new ArrayListKLass();
    ArrayListKLass objekt2 = new ArrayListKLass();
    ArrayListKLass objekt3 = new ArrayListKLass();

    ArrayList<ArrayListKLass> objektlist = new ArrayList<ArrayListKLass>();

    objektlist.add(objekt1);
    objektlist.add(objekt2);
    objektlist.add(objekt3);

    System.out.println(objektlist);

  }
}
/*


1. Skapa en String ArrayList som heter djur som innehåller 4 Strings med olika djur. Lägg till
dom genom att använda .add
2. Printa alla djur som finns i din djur ArrayList från uppgift 1
3. Printa djuret som ligger på index 2 i vår ArrayList
4. (svårare men kommer användas i labben) Skapa en separat tom klass. I din metod ska du
sedan skapa 3 objekt av denna klassen. Skapa sedan en arraylist som ska fyllas upp med
dessa objekt. Lägg sedan in objekten i ArrayListen. Om du sedan testar att printa arrayListen
kommer det bara vara gibberish men det ska vara så, jag förklarar varför under
genomgången!
Tips: det går att ge en klass som en *TYP* till vår array och på så sätt kan vi lagra objekt av
den klassen i vår ArrayList.

*/
