public class Car
{
   private int yearModel;
   private String make;
   private int speed;
   public Car(int yearModel_here, String make_here)
   {  
      yearModel = yearModel_here;
      make = make_here;
      speed = 0;  
   }
   public void setYearModel(int yearMod)
   { 
      yearModel = yearMod;
   }
   public void setMake(String makeName)
   {
      make = makeName;
   }
   public void setSpeed(int spd)
   {
      speed = spd;
   }
   public int getYearModel()
   {
      return yearModel;
   }
   public String getMake()
   {
      return make;
   }
   public int getSpeed()
   {
      return speed;
   }
   public int accelerate(int spd)
   {
      spd+=5;
      return spd;
   }
   public int breaking(int spd)
   {
      spd-=5;
      return spd;
   }
      
}
