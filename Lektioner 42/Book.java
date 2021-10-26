public class Book{

  private static int numberOfBooks = 0;
  private String title;
  private String forfattare = "No author";

  public Book(String titel, String forfattare){

  title = titel;
  this.forfattare = forfattare;
  numberOfBooks++;

  }
  public Book (String titel){
  title = titel;
  numberOfBooks++;
  }
  public int getNumberOfBooks(){
    return numberOfBooks;
  }
  public String getForfattare(){
    return forfattare;
  }
  public String getTitle(){
    return title;
  }
  public String toString(){
    return forfattare + " - " + title;
  }

}


/*

Allt
• Skapa en klass Book som kan instansieras på två olika sätt:
1. Med titel och författare.
2. Med endast titel. Författare blir då No author.
• Book ska ha getters och setters för titel och författare.
• Book ska hålla reda på hur många böcker som skapats, och detta antal skall kunna hämtas
med getNumberOfBooks().
• Book ska ha en toString()-metod på formatet:
Stephen King – The Shining
Gå igenom exemplet i powerpointen för tips på hur man skriver toString()

*/
