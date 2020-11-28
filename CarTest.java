public class CarTest
{
   public static void main(String[] args)
   {
      int speed=0;
      Car car = new Car(2018, "Porsche");
      System.out.println("Current status of the car: ");    
      System.out.println("YearModel: " + car.getYearModel() 
                          + "\nMake: " + car.getMake()
                          + "\nSpeed: " + car.getSpeed() );
      System.out.println("\nAccelerating...");
      for(int i=1; i<=5; i++)
         speed =  car.accelerate(speed);
      System.out.println("Now the speed is " + speed );
      System.out.println("\nBreaking...");
      for(int j=1; j<=5; j++)
         speed = car.breaking(speed);
      System.out.println("Now the speed is " + speed);
   }
}
