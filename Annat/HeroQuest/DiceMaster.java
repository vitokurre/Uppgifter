import java.util.Scanner;

public class DiceMaster {
   public static void main(String[] args) {

      System.out.println("Welcome to DiceMaster");

      while(true) {

         int abilitySkillOrDamage = 0;
         int result = 0;
         int bonus = 0;
         int addBonus = 0;
         int diceSize = 0;
         int diceChoice = 0;
         int numberOfDices = 0;

         Scanner sc = new Scanner(System.in);

         System.out.println("What kind of dice do you want to use?");
         System.out.println("1. 1d4");
         System.out.println("2. 1d6");
         System.out.println("3. 1d8");
         System.out.println("4. 1d10");
         System.out.println("5. 1d12");
         System.out.println("6. 1d20");
         System.out.println("7. 1d100");
         System.out.println("8. Quit");

         diceChoice = sc.nextInt();

            if(diceChoice == 8) {
               System.out.println("Ending program");
               break;
            }

         diceSize = diceType(diceChoice);

         System.out.println("What do you want to make a roll for?");
         System.out.println("1. Ability or skill checks");
         System.out.println("2. Damage");




         abilitySkillOrDamage = sc.nextInt();

         numberOfDices = decideNumberOfDices(abilitySkillOrDamage);

         System.out.println("Do you have any bonus to add?");
         System.out.println("1. Yes");
         System.out.println("2. No");

         bonus = sc.nextInt();
         addBonus = bonusCheck(bonus);

         diceRoller(diceSize, numberOfDices, addBonus);

         System.out.println("*putting the dice back into the bag*");
      }
   }


   public static void diceRoller(int diceType, int numberOfDices, int diceBonus) {

      int rollResult = (int)(Math.random() * diceType) +1;

         rollResult = rollResult * numberOfDices;

         rollResult = rollResult + diceBonus;

         if(numberOfDices == 1) {

            System.out.println("*rolling dice*");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("you roll a total of "+rollResult);
            System.out.println(" ");

         }

         else if(numberOfDices > 1) {

            System.out.println("*rolling dices*");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("you roll a total of "+rollResult);
            System.out.println(" ");
         }
  }

  public static int diceType(int dice) {

      int diceSize = 0;

      Scanner sc = new Scanner(System.in);

      while(dice < 0 || dice > 7){

            dice = sc.nextInt();

            if(dice >= 1 && dice <=7){
              break;
            }
            else  {
               System.out.println("You must type in a number from 1 to 8, try again!");
               System.out.println("Choose your dice");
               System.out.println("1. 1d4");
               System.out.println("2. 1d6");
               System.out.println("3. 1d8");
               System.out.println("4. 1d10");
               System.out.println("5. 1d12");
               System.out.println("6. 1d20");
               System.out.println("7. 1d100");
           }


         }

      switch(dice){

            case 1:
               diceSize = 4;
               break;
            case 2:
               diceSize = 6;
               break;
            case 3:
               diceSize = 8;
               break;
            case 4:
               diceSize = 10;
               break;
             case 5:
               diceSize = 12;
               break;
            case 6:
               diceSize = 20;
               break;
            case 7:
               diceSize = 100;
               break;
         }

      return diceSize;
   }

   public static int decideNumberOfDices(int abilitySkillOrDamage) {


         int numberOfDices = 0;

         Scanner sc = new Scanner(System.in);

         while(abilitySkillOrDamage < 1 || abilitySkillOrDamage > 2) {

            abilitySkillOrDamage = sc.nextInt();

               if(abilitySkillOrDamage == 1 || abilitySkillOrDamage == 2) {
                  break;
               }
               else {
                  System.out.println("What do you want to make a roll for?");
                  System.out.println("1. Ability or skill checks");
                  System.out.println("2. Damage");
               }
         }

         if(abilitySkillOrDamage == 1) {
            numberOfDices = 1;
         }
         else if(abilitySkillOrDamage == 2) {

            System.out.println("How many dices do you want to roll");

            while(numberOfDices < 1) {

               numberOfDices = sc.nextInt();

               if(numberOfDices >= 1) {
                  break;
               }
               else {
                  System.out.println("How many dices do you want to roll");
               }

            }
         }

         return numberOfDices;

   }

   public static int bonusCheck(int checkBonus) {

      int addBonus = 0;

      Scanner sc = new Scanner(System.in);

      while(checkBonus < 1 || checkBonus > 2) {

          System.out.println("Do you have any bonus to add?");
          System.out.println("1. Yes");
          System.out.println("2. No");

          checkBonus = sc.nextInt();

          if(checkBonus == 1 ||checkBonus == 2){
            break;
          }
      }

      if(checkBonus == 1){

         System.out.println("How much bonus do you have?");

         while(addBonus > 1); {

            addBonus = sc.nextInt();

            if(addBonus < 1) {
               System.out.println("Try again");
            }
            else if(addBonus >= 1) {
               System.out.print("HÃ¤r vill vi breaka");
            }





         }


      }
      else if(checkBonus == 2) {
      addBonus = 0;
      }

      return addBonus;

  }
}
