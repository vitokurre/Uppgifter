import java.util.ArrayList;
public class Player{

  String name;
  int points;
  ArrayList<Die> Dices = new ArrayList<Die>();

  public Player(String name){
    this.name = name;
  }
  
  public void rollDice(){
    for(int i = 0; i < Dices.size(); i++) {
      Dices.get(i).roll();
    }
  }

  public int getDieValue(){
    int totalValue = 0;
    for(int i = 0; i < Dices.size(); i++){
      totalValue = totalValue + Dices.get(i).currentValue;
    }
    return totalValue;
  }

  public void increaseScore(){
    points++;
  }

  public void addDie(int sides){
    Dices.add(new Die(sides));
  }
}
