public class DogsMain{
  public static void main(String[] args){

    DogsKlass Dog1 = new DogsKlass("schäfer", "Exina", 10, 17);
    Dog1.printSats();
    DogsKlass Dog2 = new DogsKlass("västgötaspets", "Bamse", 1, 11);
    Dog2.printSats();
    DogsKlass Dog3 = new DogsKlass("tax", "Storm", 4, 19);
    Dog3.printSats();
    DogsKlass Dog4 = new DogsKlass("labrodour", "Nelly", 12, 5);
    Dog4.printSats();
  }
}

/*

3. Skapa en ny klass Dog som har 4 olika instansvariabler String breed, String name, int age, int
speed. Skapa sen en konstruktor för att sätta värdet till dessa 4 instansvariablerna. Skapa 4
objekt för 4 olika hundar.
4. Skriv en instansmetod i Dog klassen som heter printStats() som skriver ut This dog is named
 +name+ an is a  + breed + , it is  + age +  years old and has a top speed of  + speed
5. Använd nu printStats() för alla hundar!
*/
