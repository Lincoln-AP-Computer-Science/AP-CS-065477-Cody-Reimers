public class BaseballPlayer extends Athelete
{
   
   private String position;
   private int runsMade;
   private int homeRunsMade;
   private boolean inBullpen;
   
   public BaseballPlayer(String n, double h, double w, int pN, double sa, String t, String p, int rM, int hRM, boolean iB)
   {
      super(n, h, w, pN, sa, "Baseball", t);
      this.position = p;
      this.runsMade = rM;
      this.homeRunsMade = hRM;
      this.inBullpen = iB;
   }
   
   public void makeRuns(int runs)
   {
      this.runsMade += runs;
   }
   
   public void makeHomeRuns(int homeRuns)
   {
      this.homeRunsMade += homeRuns;
   }
   
   public void addToBullpen()
   {
      this.inBullpen = true;
   }
   
   public void removeFromBullpen()
   {
      this.inBullpen = false;
   }
   
   public String getPosition()
   {
      return this.position;
   }
   
   public int getRunsMade()
   {
      return this.runsMade;
   }
   
   public int getHomeRunsMade()
   {
      return this.homeRunsMade;
   }
   
   public boolean getInBullpen()
   {
      return this.inBullpen;
   }
   
}