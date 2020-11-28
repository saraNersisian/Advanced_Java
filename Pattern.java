
public class Pattern
{
   public static void main(String[] args)
   {
      for(int i=6; i>=1; i--)
         {
            for(int k=1; k<=i ; k++)
            {
                for(int j=1;j<=2;j++)
                   System.out.print(" ");
                System.out.print(k);   
            }
            System.out.println();
         }
   }
}
