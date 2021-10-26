import java.util.Scanner;
public class ExtraUpp1Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    ExtraUpp1Klass objekt = new ExtraUpp1Klass();

    System.out.println("Hello!");
    System.out.println("I'm gonna ask you some questions about your pet");
    System.out.println("What kind of pet do you have?");

    objekt.kindOfPet = sc.nextLine();

    System.out.println("What's your pets name?");

    objekt.petName = sc.nextLine();

    System.out.println("How old are "+objekt.petName + "?");

    objekt.age = sc.nextInt();

    System.out.println("And what does your pet " + objekt.petName +" eat?");

    objekt.colour = sc.nextLine();

    System.out.println("Thank You");
    System.out.println("Your pets name is " + objekt.petName + " and he/she is a " + objekt.kindOfPet + ".");
    System.out.println(objekt.petName + " is " + objekt.age + " years old and is a " + objekt.colour + " " + objekt.kindOfPet);
  }
}
