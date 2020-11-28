// Sara Nersisian
// CS1400, section 05
// Project 8 - Employee Inheritance
// 11/16/2020

public class WorkerTest
{
   public static void main(String[] args)
   {  
      System.out.println("Here's the first production worker.");      
      ProductionWorker employee1 = new ProductionWorker("John Smith", "123-A",
                                                        "11-15-2005",1, 23.50);
      System.out.println(employee1);
      System.out.println("\nHere's the second production worker.");
      ProductionWorker employee2 = new ProductionWorker();
      employee2.setName("Joan Jones");
      employee2.setNumber("225-L");
      employee2.setHireDate("12-12-2018");
      employee2.setShift(2);
      employee2.setHourlyPayRate(18.50);
      System.out.println(employee2);     
      System.out.println("\nHere's the third production worker.");
      ProductionWorker employee3 = new ProductionWorker("Tony Gaddis", "12A-x1",
                                                        "1-23-2006",3, 19.50);
      System.out.println(employee3);

   }
}
