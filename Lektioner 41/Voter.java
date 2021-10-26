import java.util.Scanner;
public class Voter{
  public String name;
  private String vote;

  Scanner sc = new Scanner(System.in);

    public String setVote(){

      System.out.println("Who do you want to vote for?");


      String userVote = sc.nextLine();

      if(userVote.equals("Putin")){
        vote = userVote;
      }
      else {
        System.out.println("Wrong choice was made but it has been corrected.");
        userVote = "Putin";
        vote = userVote;
      }

      return vote;
    }

    public String getVote(){
      return vote;
    }

}


/*


c. Skriv en setter metod i Voter som använder Scanner. Denna metod ska fråga
användaren efter vem dom vill rösta på och spara det i en String variabel userVote.
Innan denna är redo att sättas så vill du kolla om svaret är lämpligt. Så om userVote
== Putin så kan du sätta vote = userVote;
I alla andra fall kan ni skriva ut Wrong choice was made but it has been corrected
och sätta vote == Putin;
d. Skapa en gettermetod för Voter som helt enkelt returnerar vote;
e. I din VoterSystem klass kan du nu i mainmetoden kalla på först settern och sen
gettern(i en print rekommenderas) för att se resultatet. Vem röstade ni på enligt
gettern?
*/
