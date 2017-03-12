public class HockeyPlayer extends Athelete
{
   
   private String position;
   private int shotsMade; //if HockeyPlayer has position "goaley", enter saves made here
   
   public HockeyPlayer(String n, double h, double w, int pN, double sa, String t, String p, int sM)
   {
      super(n, h, w, pN, sa, "Hockey", t);
      this.position = p;
      this.shotsMade = sM;
   }
   
   public void makeShots(int shots) //use this method to add saves made for "goaley" players
   {
      this.shotsMade += shots;
   }
   
   public String getPosition()
   {
      return this.position;
   }
   
   public int getShotsMade()
   {
      return this.shotsMade;
   }
   
}