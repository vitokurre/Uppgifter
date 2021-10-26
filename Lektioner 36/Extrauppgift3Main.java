import java.util.Scanner;
public class Extrauppgift3Main{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int numberOfPeople = 1;

    PersonInformation object1 = new PersonInformation();
    PersonInformation object2 = new PersonInformation();
    PersonInformation object3 = new PersonInformation();
    PersonInformation object4 = new PersonInformation();

    while (numberOfPeople <= 4) {

      if(numberOfPeople == 1) {
        System.out.println("Please insert age for person nr " + numberOfPeople);
          object1.age = sc.nextInt();
        System.out.println("Please insert income for person nr " + numberOfPeople);
          object1.income = sc.nextInt();
          sc.nextLine();
        System.out.println("Please insert name for person nr " + numberOfPeople);
          object1.name = sc.nextLine();
        ++numberOfPeople;
      }

      else if(numberOfPeople == 2) {
        System.out.println("Please insert age for person nr " + numberOfPeople);
          object2.age = sc.nextInt();
        System.out.println("Please insert income for person nr " + numberOfPeople);
          object2.income = sc.nextInt();
          sc.nextLine();
        System.out.println("Please insert name for person nr " + numberOfPeople);
          object2.name = sc.nextLine();
        ++numberOfPeople;
      }


      else if(numberOfPeople == 3) {
        System.out.println("Please insert age for person nr " + numberOfPeople);
          object3.age = sc.nextInt();
        System.out.println("Please insert income for person nr " + numberOfPeople);
          object3.income = sc.nextInt();
          sc.nextLine();
        System.out.println("Please insert name for person nr " + numberOfPeople);
          object3.name = sc.nextLine();
        ++numberOfPeople;

      }

      else if(numberOfPeople == 4) {
        System.out.println("Please insert age for person nr " + numberOfPeople);
          object4.age = sc.nextInt();
        System.out.println("Please insert income for person nr " + numberOfPeople);
          object4.income = sc.nextInt();
          sc.nextLine();
        System.out.println("Please insert name for person nr " + numberOfPeople);
          object4.name = sc.nextLine();
        ++numberOfPeople;
      }




    }


      if(object1.income)
  System.out.println("Person nr 1:s age is "object1.age);
  System.out.println("Person nr 2:s age is "object2.age);
  System.out.println("Person nr 3:s age is "object3.age);
  System.out.println("Person nr 4:s age is "object4.age);
  }
}


/*
Skapa en klass som innehåller tre variabler en int age, en int income och en
String name. Skapa sedan en klass med din main metod. Denna ska fråga
användaren efter alla tre variabler och skapa en instans av objektet där det
lagras, gör detta för 4 personer.
Skriv sedan ut alla tre variabler i terminalen sorterat efter inkomst
Skriv sedan ut alla tre variabler i terminalen sorterat efter ålder
*/
