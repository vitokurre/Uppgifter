public class Extrauppgift2{
  public static void main(String[] args){

  IncomeKlass object1 = new IncomeKlass ();
  IncomeKlass object2 = new IncomeKlass ();

  object1.income = 10;
  object2.income = 10;
  object2.income = object1.income + object2.income;

  System.out.println(object1.income + " " + object2.income);

  }
}



/*
Skapa en klass Som innehåller en int variabel income. Skapa sedan en till
klass med din main metod som skapar två instanser av objekt av den tidigare
klassen object1 och object2. I object1 ska du ändra värdet på variabeln
income till 10 och sen ska du addera värdet av income i object1 och object2
och lägga in på nytt i object2.income. Skriv sedan ut båda versionerna av
income i terminalen.
*/
