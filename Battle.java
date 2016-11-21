package FallenKings;

public class Battle 
{
    
    Enemy minion = new Enemy();
    Enemy boss = new Enemy();
    public void battle(Character mainChar)
    {
      if (minion.getFloor() == 1)
      {
        while (minion.getCountDown() > 0)
        {
            minion.genMinion(1);
        }
        if (minion.getCountDown() == 0)
        {
            boss.genBoss();
            if (boss.getEnemyHealth() == 0)
            {
                
            }
        }
      }
}
}