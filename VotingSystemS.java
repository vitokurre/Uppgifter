public class VotingSystemS{
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
