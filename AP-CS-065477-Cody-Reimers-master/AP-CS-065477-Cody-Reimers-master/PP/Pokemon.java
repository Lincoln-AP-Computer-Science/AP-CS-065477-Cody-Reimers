public class Pokemon
{
   
   private String pkmnName;
   private boolean isFishing;
   private boolean isFighting;
   private int hitPoints;
   
   //Constructs a Pokemon object with a given name that is not
   //in a fight, not fishing, with its base amount of hitPoints
   public Pokemon(String name, boolean fish, boolean fight, int hP)
   {
      this.pkmnName = name;
      this.isFishing = fish;
      this.isFighting = fight;
      this.hitPoints = hP;
   }
   
   //Changes hitPoints by subtracting damage dealt
   public void damage(int amountOfDamage)
   {
      this.hitPoints -= amountOfDamage;
   }
   
   //Returns the object's current hitPoints value
   public int getHitPoints()
   {
      return this.hitPoints;
   }
   
   //Returns a String containing the object's name
   public String toString()
   {
      return pkmnName;
   }
   
}
/*1B) A field is a value that an object has which acts like a class constant
 *    and is initialized by whichever constructor is utilized to create the object.
 *    A parameter is a copied value that is passed to in a method call for use in a method.
 ***/
 
/*3B) An accessor method returns a a copy of the value of one of the object's
 *    fields. A mutator changes the value of that object's field. Accessor methods
 *    are often given names like "getFieldValue" and mutators are often given
 *    names like "setFieldValue" or "changeFieldValue".
 *
 *3C) To write a class whose objects can easily be printed by the console, you
 *    must write a custom "toString" method for that class that displays the
 *    the classes information in a useful format.
 ***/
 
/*4A) To ensure that each stat value is less than 255, and that the stat total value
 *    is never greater than 510, you would need to throw illegalArgumentExceptions.
 *    For example, when constructing a Pokemon object with an attack value, as part of
 *    the constructor, you would write something like:
 *    if(baseAttack !< 255)
 *       throw new illegalArgumentException
 *
 *4B) Class invariants are not inherent to code, they are decided by the programmer
 *    designing his objects. Class invariants represent a limitation that the prgrammer
 *    desires in his code so as to prevent malicious mis-use, among other reasons,
 *    such as balance in a game program.
 ***/
