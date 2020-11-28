// Sara Nersisian
// CS1400, section 05
// Project 8 - Employee Inheritance
// 11/16/2020

import java.text.DecimalFormat;
public class ProductionWorker extends Employee
{
   private int shift;
   private double hourlyPayRate;
   public ProductionWorker()
   {
      shift = 1;
      hourlyPayRate = 0.0;
   }
   public ProductionWorker(String name, String number,
                           String hireDate, int shift,
                           double hourlyPayRate)
   {
      super(name,number,hireDate);
      this.shift = shift;
      this.hourlyPayRate = hourlyPayRate; 
   }
   public void setShift(int shift)
   {
      this.shift = shift;
   }
   public void setHourlyPayRate(double hourlyPayRate)
   {
      this.hourlyPayRate = hourlyPayRate;
   }
   public int getShift()
   {
      return shift;
   }
   public double getHourlyPayRate()
   {
      return hourlyPayRate;
   }
   public String toString()
   {
      String dayOrNight;
      if(shift==1)
         dayOrNight = "Day";
      else if(shift ==2)
         dayOrNight = "Night";
      else
         dayOrNight= "INVALID SHIFT NUMBER";

      DecimalFormat df = new DecimalFormat("#.00");
      return super.toString() 
             + "\nShift: " + dayOrNight
             + "\nHourly Pay Rate: $" + df.format(hourlyPayRate);
   }  
}
