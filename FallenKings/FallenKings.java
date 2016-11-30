package FallenKings;

public class FallenKings{
	


	public static void main (String[] args)
	   {
            Character mainChar = new Character();
            Battle battle = new Battle();
           
	   
	      Enemy minion = new Enemy();
	      mainChar.setChar();
	      
	      while(minion.getFloor() < 4)
	      {
	    	if (minion.getFloor() == 4)
                  {
                      break;
                  }
	    	battle.battle(mainChar); 
                battle.genEquipment(mainChar, battle);
                mainChar.addXP();
                if (mainChar.getXP() == 75)
                {
                    mainChar.level();
                }
	    	  
	    	  
                if(mainChar.getHealth() <= 0)
		    	{
		    		System.out.println("you have died");
		    		break;
		    	}
	      }
	     System.out.println("You have successfully beaten the game!!!!!!!!");
	     
	      
	   }

}
