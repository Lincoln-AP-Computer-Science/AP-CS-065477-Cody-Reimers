public class LogMessage
{
   
   private String machineId;
   private String description;
   
   public LogMessage(String message)
   {
      this.machineId = message.substring(0, message.indexOf(':'));
      this.description = message.substring(message.indexOf(':') + 1);
   }
   
   public boolean containsWord(String keyword)
   {
      String message = this.description;
      if(keyword.equalsIgnoreCase(message))
         return true;
      else if(keyword.equalsIgnoreCase(message.substring(0, (message.indexOf(' ') - 1))))
         return true;
      else if(message.indexOf(' ') != -1)
      {
         while(message.indexOf(' ') != -1)
         {
            message = message.substring(message.indexOf(' ') + 1);
            if(keyword.equalsIgnoreCase(message.substring(0, message.indexOf(' '))))
               return true;
         }
      }
      return false;
   }
   
   public String getMachineId()
   {
      return this.machineId;
   }
   
   public String getDescription()
   {
      return this.description;
   }
   
}  // end of LogMessage class