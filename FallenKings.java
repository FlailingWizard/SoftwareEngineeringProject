package FallenKings;

public class FallenKings{
	


	public static void main (String[] args)
	   {
<<<<<<< HEAD
		Character mainChar = new Character();
	      Battle battle = new Battle();
=======
            Character mainChar = new Character();
            Battle battle = new Battle();
           
>>>>>>> origin/master
	   
	      Enemy minion = new Enemy();
	      mainChar.setChar();
	      
	      while(minion.getKingsHealth() > 0)
	      {
	    	
<<<<<<< HEAD
	    	  battle.battle(mainChar); 
	    	  mainChar.genEquipment(mainChar);
=======
	    	battle.battle(mainChar); 
	    	  
>>>>>>> origin/master
	    	  if(mainChar.getHealth() <= 0)
		    	{
		    		System.out.println("you have died");
		    		break;
		    	}
<<<<<<< HEAD
	    	  
=======
	    	battle.genEquipment(mainChar, battle);
>>>>>>> origin/master
	    	  
	      }
	     // System.out.println("You have successfully beaten the game!!!!!!!!");
	     
	      
	   }

}
