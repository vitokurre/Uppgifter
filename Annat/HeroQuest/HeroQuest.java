import java.util.Scanner;
public class HeroQuest{
  public static void main(String[] args){


    int gameOn = 1;


    while (gameOn != 2 || gameOn != 1) {
      try{

        System.out.println("Welcome to HeroQuest");
        System.out.println(" ");
        System.out.println("To play press: 1");
        System.out.println("To quit press: 2");
        Scanner sc = new Scanner(System.in);
        gameOn = sc.nextInt();

        if(gameOn == 2) {
          break;
        }
        else if(gameOn == 1){
          break;
        }

      }
      catch(Exception e) {
        System.out.println("Use 1, or 2 to navigate" + e);

      }
    }
  }

  //  public static void Race () {

  //  }
}
