public class Ovn1EmployeeMain {
  public static void main(String[] args){
    Employee e1 = new Employee("Andreas", 200, 1, 10);
    Employee e2 = new Employee("Andreas", 300, 1, 10);
    Employee e3 = new Employee("Andreas", 500, 1, 10);
    Employee e4 = new Employee("Andreas", 600, 1, 10);
    //Employee e2 = new Employee();

  /*  e1.name = "Andreas";
    e1.cost = 200;
    e1.incomeGeneration = 10;
    e1.taskSpeed = 1;


    e2.name = "Kurt";
    e2.cost = 200;
    e2.incomeGeneration = 1000;
    e2.taskSpeed = 1;
*/
    e1.getIncomeRatio();
    System.out.println(" ");
    e2.getIncomeRatio();
    System.out.println(" ");
    e3.getIncomeRatio();
    System.out.println(" ");
    e4.getIncomeRatio();
    System.out.println(" ");

/*
   e2.getIncomeRatio();
    e1.completeTask();
    e1.getIncomeRatio();
    e1.oneHour(5, 3);
    e1.oneHour(1, 0);
    e1.getIncomeRatio();
  */
  //  e1.hours(6, 2, 0);

  //  for(int i = 0; i <=50; i++){

    //    e1.hours(i, 1, 1000);





    //  }
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
