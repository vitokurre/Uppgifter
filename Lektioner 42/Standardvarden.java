public class Standardvarden{
  public static void main(String[] args){

    yell(true);
    yell();
  }
  public static void yell(boolean worried) {
    if(worried){
      System.out.println("a person yelled worriedly");
    }
    else {
      System.out.println("a person calmly spoke");
    }
  }
  public static void yell(){
    yell(false);
  }

}


/*

Standardvärden(en fil)
Skapa en metod yell() som kan ta max 1 boolean argument worried.
• Om man inte matar in något ska argumentet antas vara false
• Om worried är true ska texten a person yelled worriedly skrivas ut
• Om worried är false ska texten a person calmly spoke

*/
