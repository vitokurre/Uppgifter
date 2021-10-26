import java.util.Random;
public class Die {

  int currentValue;
  int diceSize;
  private static Random rand = new Random();
  public Die(int diceSize){
    this.diceSize = diceSize;
  }
  public void roll(){

    int randomInt = rand.nextInt(diceSize) +1;
    currentValue = randomInt;
    System.out.println("Tärningen rullar: " + currentValue);
  }
}
