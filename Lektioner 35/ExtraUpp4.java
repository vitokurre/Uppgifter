public class ExtraUpp4 {

  public static void main(String[] args){

    for(int i = 1; i <= 10; i = ++i) {
      if (i != 5) {
        System.out.println(i + " We're not at step 5!");
      }

      else {
        System.out.println(i + " We're at step 5");
      }
    }
    /*
    Skriv ett program som räknar upp från 0 till 10 och med hjälp av en
    if-sats kollar om värdet som räknas upp är lika med 5.
    Om det är lika med 5 skriv ut: Were at step 5!
    Om det inte är lika med 5 skriv ut: Were not at step 5!
    */

  }
}
