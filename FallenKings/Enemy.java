package FallenKings;

import java.util.Random;

class Enemy
{
   private int enemyHealth;
   private int enemyDamage; 
   private int enemyDefence;
   private int floor = 1;
   private int kingsHealth = 100;
   private int bossOneHealth = 100;
   private int bossTwoHealth = 150;
   
   
   Random rando = new Random();
   private int countDown = rando.nextInt(2) + 3;
   private int tempCountDown;
   public int getKingsHealth()  
   {
	return kingsHealth;
   }
   public int getBossOneHealth()
   {
       return bossOneHealth;
   }
   public int getBossTwoHealth()
   {
       return bossTwoHealth;
   }
   public int getCountDown()
   {
       return countDown;
   }
   public int getFloor()
   {
       return floor;
   }
   public int getEnemyHealth()
   {
       return enemyHealth;
   }
   public int getEnemyDefence()
   {
       return enemyDefence;
   }
   public int getEnemyDamage()
   {
       return enemyDamage;
   }
   public void setEnemyHealth(int newHealth)
   {
       enemyHealth = newHealth;
   }
   public void setEnemyDefence(int newDefence)
   {
       enemyDefence = newDefence;
   }
   public void setFloor(int floor)
   {
       this.floor = floor;
   }
   public void setBossOneHealth(int health)
   {
       bossOneHealth = health;
   }
   public void setBossTwoHealth(int health)
   {
       bossTwoHealth = health;
   }
   
   
   /*randomly generates a minion enemy and assigns it a random amount to health,
     damage, and defence.
   */
   public void genMinion(int floor)
   {
       this.floor = floor;
      if (floor == 1)
      {
         System.out.println("\nYou have run into one of the king's minions.");
         enemyHealth = rando.nextInt(2) + 5;
         enemyDamage = rando.nextInt(5) + 5;
         enemyDefence = rando.nextInt(2);
         countDown--;
      }
      else if (floor == 2)
      {
         System.out.println("\nYou have run into a king's soldier.");
         enemyHealth = rando.nextInt(30) + 10;
         enemyDamage = rando.nextInt(15) + 5;
         enemyDefence = rando.nextInt(10);
         countDown--;
      }
      else if (floor == 3)
      {
         
         System.out.println("The Royal Guard has spotted you.");
         enemyHealth = rando.nextInt(50) + 10;
         enemyDamage = rando.nextInt(25) + 5;
         enemyDefence = rando.nextInt(15);
         countDown--;
      }
   }
   /*Generates a boss after the user has killed so many minions. Boss has 
     random amounts of defence.
   */
   public void genBoss()
   {
      if (floor == 1)
      { 
         System.out.println("Drognauf has AWOKEN!!!!!!!!!!!");
         enemyHealth = bossOneHealth;
         enemyDamage = 10;
         enemyDefence = rando.nextInt(3) + 8;
         tempCountDown = rando.nextInt(2) + 3;
         countDown = tempCountDown;
         floor = 2;
      }
      else if (floor == 2)
      {
         System.out.println("The Chief Commander Rishield has arrived.");
         enemyHealth = bossTwoHealth;
         enemyDamage = 10;
         enemyDefence = rando.nextInt(6) + 14;
         tempCountDown = rando.nextInt(2) + 3;
         countDown = tempCountDown;
         floor = 3;
      }
      else if (floor == 3)
      {
         System.out.println("It's the King!!!!!!");
         enemyDamage = 23;
         enemyDefence = rando.nextInt(6) + 14;
         enemyHealth = kingsHealth;
         floor = 4;
      }     
   }

}