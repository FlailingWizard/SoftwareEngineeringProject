package FallenKings;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
   int xp = 0;
   
  
   
  // sets the class of the character and sets the atttributes for the character as well.
   public void setChar()
   {
      System.out.println("Story Text here.");
       
       
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
            health = 100;
            damage = 12;
            defence = 5;
            weapons = "Wood LongSword and Shield";
            armor = "Leather Helmet, Chestpiece and Pants";
            System.out.println("You have chosen the " + fighterClass + " class. The " + weapons +  " as well as the \n" + armor + " have been added to your inventory.\n");
            break;
         //GreatSword Class
         case 2:
            fighterClass = "Greatsword";
            health = 30;
            damage = 20;
            defence = 4;
            weapons = "Wood Greatsword";
            armor = "Leather Helmet, Chestpiece and Pants";
            System.out.println("You have chosen the " + fighterClass + " class. The " + weapons +  " as well as the \n" + armor + " have been added to your inventory.\n");
            break;
         //Dual Axe Class
         case 3:
            fighterClass = "Dual Axe Wielder";
            health = 22;
            damage = 15;
            defence = 0;
            weapons = "Wood Dual Axes";
            armor = "Leather Helmet, Chestpiece and Pants";
            System.out.println("You have chosen the " + fighterClass + " class. The " + weapons +  " as well as the \n" + armor + " have been added to your inventory.\n");
            break;
         case 4:
            fighterClass = "Scythe";
            health = 30;
            damage = 20;
            defence = 4;
            weapons = "Wood Scythe";
            armor = "Leather Helmet, Chestpiece and Pants";
            System.out.println("You have chosen the " + fighterClass + " class. The " + weapons +  " as well as the \n" + armor + " have been added to your inventory.\n");
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
   
   public void setXP(int xp)
   {
       this.xp = xp;
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
   
   public int getXP()
   {
      return xp;
   }
   
   //levels up the character increasing their damage and health
   public void addXP()
   {
      this.xp += 25;
   }
   
   
   public void level()
   {
      System.out.println("You leved up, your health and damage have increased!");
      int newHealth = this.health + (int)(this.health * .33);
      this.health = newHealth;
      int newDamage = this.damage + (int)(this.damage * .33);
      this.damage = newDamage;
      this.level++;
      this.xp = 0;
   }
   
   /*Uses the potion specified and adds the health amount assigned to that 
   specific potion to the health of  the character*/
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
   public void loadGame(Character mainChar, Enemy minion)
   {
       Scanner fileIn = null;
       try
       {
           fileIn = new Scanner(new FileInputStream("save.txt"));
       }
       catch (FileNotFoundException e)
       {
          System.out.println("File not found.");
          System.exit(0);
       }
       
       mainChar.setFighterClass(fileIn.nextLine()); 
       mainChar.setHealth(fileIn.nextInt());
       mainChar.setDamage(fileIn.nextInt());
       mainChar.setDefence(fileIn.nextInt());
       mainChar.setWeapon(fileIn.nextLine());
       mainChar.setArmor(fileIn.nextLine());
       mainChar.setXP(fileIn.nextInt());
       mainChar.setLevel(fileIn.nextInt());
       minion.setFloor(fileIn.nextInt());
       fileIn.close();   
   }
   public void saveGame(Character mainChar, Enemy minion)
   {
       BufferedWriter output = null;
       File file = null;
       boolean bool = false;
       try{
       file = new File("save.txt");
       output = new BufferedWriter(new FileWriter(file));
       if (!file.exists())
       {
           bool = file.createNewFile();
       }
       System.out.println("File Created: " + bool);
       //PrintWriter pw = new PrintWriter(file);
       output.write(mainChar.getFighterClass());
       output.write(mainChar.getHealth());
       output.write(mainChar.getDamage());
       output.write(mainChar.getDefence());
       output.write(mainChar.getWeapons());
       output.write(mainChar.getArmor());
       output.write(mainChar.getXP());
       output.write(mainChar.getLevel());
       output.write(minion.getFloor());
       System.out.println("File Created: " + bool);
       } 
       catch (IOException ex) 
       {
               System.out.println("File could not be saved, sorry.");
       }
   }
}