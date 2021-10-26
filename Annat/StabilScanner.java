import java.util.Scanner;
public class StabilScanner{
  public static void main(String[] args){

  askInt();
  }
  public static int askInt() {
      while (true) {
        try {
          Scanner sc = new Scanner(System.in);
          System.out.println("Please enter an int");
          int answer = sc.nextInt();
          if (answer > 0) {
            return answer;
          } else {
            System.out.println("has to be larger than 0");
          }
        } catch (Exception e) {
        }
      }
    }

}
