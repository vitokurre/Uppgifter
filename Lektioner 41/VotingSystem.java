public class VotingSystem{
  public static void main(String[] args){

    Voter russianVoter = new Voter();

    String name = "*Comrade Natasja*";

    russianVoter.name = name;

    System.out.println(russianVoter.name);

    russianVoter.setVote();
    System.out.println("You have voted for " + russianVoter.getVote()+".");
    System.out.println("Congratulations, you will not be sent to Gulag... for now!");
    System.out.println("Now be a good comrade and get back to work, cyka blyat!");



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
