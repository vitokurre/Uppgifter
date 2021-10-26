public class Huvudklass{
  public static void main(String[] args){

  Visibility objekt1 = new Visibility();

    objekt1.name = "Marcus";
    System.out.println(objekt1.name);

    objekt1.setLikes("Everyone");

    System.out.println(objekt1.name+ " likes " + objekt1.getLikes());



  }
}
