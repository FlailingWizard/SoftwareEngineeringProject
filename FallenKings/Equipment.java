package FallenKings;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;



class Equipment extends Enemy 
{
   private int reward;
   private final String armor1 = "Chainmail Helmet, Chestpiece and Pants";
   private final String armor2 = "Iron Helmet, Chestpiece and Pants";
   private final String armor3 = "Steel Helmet, Chestpiece and Pants";
   private final String armor4 = "Dragon Scale Helmet, Chestpiece and Pants";
   private final String weaponLS1 = "Iron Longsword and Shield";
   private final String weaponLS2 = "Steel Longsword and Shield";
   private final String weaponLS3 = "Dragonbone Longsword and Shield";
   private final String weaponLS4 = "Nerf(Trademarked) Longsword and Shield";
   private final String weaponGS1 = "Iron Greatsword";
   private final String weaponGS2 = "Steel Greatsword";
   private final String weaponGS3 = "Dragonbone Greatsword";
   private final String weaponGS4 = "Nerf(Trademarked) Greatsword";
   private final String weaponDA1 = "Iron Dual Axes";
   private final String weaponDA2 = "Steel Dual Axes";
   private final String weaponDA3 = "Dragonbone Dual Axes";
   private final String weaponDA4 = "Nerf(Trademarked) Dual Axes";
   private final String weaponS1 = "Iron Scythe";
   private final String weaponS2 = "Steel Scythe";
   private final String weaponS3 = "Dragonbone Scythe";
   private final String weaponS4 = "Nerf(Trademarked) Scythe";
   private final String potion1 = "Spoiled Potion";
   private final String potion2 = "Small Potion";
   private final String potion3 = "Medium Potion";
   private final String potion4 = "Large Potion";  
   
   Random rando = new Random();
   //public ArrayList<String> inventory = new ArrayList<String>(1);
   Scanner kb = new Scanner(System.in);
   

   /* drops a random armor item after minion or boss is killed. Quality of the item
   is based on what floor the user is on.
   */ 
   public void genArmor(Character mainChar)
   {
	   String choice = "";
       
	   reward = rando.nextInt(40) + 10;
     
      
         if ((getFloor() == 1) && (mainChar.armorDefence != 2))
         {
            System.out.println("You have picked up the " + armor1 + ". This item can block 2 damage. Do you want to equip it?");
         
            do 
            {
               System.out.println("Please Enter Yes or No");
               choice = kb.next();
               if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")){
            	  break;
               }
               
            }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));  
            if (choice.equalsIgnoreCase("yes"))
            {
            	System.out.println("get fucked bro");
               mainChar.setArmor(armor1);
               mainChar.armorDefence = 2;
            }
         } 
         if ((getFloor() == 2) || (getFloor() == 3))
         {
    
           if ((reward > 1) && (reward < 31) )
           {
               System.out.println("You have picked up the " + armor2 + ". This item can block 3 damage. Do you want to equip it?");
               do 
               {
                  System.out.println("Please Enter Yes or No");
                  choice = kb.next();
                  if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no")))
                  {
               	   break;
                  }
               }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));  
             
               if (choice.equalsIgnoreCase("yes"))
               {
                  mainChar.setArmor(armor2);
                  mainChar.armorDefence = 3;
               }
            }
             
            if ((reward > 30) && (reward < 49 ) )
            {
               System.out.println("You have picked up the " + armor3 + ". This item can block 5 damage. Do you want to equip it?");
               do 
               {
                  System.out.println("Please Enter Yes or No");
                  choice = kb.next();
                  
                  if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
               	   break;
                  }
                  
                  
               }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));  
               
               if (choice.equalsIgnoreCase("yes"))
               {
                  mainChar.setArmor(armor3);
                  mainChar.armorDefence = 5;
               }
            }
            if (reward == 49)
            {
               System.out.println("You have picked up the " + armor4 + ". This item can block 8 damage. Do you want to equip it?");
               do 
               {
                  System.out.println("Please Enter Yes or No");
                  choice = kb.next();
                  
                  if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
               	   break;
                  }
                  
               }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));  
               
               if (choice.equalsIgnoreCase("yes"))
               {
                  mainChar.setArmor(armor4);
                  mainChar.armorDefence = 8;
               }
            }
         }
      
   }
   
   /*Generates a weapon after the death of a Minion or Boss. Quality of weapon
   depends on the floor that the user is on*/
   public void genWeapon(Character mainChar)
   {
      reward = rando.nextInt(40) + 10;
      
      
         if ((mainChar.getFighterClass()) == "Longsword" )
         { 
            if ((getFloor() == 1) && (mainChar.weaponDamage !=8))
            {
               System.out.println("You have picked up the " + weaponLS1 + ". This item can deal  8 damage. Do you want to equip it?");
               String choice = "";
               
               do 
               {
                  System.out.println("Please Enter Yes or No");
                  choice = kb.next();
                  
                  if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                    break;
                  }
                 
               }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));  
               if (choice.equalsIgnoreCase("yes"))
               {
                  mainChar.setWeapon(weaponLS1);
                  mainChar.weaponDamage = 8;
               }
            }
            if ((getFloor() == 2) || (getFloor() == 3))
            {
               String choice;
               if ((reward > 27) && (reward < 64 ) )
               {
                  System.out.println("You have picked up the " + weaponLS2 + ". This item can deal 14 damage. Do you want to equip it?");
                  do 
                  {
                     System.out.println("Please Enter Yes or No");
                     choice = kb.next();
                     
                    if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
                    
                  }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));  
               
                  if (choice.equalsIgnoreCase("yes"))
                  {
                     mainChar.setWeapon(weaponLS2);
                     mainChar.weaponDamage = 11;
                  }
               }
               if ((reward > 64) && (reward < 100 ) )
               {
                  System.out.println("You have picked up the " + weaponLS3 + ". This item can deal 20 damage. Do you want to equip it?");
                  do 
                  {
                     System.out.println("Please Enter Yes or No");
                     choice = kb.next();
                     
                    if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
                     
                  }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));  
               
                  if (choice.equalsIgnoreCase("yes"))
                  {
                     mainChar.setWeapon(weaponLS3);
                     mainChar.weaponDamage = 20;
                  }
               }
               if (reward == 100 )
               {
                  System.out.println("You have picked up the " + weaponLS4 + ". This item is.... copyrighted and trademarked.... I dont know \n how you got this. Do you want to equip it?");
                  do 
                  {
                     System.out.println("Please Enter Yes or No");
                     choice = kb.next();
                     
                    if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
                     
                  }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no"))); 
               
                  if (choice.equalsIgnoreCase("yes"))
                  {
                     mainChar.setWeapon(weaponLS4);
                     mainChar.weaponDamage = 1000;
                  }
               }
            }
         }
         else if ((mainChar.getFighterClass()) == "Greatsword" )
         { 
            if ((getFloor() == 1) || (getFloor() !=1 && ((reward > 15) && (reward < 28) )))
            {
               System.out.println("You have picked up the " + weaponGS1 + ". This item can deal  8 damage. Do you want to equip it?");
               String choice;
               do 
               {
                  System.out.println("Please Enter Yes or No");
                  choice = kb.next();
                  
                  if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                    break;
                  }
                  
               }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no"))); 
               if (choice.equalsIgnoreCase("yes"))
               {
                  mainChar.setWeapon(weaponGS1);
                  mainChar.weaponDamage = 8;
               }
            }
            if ((getFloor() == 2) || (getFloor() == 3))
            {
               String choice;
               if ((reward > 27) && (reward < 64 ) )
               {
                  System.out.println("You have picked up the " + weaponGS2 + ". This item can deal 14 damage. Do you want to equip it?");
                  do 
                  {
                     System.out.println("Please Enter Yes or No");
                     choice = kb.next();
                     
                    if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
                     
                  }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no"))); 
               
                  if (choice.equalsIgnoreCase("yes"))
                  {
                     mainChar.setWeapon(weaponGS2);
                     mainChar.weaponDamage = 11;
                  }
               }
               if ((reward > 64) && (reward < 100 ) )
               {
                  System.out.println("You have picked up the " + weaponGS3 + ". This item can deal 20 damage. Do you want to equip it?");
                  do 
                  {
                     System.out.println("Please Enter Yes or No");
                     choice = kb.next();
                     
                    if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
                     
                  }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
                  if (choice.equalsIgnoreCase("yes"))
                  {
                     mainChar.setWeapon(weaponGS3);
                     mainChar.weaponDamage = 20;
                  }
               }
               if (reward == 100 )
               {
                  System.out.println("You have picked up the " + weaponGS4 + ". This item is.... copyrighted and trademarked.... I dont know \n how you got this. Do you want to equip it?");
                  do 
                  {
                     System.out.println("Please Enter Yes or No");
                     choice = kb.next();
                     
                    if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
                    
                  }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
                  if (choice.equalsIgnoreCase("yes"))
                  {
                     mainChar.setWeapon(weaponGS4);
                     mainChar.weaponDamage = 1000;
                  }
               }
            }
         }
         else if ((mainChar.getFighterClass()) == "Dual Axe Wielder" )
         { 
            if ((getFloor() == 1) || (getFloor() !=1 && ((reward > 15) && (reward < 28) )))
            {
               System.out.println("You have picked up the " + weaponDA1 + ". This item can deal  8 damage. Do you want to equip it?");
               String choice;
               do 
               {
                  System.out.println("Please Enter Yes or No");
                  choice = kb.next();
                  
                  if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
                  
               }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
               if (choice.equalsIgnoreCase("yes"))
               {
                  mainChar.setWeapon(weaponDA1);
                  mainChar.weaponDamage = 8 * 2;
               }
            }
            if ((getFloor() == 2) || (getFloor() == 3))
            {
               String choice;
               if ((reward > 27) && (reward < 64 ) )
               {
                  System.out.println("You have picked up the " + weaponDA2 + ". This item can deal 14 damage. Do you want to equip it?");
                  do 
                  {
                     System.out.println("Please Enter Yes or No");
                     choice = kb.next();
                     
                     if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
                     
                  }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
                  if (choice.equalsIgnoreCase("yes"))
                  {
                     mainChar.setWeapon(weaponDA2);
                     mainChar.weaponDamage = 11 * 2;
                  }
               }
               if ((reward > 64) && (reward < 100 ) )
               {
                  System.out.println("You have picked up the " + weaponDA3 + ". This item can deal 20 damage. Do you want to equip it?");
                  do 
                  {
                     System.out.println("Please Enter Yes or No");
                     choice = kb.next();
                     
                     if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
                   
                  }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
                  if (choice.equalsIgnoreCase("yes"))
                  {
                     mainChar.setWeapon(weaponDA3);
                     mainChar.weaponDamage = 20 * 2;
                  }
               }
               if (reward == 100 )
               {
                  System.out.println("You have picked up the " + weaponDA4 + ". This item is.... copyrighted and trademarked.... I dont know \n how you got this. Do you want to equip it?");
                  do 
                  {
                     System.out.println("Please Enter Yes or No");
                     choice = kb.next();
                     
                     if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
                     
                  }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
                  if (choice.equalsIgnoreCase("yes"))
                  {
                     mainChar.setWeapon(weaponDA4);
                     mainChar.weaponDamage = 1000;
                  }
               }
            }
         }
         else 
         { 
            if ((getFloor() == 1) || (getFloor() !=1 && ((reward > 15) && (reward < 28) )))
            {
               System.out.println("You have picked up the " + weaponS1 + ". This item can deal  8 damage. Do you want to equip it?");
               String choice;
               do 
               {
                  System.out.println("Please Enter Yes or No");
                  choice = kb.next();
                  
                  if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
                  
               }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
               if (choice.equalsIgnoreCase("yes"))
               {
                  mainChar.setWeapon(weaponS1);
                  mainChar.weaponDamage = 8;
               }
            }
            if ((getFloor() == 2) || (getFloor() == 3))
            {
               String choice;
               if ((reward > 27) && (reward < 64 ) )
               {
                  System.out.println("You have picked up the " + weaponS2 + ". This item can deal 14 damage. Do you want to equip it?");
                  do 
                  {
                     System.out.println("Please Enter Yes or No");
                     choice = kb.next();
                     
                     if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
                    
                  }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
                  if (choice.equalsIgnoreCase("yes"))
                  {
                     mainChar.setWeapon(weaponS2);
                     mainChar.weaponDamage = 11;
                  }
               }
               if ((reward > 64) && (reward < 100 ) )
               {
                  System.out.println("You have picked up the " + weaponS3 + ". This item can deal 20 damage. Do you want to equip it?");
                  do 
                  {
                     System.out.println("Please Enter Yes or No");
                     choice = kb.next();
                     
                     if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
                
                  }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no"))); 
               
                  if (choice.equalsIgnoreCase("yes"))
                  {
                     mainChar.setWeapon(weaponS3);
                     mainChar.weaponDamage = 20;
                  }
               }
               if (reward == 100 )
               {
                  System.out.println("You have picked up the " + weaponS4 + ". This item is.... copyrighted and trademarked.... I dont know \n how you got this. Do you want to equip it?");
                  do 
                  {
                     System.out.println("Please Enter Yes or No");
                     choice = kb.next();
                     
                     if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
                     
                  }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no"))); 
               
                  if (choice.equalsIgnoreCase("yes"))
                  {
                     mainChar.setWeapon(weaponS4);
                     mainChar.weaponDamage = 1000;
                  }
               }
            }
         }   
      
   }
   /*
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
            choice = kb.nextLine();
            
            if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
               	   break;
                  }
            
         }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no"))); 
               
         if (choice.equalsIgnoreCase("yes"))
         {
         usePotion(potion2, mainChar);
         }
         else if (choice.equalsIgnoreCase("no"))
         {
            System.out.println("Would you like to store it for later?");;
            do{
               choice = kb.next();
               
               if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
              
            }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
            if (choice.equalsIgnoreCase("yes"))
            {
               inventory.add(potion2);
               tracker++;
               System.out.println("The potion " + potion2 + " is stored in slot" + tracker);
               System.out.print(inventory);
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
            choice = kb.next();
            
            if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
            
         }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
         if (choice.equalsIgnoreCase("yes"))
         {
            usePotion(potion3, mainChar);
         }
         else if (choice.equalsIgnoreCase("no"))
         {
            System.out.println("Would you like to store it for later?");;
            do{
               choice = kb.next();
               
               if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
              
            }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
            if (choice.equalsIgnoreCase("yes"))
            {
               inventory.add(potion3);
               tracker++;
               System.out.print(inventory);
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
            choice = kb.next();
            
            if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
               	   break;
                  }
           
         }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
         if (choice.equalsIgnoreCase("yes"))
         {
            usePotion(potion4, mainChar);
         }
         else if (choice.equalsIgnoreCase("no"))
         {
            System.out.println("Would you like to store it for later?");;
            do{
               choice = kb.next();
               
               if((choice.equalsIgnoreCase("yes")) || (choice.equalsIgnoreCase("no"))){
                        break;
                    }
              
            }while((!choice.equalsIgnoreCase("yes")) || (!choice.equalsIgnoreCase("no")));
               
            if (choice.equalsIgnoreCase("yes"))
            {
               inventory.add(potion4);
               tracker++;
               System.out.print(inventory);
            }
          else 
            {
               return;
            }        
         }
      }
   }*/
   


  
   public void usePotion(String potionType, Character mainChar)
   {
    if(potionType.equals(potion1)) {
       mainChar.setHealth(mainChar.getHealth() + 0);
    }
    else if(potionType.equals(potion2))
    {
       mainChar.setHealth(mainChar.getHealth() + 8);
    }
    else if(potionType.equals(potion3))
    {
       mainChar.setHealth(mainChar.getHealth() + 12);
    }
    else
    {
       mainChar.setHealth(mainChar.getHealth() + 15);
    }
   }
}
   
   
   /*1-15
   string armorl = chainmain. 1-4
   iron plate 5-10
   steel plate 11-13
   dragon scale 14-15
   
   16-100
   iron longsword
   steel 
   dragon bone
   Nerf(TradeMarked) //stupid damage 100
   
   101-110
   small health potion
   spoiled potion
   medium health potion
   large health potion*/