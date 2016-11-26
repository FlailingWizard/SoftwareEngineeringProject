package FallenKings;

public class FallenKings 
{

   public static void main (String[] args)
   {
      Character mainChar = new Character();
      mainChar.setChar();
      Enemy minion = new Enemy();
      Battle battle = new Battle();
      battle.battle(mainChar);
      while(minion.getKingsHealth() > 0 ){
            
          battle.battle(mainChar);

      }
      System.out.println(mainChar.getHealth());
      //mainChar.level();
      //System.out.println(mainChar.getHealth());
      //minion.genMinion(1);
   }




}