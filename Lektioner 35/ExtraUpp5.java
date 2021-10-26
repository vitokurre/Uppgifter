public class ExtraUpp5 {
  public static void main(String[] args) {



    for(int hangry = 0; hangry < 10; ++hangry) {
      System.out.println("Wizard needs food, badly");
        if(hangry == 9) {
          System.out.println("Wizard is full");
        }
    }

    System.out.println("  ");
    System.out.println(" Nu byter vi loop ");
    System.out.println("  ");


    int hangry = 1;

    while (hangry <=10) {
      System.out.println(hangry+" Wizard needs food, badly");
      ++hangry;
    }
    if (hangry == 11) {
      System.out.println("Wizard is full");
    }



  }
}
/*
Skriv ett program som kollar om en boolean variabel hangry är ‘true’ om den
är det skriv ut Wizard needs food, badly 10 gånger men hjälp av en loop
annars skriv ut Wizard is full
*/
