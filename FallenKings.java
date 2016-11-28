package FallenKings;

public class FallenKings{
	
	public static void main (String[] args)
	   {
	      Character mainChar = new Character();
	      Battle battle = new Battle();
	      Enemy minion = new Enemy();
	      mainChar.setChar();
	      battle.battle(mainChar);
	      while(minion.getKingsHealth() > 0)
	      {
	    	battle.battle(mainChar); 
	    	
	    	  
	    	  
	      }
	     // System.out.println("You have sucessfully beaten the game!!!!!!!!");
	     
	      
	   }

}
