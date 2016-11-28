package FallenKings;

public class FallenKings{
	


	public static void main (String[] args)
	   {
		Character mainChar = new Character();
	      Battle battle = new Battle();
	   
	      Enemy minion = new Enemy();
	      mainChar.setChar();
	      
	      while(minion.getKingsHealth() > 0)
	      {
	    	
	    	  battle.battle(mainChar); 
	    	  mainChar.genEquipment(mainChar);
	    	  if(mainChar.getHealth() <= 0)
		    	{
		    		System.out.println("you have died");
		    		break;
		    	}
	    	  
	    	  
	      }
	     // System.out.println("You have successfully beaten the game!!!!!!!!");
	     
	      
	   }

}
