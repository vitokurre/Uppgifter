public class DogsKlass{

  String breed;
  String name;
  int age;
  int speed;



  public DogsKlass(String breed, String name, int age, int speed){

    this.breed = breed;
    this.name = name;
    this.age = age;
    this.speed = speed;
  }
  public void printSats() {
    System.out.println("This dog is named " + name + " and is a " + breed + ", it is " + age + " years old and has a top speed of " + speed + "km/h.");
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
