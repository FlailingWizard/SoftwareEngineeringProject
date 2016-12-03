package FallenKings;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class Battle 
{
	
   Random rando = new Random();
   Scanner scan = new Scanner(System.in);
   String decision;
   Enemy minion = new Enemy();
   int z;
   int x = 0;
   int y = 0;
   int choice;
   private final String potion1 = "Spoiled Potion";
   private final String potion2 = "Small Potion";
   private final String potion3 = "Medium Potion";
   private final String potion4 = "Large Potion";  
   ArrayList<String> inventory = new ArrayList<>(1);
   
   public int getY()
   {
     return y;
   }
   public void setY(int y)
   {
       this.y = y;
   }
   
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
   
   public void battle(Character mainChar, Enemy minion)
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
    	  if(minion.getEnemyHealth() <= 0 || mainChar.getHealth() <= 0)
    	  {
    		  break;
    	  }
         System.out.println("\n---------------------------------------------------------------------");
         System.out.println("Would you like to (1) attack, (2) defend, or (3) use a healing potion?");
        do {
         System.out.println("If you don't have healing items, you must enter 1, or 2. THERE IS NO 3 FOR YOU!!!!");
         Scanner scan = new Scanner(System.in);
         /*
         if(scan.hasNextInt() == true)*/ 
         //{
             choice = scan.nextInt();
         //}
         System.out.println("Inventory: " + inventory);
         if(choice == 1 || choice == 2)
         {
        	 break;
         }
         }while((inventory.isEmpty()) );
         
        //character chooses to attack
        enemyTurn();
        if(choice == 1)
        {
            if (decision == "defend")
            {
               System.out.println("\nThe enemy chose to defend");
               if (mainChar.getFighterClass() == "Scythe")
               {
                   System.out.println("The enemy cannot block your attack, you deal full damage.");
                   minion.setEnemyHealth(minion.getEnemyHealth() - mainChar.getDamage());
                   if(0 >= minion.getEnemyHealth())
                  {
                      if((minion.getFloor() == 2) && (y == 0))
                      {
                          minion.setBossOneHealth(0);
                          y++;
                      }
                      else if ((minion.getFloor() == 3) && (y == 1))
                      {
                          minion.setBossTwoHealth(0);
                          y++;
                      }
                      System.out.println("The enemy is dead.");
                      System.out.println("They may have dropped something.");
                  }
                  else
                  {
                      System.out.println("The enemies health is " + minion.getEnemyHealth());
                  }
               }
               else if (minion.getEnemyDefence() < mainChar.getDamage())
               {
                  minion.setEnemyHealth(minion.getEnemyHealth() - mainChar.getDamage() + minion.getEnemyDefence());
                  if(0 >= minion.getEnemyHealth())
                  {
                      if(minion.getFloor() == 2)
                      {
                          minion.setBossOneHealth(0);
                      }
                      else if (minion.getFloor() == 3)
                      {
                          minion.setBossTwoHealth(0);
                      }
                      System.out.println("The enemy is dead.");
                      System.out.println("They may have dropped something.");
                  }
                  else
                  {
                      System.out.println("The enemies health is " + minion.getEnemyHealth());
                  }
               }
               else
               {
                  System.out.println("The enemy's defence was higher than your attack...");
               }
               System.out.println("Your health is " + mainChar.getHealth());
            }
            else if(decision == "attack")
            {
            	System.out.println("\nThe enemy chose to attack");
            	minion.setEnemyHealth(minion.getEnemyHealth() - mainChar.getDamage());
                mainChar.setHealth(mainChar.getHealth() - minion.getEnemyDamage());
                System.out.println("Your health is " + mainChar.getHealth());
                if(minion.getEnemyHealth() <= 0)
                  {
                      System.out.println("The enemy is dead.");
                      System.out.println("They may have dropped something.");
                  }
                  else
                  {
                      System.out.println("The enemies health is " + minion.getEnemyHealth());
                  }
                  
            }
         }
         //character chooses to defend
         else if(choice == 2)
         {
            if (decision == "defend")
            {
               System.out.println("\nYou and your enemy chose to defend so you both stare lovingly into each others eyes.");   
            }
            else if(decision == "attack")
            {
               if (mainChar.getDefence() < minion.getEnemyDamage())
               {
                 mainChar.setHealth(mainChar.getHealth() - minion.getEnemyDamage() + mainChar.getDefence());
                 System.out.println("\nThe enemies attack caused " + (minion.getEnemyDamage() - mainChar.getDefence()) + " damage to you instead of " + minion.getEnemyDamage() + " damage.");
                  
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
             System.out.println("\nThese are the potions that you have in your inventory.");
             System.out.println(inventory);
             System.out.println("Enter (1) for a Small Potion (2) for a Medium Potion, or (3) for a Large Potion.");
             do
             {
                System.out.println("Please make sure the potion you choose is in your inventory.");
                x = scan.nextInt();
                if(x == 1){
                    
                    potion = potion2;
                }
                else if(x == 2){
                    
                    potion = potion3;
                }
                else if(x == 3){
                    
                    potion = potion4;
                }
             }while(!inventory.contains(potion));
             
            // Iterator itr = inventory.iterator();
             
             int size = inventory.size();
             int i;
             for(i = 0; i < size; i ++){
                 
                String item = inventory.get(i);
                if(item.equalsIgnoreCase(potion)){
             
                    inventory.remove(i);
                    break;
                }
             }
             if (decision == "defend")
            {
             System.out.println("\nYour opponent chose to defend so you glare at your oppenent and quaff a health potion"); 
             
             z = rando.nextInt(5) + 1;
             if(z < 5)
             {
                mainChar.usePotion(potion);
             }
             else
             {
                 System.out.println("\nHAHAHA!!!! Your potion is spoiled... it didn't do anything for you.");
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
                 System.out.println("\nHAHAHA!!!! Your potion is spoiled... it didn't do anything for you.");
             }
             }
         }           
      }
      
   }
   public void genPotion(Character mainChar)
   {
      String choice = "";
      int tracker = 1;
      int j = rando.nextInt(3) + 1;
      
      
      
      if (j == 1)
      {
         System.out.println("You have picked up the " + potion2 + ". This item can heal 8 damage. Do you want to use it?");
         do 
         {
            System.out.println("Please Enter Yes or No");
            choice = scan.next();
            
            if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
               	   break;
                  }
            
         }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no"))); 
               
         if (choice.equalsIgnoreCase("yes"))
         {
         mainChar.usePotion(potion2, mainChar);
         }
         else if (choice.equalsIgnoreCase("no"))
         {
            System.out.println("Would you like to store it for later?");;
            do{
               choice = scan.next();
               
               if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
              
            }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
            if (choice.equalsIgnoreCase("yes"))
            {
               inventory.add(potion2);
               tracker++;
               System.out.println("The potion " + potion2 + " is stored in slot" + tracker);
               System.out.println("Inventory: " + inventory);
            }
            else 
            {
               return;
            }        
         }
      }
      else if (j == 2)
      {
         System.out.println("You have picked up the " + potion3 + ". This item can heal 12 damage. Do you want to use it?");
         do 
         {
            System.out.println("Please Enter Yes or No");
            choice = scan.next();
            
            if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
            
         }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
         if (choice.equalsIgnoreCase("yes"))
         {
            mainChar.usePotion(potion3, mainChar);
         }
         else if (choice.equalsIgnoreCase("no"))
         {
            System.out.println("Would you like to store it for later?");;
            do{
               choice = scan.next();
               
               if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
              
            }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
            if (choice.equalsIgnoreCase("yes"))
            {
               inventory.add(potion3);
               tracker++;
               System.out.println("Inventory: " + inventory);
            }
            else 
            {
               return;
            }        
         }
      }
      else if(j == 3)
      {
         System.out.println("You have picked up the " + potion4 + ". This item can heal 15 damage. Do you want to use it?");
         do 
         {
            System.out.println("Please Enter Yes or No");
            choice = scan.next();
            
            if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
               	   break;
                  }
           
         }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
         if (choice.equalsIgnoreCase("yes"))
         {
            mainChar.usePotion(potion4, mainChar);
         }
         else if (choice.equalsIgnoreCase("no"))
         {
            System.out.println("Would you like to store it for later?");;
            do{
               choice = scan.next();
               
               if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
              
            }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
            if (choice.equalsIgnoreCase("yes"))
            {
               inventory.add(potion4);
               tracker++;
               System.out.print("Inventory: " + inventory + "\n");
            }
          else 
            {
               return;
            }        
         }
      }
   }
   public void genEquipment(Character mainChar, Battle battle)
   {
       int j = rando.nextInt(3) + 1;
       if (j == 1)
       {
           mainChar.genWeapon(mainChar);
           battle.genPotion(mainChar);
       }
       else if ( j == 2)
       {
           mainChar.genArmor(mainChar);
           battle.genPotion(mainChar);
       }
       else 
       {
           battle.genPotion(mainChar);
       }
       
   }
   
   
}

