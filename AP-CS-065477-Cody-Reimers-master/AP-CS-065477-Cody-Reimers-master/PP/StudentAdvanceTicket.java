public class StudentAdvanceTicket
{

   private int ticketNumber;
   private int daysInAdvance;
   private double cost;
   
   public StudentAdvanceTicket(int tN, int dIA)
   {
      this.ticketNumber = tN;
      this.daysInAdvance = dIA;
      if(dIA >= 10)
         this.cost = 15.0;
      else
         this.cost = 20.0;
   }
   
   public int getTicketNumber()
   {
      return this.ticketNumber;
   }
   
   public int getDaysInAdvance()
   {
      return this.daysInAdvance;
   }
   
   public double getCost()
   {
      return this.cost;
   }
   
   public String toString()
   {
      return "Number: " + ticketNumber + ", Price: " + cost + " (ID required)";
   }

}