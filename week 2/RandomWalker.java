public class RandomWalker
{
 public static void main(String[] args)
 {
  int r = Integer.parseInt(args[0]);
  int x = 0;
  int y = 0;
  int count = 0;
  System.out.println("("+x+", "+y+")");
  
  while (Math.abs(x) + Math.abs(y) < r)
  {
   double n = Math.random();
   if (n < 0.25)
   {
    x--;
   }
   else if (n < 0.50)
   {
    x++;
   }
   else if (n < 0.75)
   {
    y--;
   }
   else if (n <= 1.0)
   {
    y++;
   }
   System.out.println("("+x+", "+y+")");
   count++;
  }
  System.out.println("steps = "+count);
  
 }
}