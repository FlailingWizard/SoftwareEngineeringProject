package FallenKings;

public class CharacterTester 
{

   public static void main (String[] args)
   {
      Character mainChar = new Character();
      Battle battle = new Battle();
      Enemy minion = new Enemy();
      mainChar.setChar();
      System.out.println(mainChar.getHealth());
      mainChar.level();
      System.out.println(mainChar.getHealth());
      minion.genMinion(1);
   }




}