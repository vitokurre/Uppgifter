public class Dog{

  public static String  name;
  boolean cute;

  public Dog(String name){
    this.name = name;
    cute = false;
  }
  public Dog(String name, boolean c){
    this.name = name;
    cute = c;
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
