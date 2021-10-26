public class Konstruktorkedja{
  public static void main(String[] args){

    Dog Hund1 = new Dog("Kaiser", true);

    Dog Hund2 = new Dog("Fridolf", true);

    Dog Hund3 = new Dog("Kajan", true);


    System.out.println("This dog name is " + Hund1.name);
    System.out.println("This dog name is " + Hund2.name);
    System.out.println("This dog name is " + Hund3.name);


  }
}




/*
Konstruktorkedja
Skapa en klass Dog.
Denna klassen ska ha 2 variabler String name och boolean cute.
Det ska finnas två konstruktorer med samma namn.
• En ska bara ta ett argument name, då ska den sätta cute till ett defaultvärde false;
• Den andra ska ta båda argumenten.
*/
