package FallenKings;

import java.util.Scanner;

public class FallenKings{
	
   public static void main (String[] args)
   {
      Character mainChar = new Character();
      Battle battle = new Battle();
      Enemy minion = new Enemy();
      Scanner kb = new Scanner(System.in);
            
      int answer;
   
      mainChar.setChar();
         
      while(minion.getFloor() < 4)
      {
         battle.battle(mainChar, minion); 
         if(mainChar.getHealth() <= 0)
         {
            System.out.println("you have died");
            if(minion.getFloor() < 1)
            {
               System.out.println("Would you like to: (1) Load the last save to try again? or (2) Exit the game?");
               do
               {
                  System.out.println("Please enter 1 or 2.");
                  answer = kb.nextInt();
                  if (answer == 1 || answer == 2)
                     break;
               }while((answer != 1) || (answer != 2));
                        
               if (answer == 1)
               {
                  mainChar.loadGame(mainChar, minion);
               }
               else if(answer == 2)
               {
                  break;
               }
            }
            else 
            {
               break;
            }
         }
         battle.genEquipment(mainChar, battle);
         mainChar.addXP();
         if (mainChar.getXP() == 75)
         {
            mainChar.level();
         }
         if ((battle.getY() == 0) && (minion.getFloor() == 2)) 
         {
            mainChar.saveGame(mainChar, minion);
            System.out.println("Game saved.");
            battle.setY(1);
         }
         else if ((battle.getY() == 1) && (minion.getFloor() == 3))
         {
            mainChar.saveGame(mainChar, minion);
            System.out.println("Game saved.");
            battle.setY(2);
         }
      }      
      if (minion.getFloor() == 4)
         System.out.println("You have successfully beaten the game!!!!!!!!");
      else{System.out.println("You have exited the game");}        
   }
}