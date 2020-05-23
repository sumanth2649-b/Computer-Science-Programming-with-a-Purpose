public class GreatCircle
{
   public static void main(String[] args)
   {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);
    double d = Double.parseDouble(args[3]);

    double x1 = Math.toRadians(a);
    double x2 = Math.toRadians(c);
    double x = Math.toRadians(c-a);
    double y = Math.toRadians(d-b);

    double r = 6371.0;

    double q = Math.pow(Math.sin(x/2), 2)+  
    Math.pow(Math.sin(y/2), 2)*  
    Math.cos(x1)*  
    Math.cos(x2);
    double q1 = Math.sqrt(q);
    double dis = Math.asin(q1)*2*r;
    System.out.println(dis + " kilometers ");     
  }
}