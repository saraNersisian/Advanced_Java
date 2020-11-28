// Sara Nersisian
// CS1400, section 05
// Project 5 - Temperature Conversion Object
// 10/10/2020
public class Temperature 
{
   private double degrees;
   private char scale;
   public Temperature() 
   {
      degrees = 0;
      scale = 'C';
   }
   public Temperature(double dgr)
   {
      degrees = dgr;
      scale ='C';
   }
   public Temperature(char scl)
   {
      degrees = 0;
      if(isValid(scl))
         scale = scl;  
   }
   public boolean isValid(char scl)
   {
      while ( !(scl == 'C' || scl == 'c' || scl == 'F' || scl == 'f' ))
      {
         System.out.println("Invalid scale");
         System.exit(0);
      }
      return true;
   }
   public Temperature(double dgr, char scl)
   {
      degrees = dgr;
      if(isValid(scl))
         scale = scl; 
   }
   public double getDegreesC()
   {
      double degreesC = (degrees- 32) * 5 / 9; 
      if(scale =='C' || scale=='c')
         return degrees;
      else
         return degreesC;
   }
   public double getDegreesF()
   {
      double degreesF = (degrees * 9 / 5) + 32; 
      if( scale =='F' || scale=='f')
         return degrees;
      else
         return degreesF;		 
   }
   public void setDegrees(double dgr)
   {
      degrees = dgr;
   }
   public void setScale(char scl)
   {
      if(isValid(scl))
         scale = scl; 
   }
   public void setTemperature(double dgr, char scl)
   {
      degrees = dgr;
      if(isValid(scl))
         scale = scl; 
   }
   public boolean equals(Temperature other)
   {
      return this.getDegreesC() == other.getDegreesC() ;
   }
   public boolean lessThan(Temperature other)
   {
      return this.getDegreesC() < other.getDegreesC() ;
   }
   public boolean greaterThan(Temperature other)
   {
      return this.getDegreesC() > other.getDegreesC() ;
   }
}
