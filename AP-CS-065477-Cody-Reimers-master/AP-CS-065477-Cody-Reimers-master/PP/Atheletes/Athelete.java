public abstract class Athelete
{
   
   private String name;
   private double height;
   private double weight;
   private int playerNumber;
   private double salary;
   private String sport;
   private String team;
   
   public Athelete(String n, double h, double w, int pN, double sa, String sp, String t)
   {
      this.name = n;
      this.height = h;
      this.weight = w;
      this.playerNumber = pN;
      this.salary = sa;
      this.sport = sp;
      this.team = t;
   }
   
   public String getName()
   {
      return this.name;
   }
   
   public double getHeight()
   {
      return this.height;
   }
   
   public double getWeight()
   {
      return this.weight;
   }
   
   public int getPlayerNumber()
   {
      return this.playerNumber;
   }
   
   public double getSalary()
   {
      return this.salary;
   }
   
   public String getSport()
   {
      return this.sport;
   }
   
   public String getTeam()
   {
      return this.team;
   }
   
}