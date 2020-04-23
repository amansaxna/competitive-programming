//beautiful-days-at-the-movies
import java.util.*;
class beautiful_days_movies
{
	public static void main(String[] args) 
	{
		Scanner sc 	= new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int j = sc.nextInt();
		int count =0;
        for(int x= i; x <= j; x++)
        {
            //reverse of x
            int rx =0,temp_x =x;
            while(temp_x > 0)
            {
                rx = rx*10 + temp_x%10;
                temp_x = temp_x/10;
            }
            int b = Math.abs(x-rx);
            if(b%k == 0)    {count++;}

        }
        System.out.println(count);
	}
}