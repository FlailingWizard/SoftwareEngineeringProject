package FallenKings;

import java.util.Random;

class Enemy
{
   private int enemyHealth;
   private int enemyDamage; 
   private int enemyDefence;
   private int floor = 1;
   private int kingsHealth;
   
   Random rando = new Random();
   private int countDown = rando.nextInt(2) + 3;
   public int getKingsHealth() {
		
		return kingsHealth;
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
   
   
   /*randomly generates a minion enemy and assigns it a random amount to health,
     damage, and defence.
   */
   public void genMinion(int floor)
   {
       this.floor = floor;
      if (floor == 1)
      {
         System.out.println("You have run into one of the king's minions.");
         enemyHealth = rando.nextInt(20) + 10;
         enemyDamage = rando.nextInt(10) + 5;
         enemyDefence = rando.nextInt(6);
         countDown--;
      }
      else if (floor == 2)
      {
         enemyHealth = rando.nextInt(30) + 10;
         enemyDamage = rando.nextInt(15) + 5;
         enemyDefence = rando.nextInt(10);
         countDown--;
      }
      else 
      {
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
      if ((floor == 1) && (countDown ==0))
      { 
         System.out.println("Drognauf has awoken.");
         enemyHealth = 100;
         enemyDamage = 10;
         enemyDefence = rando.nextInt(3) + 8;
         countDown = rando.nextInt(2) + 3;
         floor++;
      }
      else if ((floor == 2) && (countDown == 0))
      {
         System.out.println("The Chief Commander Rishield has arrived.");
         enemyHealth = 150;
         enemyDamage = 10;
         enemyDefence = rando.nextInt(6) + 14;
         countDown = rando.nextInt(2) + 3;
         floor++;
      }
      else
      {
         System.out.println("It's the King!!!!!!");
         kingsHealth = 100;
         enemyDamage = 23;
         enemyDefence = rando.nextInt(6) + 14;
      }     
   }

}