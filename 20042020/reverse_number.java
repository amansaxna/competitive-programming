import java.util.*;

class reverse_number
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rnum =0;
		while(num > 0)
		{
			
			rnum = rnum * 10 + num % 10 ;
			num = num/10; 
		}
		System.out.println("reverse_number of the "+ rnum);
	}
}