import java.util.*;

public class Bullets extends Path
{
   
   private int damage;
   private int[] hitbox;
   
   public Bullets(ArrayList<Location> corners, int d, int[] mods)
   {
      super(corners);
      setDamage(d);
      hitbox = this.modify(mods);
   }
   
   public int getDamage();
   {  return damage;}
   
   public int[] getHitbox()
   {  return hitbox;}
   
   public void setDamage(int d)
   {  damage = d;}
   
   private int[] modify(int[] mods)
   {
      ArrayList<Location> basicHitbox = super.path;
   }
   
}