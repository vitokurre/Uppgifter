public class Employee {

  String name;
  float cost;
  int taskSpeed;
  float incomeRatio;
  float incomeGeneration;

  public Employee(String n, float cos, int taskSpee, float incomeGeneratio){

  name = n;
  cost = cos;
  taskSpeed = taskSpee;
  incomeGeneration = incomeGeneratio;

  }

  public void getIncomeRatio(){
    completeTask();
    incomeRatio = incomeGeneration/cost;
    System.out.println(name + " genrerar "+ incomeRatio+ " ggr sin lön för företaget");
  }
  public void completeTask(){
    incomeGeneration = incomeGeneration + 3;

  }
  public void oneHour(int speedIncrease, float costIncrease) {

    cost = cost + costIncrease;

    for(int i = 1; i <= taskSpeed; i++) {
      completeTask();
    }
    taskSpeed = taskSpeed + speedIncrease;
    //public
  }
  public void hours(int time, int speedIncrease, float costIncrease) {


    for(int i = 1; i <= time; i++) {
      oneHour(speedIncrease, costIncrease);
    }
    getIncomeRatio();
  }

}



/*

Skapa en sista instansmetod hours(int time, int speedIncrease, float costIncrease) som kör
oneHour() så många gånger som du specifierar med time variabeln(for loop passar bra för detta).
Efter for loppen är klar kan ni kalla på getIncomeRatio() för att den i slutändan ska kolla om
den anställde har blivit lukrativ.



Skapa en ny instansmetod oneHour(int speedIncrease, float costIncrease) som ökar cost
med costIncrease och kör completeTask så många gånger som den hinner på en timma(dvs
är taskspeed 2 ska den köra 2 gånger). Den ska sedan öka taskSpeed med speedIncrease.



*/
