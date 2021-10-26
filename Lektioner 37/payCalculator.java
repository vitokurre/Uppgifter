import java.util.Scanner;
public class payCalculator {
  public static void main(String[] args) {
    driveProgram();
  }
  public static void driveProgram(){
    System.out.println("Hello and welcome to Salary Calculator 2000");
    System.out.println("With this program you may caluculate how much you pay of your monthly salary in tax.");
    System.out.println(" ");

    while (true) {
      System.out.println("Make a new calculation press 1");
      System.out.println("To end the program press 2");
      System.out.println(" ");
      double menu = userInput();

      if (menu == 1) {
        System.out.println(" ");
        System.out.println(" ");
        calculateTax();
      }
      else if (menu == 2) {
        System.out.println(" ");
        System.out.println(" Ending program.... ");
        System.out.println(" Program closed ");
        break;
      }
      else {
        System.out.println(" ");
      }
    }
  }
  public static double userInput() {
    double number = -1;
    while (true) {
      Scanner sc = new Scanner(System.in);
      try {
        number = sc.nextDouble();
        if (number >= 0) {
          break;
        }
      }
      catch(Exception e) {
        System.out.println(" ");
        System.out.println("Error: you must insert correct number");
        System.out.println("Please try again");
        System.out.println(" ");
      }
    }
    return(number);
  }
  public static void calculateTax() {
    System.out.println("How much is your monthly salary?");
    System.out.println(" ");
    double salary = userInput();
    double salaryBrutto = salary;
    double tax = 0;

    if (salary >= 100000) {
      tax =  salary * 0.4 ;
    }
    else {
      tax = salary * 0.3;
    }
    salary = salaryBrutto - tax;
    System.out.println(" ");
    System.out.println("Your monthly salary is: " + salaryBrutto + " sek.");
    System.out.println(" ");
    System.out.println("The tax you pay is calculated to: " + tax + " sek.");
    System.out.println(" ");
    System.out.println("After tax your income is calculated to " + salary + " sek.");
    System.out.println(" ");
  }
}

/*

• Skriv en metod calculateTax som räknar ut hur mycket skatt du måste betala på
din lön.
• Om du tjänar över 100 000 så är skattenivån 40% (multiplicera med 0.4)
• Annars är skattenivån 30% (multiplicera med 0.3)
• Argument:
• Bruttolönen.
• Exempel: 30 000
• Returnerar:
• Värdet som skall betalas i skatt.
• Exempel: 12 000
• (OBS, talen kan vara decimaltal!)





*/
