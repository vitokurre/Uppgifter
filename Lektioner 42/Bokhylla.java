public class Bokhylla{
  public static void main(String[] args){

    Book bok1 = new Book("Sagan Om Ringen", "J.r.r Tolkien");
    Book bok2 = new Book("A Feast Of Crows", "George R. Martin");
    Book bok3 = new Book("Bibeln");
    Book bok4 = new Book("Bibeln");
    Book bok5 = new Book("Bibeln");
    Book bok6 = new Book("Bibeln");
    Book bok7 = new Book("Bibeln");
    Book bok8 = new Book("Bibeln");
    Book bok9 = new Book("Bibeln");
    Book bok10 = new Book("Bibeln");
    Book bok11 = new Book("Bibeln");
    Book bok12 = new Book("Bibeln");

    System.out.println(bok1.getForfattare());
    System.out.println(bok2.getForfattare());
    System.out.println(bok3.getForfattare());

    System.out.println(bok1.getTitle());
    System.out.println(bok2.getTitle());
    System.out.println(bok3.getTitle());

    System.out.println(bok1);
    System.out.println(bok2);
    System.out.println(bok3);
    System.out.println(bok1.getNumberOfBooks());
    System.out.println(bok2.getNumberOfBooks());
    System.out.println(bok3.getNumberOfBooks());

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
