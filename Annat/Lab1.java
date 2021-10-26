public class Lab1 {
  public static void main(String[] args){

    Lab1DieKlass dice = new Lab1DieKlass(7);

  }

}



/*
I den första uppgiften skall vi modellera en tärning med hjälp av en klass Die. Vi skall sedan använda
den här tärningsklassen för att skapa ett enkelt tärningsspel.
Tärningen skall ha två variabler: nuvarande värde och antal sidor (dvs max-värde för tärningen).
• Antal sidor skall sättas i klassens konstruktor. Skall vara av typen int.
• Nuvarande värde skall förändras när man kallar på roll()-metoden (se nedan). Skall vara av
typen int.
Tärningen skall också ha en privat klassvariabel (dvs statisk): en slumpgenerator.
• Slumpgeneratorn skall vara av typen Random och kommer att användas i vår roll()- metod.
Typen Random kan importeras från java.util.Random;.
o Det räcker med en kopia av Random-klassen som kan delas av alla instanser - det är
därför den här variabeln är static.
För att kunna använda klassen kommer vi att behöva en metod:
• public void roll();
o Den här metoden skall använda sig av slumpgeneratorn för att förändra tärningens
nuvarande värde.
o Tips: ni bör använda standardklassen Random för detta. Random har en metod
public int nextInt(int maxValue) som returnerar ett slumpmässigt heltal mellan 0
och (maxValue-1).

*/
