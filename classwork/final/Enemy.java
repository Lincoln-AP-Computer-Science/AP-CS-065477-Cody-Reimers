public abstract class Enemy
{
   
   private int health;
   private int ammo; //just an idea
   private Art enemyTexture //class name can change
   private Path path;
   private int score; //how much score the enemy is worth
   private Bullets aim;
   
   public Enemy(int h, int a, Art texture, Path p, int s)
   {
      health = h;
      ammo = a;
      enemyTexture = texture;
      path = p;
      score = s;
   }
   
   public int getHealth()
   {return health;}
   
   public int getAmmo()
   {return ammo;}
   
   public Art getEnemyTexture()
   {return enemyTexture;}
   
   public Path getPath()
   {return path;}
   
   public int getScore()
   {return score;}
   
   public void takeDamage(int damage)
   {health -= damage;}
   
}
   
   