public class RandomWalkers {
public static void main(String [] args){
    int r = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);
    int x = 0;
    int y = 0;
    double averageSteps = 0;
    int steps = 0;
    for(int i = 0 ;i < (trials) ;i++)
    {
        x=0;
        y=0; 
        while(Math.abs(x) + Math.abs(y) < r)
        {
            double random = Math.random();
            if (random < 0.25)
            {
                x++;
            }
            else if (random < 0.50){
                x--;
            }
            else if (random < 0.75){
                y++;
            }
            else if (random < 1)  {
                y--;
            }
            steps++;
        }
    }
    averageSteps = ((double)steps / (double)trials);
    System.out.println("average steps = " + averageSteps);
}
}