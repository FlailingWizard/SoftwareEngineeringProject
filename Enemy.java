package FallenKings;

import java.util.Random;

class Enemy extends Character
{
   public int enemyHealth;
   private int damage; 
   private int defence;
   public int floor;
   private int countdown = 1;
   
   Random rando = new Random();
   
   /*randomly generates a minion enemy and assigns it a random amount to health,
     damage, and defence.
   */
   public void genMinion()
   {
      if (floor == 1)
      {
         System.out.println("You have run into one of the king's minions.");
         enemyHealth = rando.nextInt(20) + 10;
         damage = rando.nextInt(10) + 5;
         defence = rando.nextInt(6);
         countdown--;
      }
      else if (floor == 2)
      {
         enemyHealth = rando.nextInt(30) + 10;
         damage = rando.nextInt(15) + 5;
         defence = rando.nextInt(10);
         countdown--;
      }
      else 
      {
         enemyHealth = rando.nextInt(50) + 10;
         damage = rando.nextInt(25) + 5;
         defence = rando.nextInt(15);
         countdown--;
      }
   }
   /*Generates a boss after the user has killed so many minions. Boss has 
     random amounts of defence.
   */
   public void genBoss()
   {
      if ((floor == 1) && (countdown ==0))
      { 
         enemyHealth = 100;
         damage = 10;
         defence = rando.nextInt(3) + 8;
         countdown = 1;
         floor++;
      }
      else if ((floor == 2) && (countdown ==0))
      {
         enemyHealth = 150;
         damage = 10;
         defence = rando.nextInt(6) + 14;
         countdown = 1;
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