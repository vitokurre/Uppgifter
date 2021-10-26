import java.util.Scanner;

public class Hurricane {
  public static void main(String[] args){


    Scanner sc = new Scanner(System.in);

    System.out.println("This is a hurricane meter");
    System.out.println("Please insert the speed of the wind (mph):");
    System.out.println(" ");
    int windSpeed = sc.nextInt();
    System.out.println(" ");

    if (windSpeed >= 0 && windSpeed <= 73) {
      System.out.println("The wind doesn't qualify as a Huricane. The speed is too low");
    }
    else if (windSpeed >=74 && windSpeed <=95) {
      System.out.println("This is a class 1 hurricane");
    }
    else if (windSpeed >=96 && windSpeed <=110) {
      System.out.println("This is a class 2 hurricane");
    }
    else if (windSpeed >=111 && windSpeed <=130) {
      System.out.println("This is a class 3 hurricane");
    }
    else if (windSpeed >=131 && windSpeed <=155) {
      System.out.println("This is a class 4 hurricane");
    }
    else if (windSpeed >= 156 && windSpeed <=185) {
      System.out.println("This is a class 5 hurricane");
    }
    else if (windSpeed >= 186) {
      System.out.println("OH MY GOD, you MANIACS, you have doomed us all! \n What have YOU done? The end is here! SAVE YOURSELF!!!");
    }

  }
}
