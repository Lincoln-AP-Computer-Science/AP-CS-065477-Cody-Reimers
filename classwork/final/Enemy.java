import java.util.*;

public abstract class Enemy
{
   
   private Art enemyTexture //class name can change
   private Path path;
   private int score; //how much score the enemy is worth
   private Bullets aim;
   
   public Enemy(Art texture, Path p, int s, Bullets a)
   {
      enemyTexture = texture;
      path = p;
      score = s;
      aim = a;
   }
   
   public Art getEnemyTexture()
   {return enemyTexture;}
   
   public Path getPath()
   {return path;}
   
   public int getScore()
   {return score;}
   
   public void takeDamage(int damage)
   {health -= damage;}
   
}