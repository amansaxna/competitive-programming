//bon-appetit
//https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true
import java.util.*;

public class bon_appetit
{
	static void bonAppetit(int[] bill, int except, int charged) 
	{
		 //sum of all except "except"/ 2
		int total_value = 0,actual_value =0;
		for(int i=0; i< bill.length; i++)
		{
			if(i != except )
			{
				total_value += bill[i];
			}
		}
		actual_value = total_value/2;
		if(actual_value == charged)
		{
			System.out.println("Bon Appetit");
		}
		else
		{
			System.out.println(charged-actual_value );
		}

	}

    public static void main(String[] args) 
    {
       	Scanner sc = new Scanner(System.in);
       	int no_of_items = sc.nextInt();
       	int except = sc.nextInt();

        int[] bill = new int[no_of_items];

        for (int i = 0; i < no_of_items; i++) {
            bill[i] = sc.nextInt();
        }
        int charged = sc.nextInt();
        bonAppetit(bill, except, charged);

    }
}