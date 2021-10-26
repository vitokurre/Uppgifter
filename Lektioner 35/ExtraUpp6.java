public class ExtraUpp6{
  public static void main(String[] args){

    for(int i = 1; i <= 100; ++i) {

      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      }

      else if (i % 3 == 0) {
        System.out.println("Fizz");
      }

      else if (i % 5 == 0) {
        System.out.println("Buzz");
      }

      else {
        System.out.println(i);
      }


    }
  }
}


/*FizzBuzz: Skriv ett program som printar alla nummer från 1 till 100 men om ett tal är
jämt delbart med 3 skriv Fizz istället för talet , om ett tal är jämt delbart 5 skriv
Buzz istället för talet och om ett tal är jämt delbart med både 3 och 5 skriv
FizzBuzz istället för talet.

if(i == y && i == x) {
  System.out.println("FizzBuzz");
}
else if (i == y) {
  System.out.println("Fizz");
}
else if (i == x) {
  System.out.println("Buzz");
}
else {
  System.out.println(i);

  for(int x = 1; x <= 101; x * 5) {
*/
