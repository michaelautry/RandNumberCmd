package randnumbercmd;
/**
 *
 * @author michaelautry
 */
import java.util.Random;

public class RandNumberCmd 
{
public static void main(String[] args)
    { 
    Random random = new Random();
    int randomNumber;
    if(args.length == 2)
    {
        try 
        {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
       System.out.println("You have chosen to display " + args[0] + " integers between 0 and " + args[1]);
        for (int i = 0; i < x; i++)
            {
            randomNumber = random.nextInt(y);
            
            System.out.println(+randomNumber);
            }
        }
        catch (Exception x) 
        {
        System.err.println("What is this jibberish? Get with it, son!");
        System.exit(1);
        }
    }
    else
        {
        System.out.println("What? Did you enter two integers?");
        } 

        
    }
}
