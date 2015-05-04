package family;

public class Family
{
   private String[] members;

   
   public Family(String ... names)
   {
      members = names;
   }

   
   public String toString()
   {
      String result = "";

      for (String name : members)
         result += name + "\n";

      return result;
   }
}
