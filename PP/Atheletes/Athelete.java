public abstract class Athelete
{
   
   private String name;
   private double height;
   private double weight;
   private int playerNumber;
   private double salary;
   private String sport;
   
   public Athelete(String n, double h, double w, int pN, double sa, String sp)
   {
      this.name = n;
      this.height = h;
      this.weight = w;
      this.playerNumber = pN;
      this.salary = sa;
      this.sport = sp;
   }
   
}