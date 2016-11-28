package FallenKings;

import java.util.ArrayList;
import java.util.Scanner;

public class Character extends Equipment
{
   private int health; 
   private int damage;
   public int weaponDamage;
   private String fighterClass;
   private int defence;
   public int armorDefence;
   private int level;
   private String weapons;
   private String armor;
   int classNumber = 0;
   
  
   
  // sets the class of the character and sets the atttributes for the character as well.
   public void setChar()
   {
      do{
         System.out.println("Please choose a class for your characer.");
         System.out.println("(1) Longsword");
         System.out.println("(2) Greatsword");
         System.out.println("(3) Dual Axe Wielder");
         System.out.println("(4) Scythe Wielder");
          System.out.println("Please enter 1, 2, 3, or 4");
      
         Scanner kb = new Scanner(System.in);
         classNumber = kb.nextInt();
      }
      while((classNumber <1) || (classNumber >4));
   
      
      switch(classNumber)
      {
         // LongSword Class
         case 1:
            fighterClass = "Longsword";
            health = 40;
            damage = 12;
            defence = 5;
            weapons = "Wood LongSword and Shield";
            armor = "Leather Helmet, Chestpiece and Pants";
            System.out.println("You have chosen the " + fighterClass + " class. The " + weapons +  " as well as the \n" + armor + " have been added to your inventory.");
            break;
         //GreatSword Class
         case 2:
            fighterClass = "Greatsword";
            health = 30;
            damage = 20;
            defence = 4;
            weapons = "Wood Greatsword";
            armor = "Leather Helmet, Chestpiece and Pants";
            System.out.println("You have chosen the " + fighterClass + " class. The " + weapons +  " as well as the \n" + armor + " have been added to your inventory.");
            break;
         //Dual Axe Class
         case 3:
            fighterClass = "Dual Axe Wielder";
            health = 22;
            damage = 15;
            defence = 0;
            weapons = "Wood Dual Axes";
            armor = "Leather Helmet, Chestpiece and Pants";
            System.out.println("You have chosen the " + fighterClass + " class. The " + weapons +  " as well as the \n" + armor + " have been added to your inventory.");
            break;
         case 4:
            fighterClass = "Scythe";
            health = 30;
            damage = 20;
            defence = 4;
            weapons = "Wood Scythe";
            armor = "Leather Helmet, Chestpiece and Pants";
            System.out.println("You have chosen the " + fighterClass + " class. The " + weapons +  " as well as the \n" + armor + " have been added to your inventory.");
            break;
      }
   }
   // setters for the instance variables 
   public void setDamage(int damage)
   {
      this.damage = damage;
   }
   
   public void setHealth(int newHealth)
   {
      this.health = newHealth;
   }
   
   public void setFighterClass(String fightClass)
   {
      this.fighterClass = fightClass;
   }
   
   public void setDefence(int defence)
   {
      this.defence = defence;
   }
   
   public void setLevel(int level)
   {
      this.level = level;
   }
   
   public void setWeapon(String weapons)
   {
      this.weapons = weapons;
   }
   
   public void setArmor(String armor)
   {
      this.armor = armor;
   }
   //getters for the instance variables
   public int getDamage()
   {
      return damage;
   }
   
   public int getHealth()
   {
      return health;
   }
   
   public String getFighterClass()
   {
      return fighterClass;
   }
   
   public int getDefence ()
   {
      return defence;
   }
   
   public int getLevel()
   {
      return level;
   }
   
   public String getWeapons()
   {
      return weapons;
   }
   
   public String getArmor()
   {
      return armor;
   }
   //levels up the character increasing their damage and health
   public void level()
   {
      int newHealth = this.health + (int)(this.health * .33);
      this.health = newHealth;
      int newDamage = this.damage + (int)(this.damage * .33);
      this.damage = newDamage;
      this.level++;
   }
   
   public void usePotion(String potionType)
   {
    
       if(potionType.equals("Spoiled Potion")) 
       {
       health+=health;
       }
       else if(potionType.equals("Small Potion"))
       {
       health+=8;
       }
      else if(potionType.equals("Medium Potion"))
      {
       health+=12;
      }
      else
      {
         health+=15;
      }
   } 
<<<<<<< HEAD
   public void genEquipment(Character mainChar)
=======
   /*public void genEquipment(Character mainChar)
>>>>>>> origin/master
   {
       int j = rando.nextInt(3) + 1;
       if (j == 1)
       {
           mainChar.genWeapon(mainChar);
           mainChar.genPotion(mainChar);
       }
       else if ( j == 2)
       {
           mainChar.genArmor(mainChar);
           mainChar.genPotion(mainChar);
       }
       else 
       {
           mainChar.genPotion(mainChar);
       }
       
<<<<<<< HEAD
   }
=======
   }*/
   
   
>>>>>>> origin/master
}