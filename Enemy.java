package FallenKings;

import java.util.Random;

class Enemy
{
   public int enemyHealth;
   private int damage; 
   private int defence;
   private int floor;
   
   Random rando = new Random();
   private int countDown = rando.nextInt(2) + 3;
   
   public int getCountDown()
   {
       return countDown;
   }
   public int getFloor()
   {
       return floor;
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
         damage = rando.nextInt(10) + 5;
         defence = rando.nextInt(6);
         countDown--;
      }
      else if (floor == 2)
      {
         enemyHealth = rando.nextInt(30) + 10;
         damage = rando.nextInt(15) + 5;
         defence = rando.nextInt(10);
         countDown--;
      }
      else 
      {
         enemyHealth = rando.nextInt(50) + 10;
         damage = rando.nextInt(25) + 5;
         defence = rando.nextInt(15);
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
         damage = 10;
         defence = rando.nextInt(3) + 8;
         countDown = rando.nextInt(2) + 3;
         floor++;
      }
      else if ((floor == 2) && (countDown ==0))
      {
         System.out.println("The Chief Commander Rishield has arrived.");
         enemyHealth = 150;
         damage = 10;
         defence = rando.nextInt(6) + 14;
         countDown = rando.nextInt(2) + 3;
         floor++;
      }
      else
      {
         System.out.println("It's the King!!!!!!");
         enemyHealth = 100;
         damage = 23;
         defence = rando.nextInt(6) + 14;
      }     
   }
}