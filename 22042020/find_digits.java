//find_digits
import java.util.*;

class find_digits
{
	public static void main(String[] args) {
		int num = 10150;
		System.out.println("FInd no  of digits which divides the n");
		int temp_num =num , d_num =0;
		int count =0;
		//find individual digits
		while(temp_num > 0)
		{
			d_num = temp_num%10;
			temp_num = temp_num/10;
			if(d_num != 0)
			{
				if(num % d_num == 0)	{count++;}
			}
		}
		System.out.println(count);
	}
}