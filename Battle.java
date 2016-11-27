package FallenKings;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;



public class Battle extends Equipment
{
	
   Random rando = new Random();
   Scanner scan = new Scanner(System.in);
   String decision;
   Enemy minion = new Enemy();
   int z;
   public void enemyTurn()
   {
       
      int turn = rando.nextInt(2) + 1;
      if (turn == 1)
      {
         decision = "attack";
      }
      else 
      {
         decision = "defend";
      }
   }
   public void battle(Character mainChar)
   {
      if (minion.getCountDown() > 0)
      {
         minion.genMinion(minion.getFloor());
      }
      else if (minion.getCountDown() == 0)
      {
         minion.genBoss();
      }
      while((mainChar.getHealth() > 0) || (minion.getEnemyHealth() > 0))
      {
         System.out.println("Would you like to (1) attack, (2) defend, or (3) use a healing potion?\n Please enter 1, 2, or 3");
         int choice;
        // do {
         System.out.println("If you don't have healing items, you must enter 1, or 2. THERE IS NO 3 FOR YOU!!!!");
         choice = scan.nextInt();
         //}while(inventory.isEmpty() == true);
         //character chooses to attack
         enemyTurn();
         if(choice == 1)
         {
            if (decision == "defend")
            {
               System.out.println("The minion chose to defend");
               if (minion.getEnemyDefence() < mainChar.getDamage())
               {
                  minion.setEnemyHealth(minion.getEnemyHealth() - mainChar.getDamage() + minion.getEnemyDefence());
               }
               else
               {
                  System.out.println("The enemy's defence was higher than your attack...");
               }
               System.out.println("Your health is" + mainChar.getHealth());
            }
            else if(decision == "attack")
            {
            	System.out.println("The minion chose to attack");
            	minion.setEnemyHealth(minion.getEnemyHealth() - mainChar.getDamage());
                mainChar.setHealth(mainChar.getHealth() - minion.getEnemyDamage());
                System.out.println("Your health is" + mainChar.getHealth());
            }
         }
         //character chooses to defend
         else if(choice == 2)
         {
            if (decision == "defend")
            {
               System.out.println("You and your enemy chose to defend so you both stare lovingly into each others eyes.");   
            }
            else if(decision == "attack")
            {
               if (mainChar.getDefence() < minion.getEnemyDamage())
               {
                  mainChar.setHealth(mainChar.getHealth() - minion.getEnemyDamage() + mainChar.getDefence());
               }
               else
               {
                  System.out.println("You successfully blocked the opponent's attack");    
               }
            } 
         }
         //character chooses to heal
         else if(choice == 3)
         {
             String potion = "";
             System.out.println("These are the potions that you have in your inventory.");
             System.out.println(inventory);
             System.out.println("Enter 1 for a Small Potion, 2 for a Medium Potion, 3 for a Large Potion.");
             do
             {
                System.out.println("Please make sure the potion you choose is in your inventory.");
                int x = scan.nextInt();
                switch(x)
                {
                    case 1:
                        potion = "Small Potion";
                        break;
                    case 2:
                        potion = "Medium Potion";
                    case 3:
                        potion = "Large Potion";
                        break;
                }
             }while(inventory.contains(potion));
             Iterator itr = inventory.iterator();
             while(itr.hasNext()){
             if(itr.next().equals(potion))
             itr.remove();
             }
             if (decision == "defend")
            {
             System.out.println("Your opponent chose to defend so you glare at your oppenent and quaff a health potion"); 
             
             z = rando.nextInt(5) + 1;
             if(z < 5)
             {
                mainChar.usePotion(potion);
             }
             else
             {
                 System.out.println("HAHAHA!!!! Your potion is spoiled... it didn't do anything for you.");
             }
                 
            }
             else 
             {
             if(z < 5)
             {
                mainChar.setHealth(mainChar.getHealth() - minion.getEnemyDamage());
                mainChar.usePotion(potion);
             }
             else
             {
                 System.out.println("HAHAHA!!!! Your potion is spoiled... it didn't do anything for you.");
             }
             }
         }           
      }
      
   }
   
   
}


