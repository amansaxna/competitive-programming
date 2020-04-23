//permutation-equation
//https://www.hackerrank.com/challenges/permutation-equation/problem

import java.util.*;

class permutation_equation
{
	public static void main(String[] args) 
	{
		System.out.println("time"+":"+"value" +"-->"+"total_in_cycle");
		long t= 31;
		long time =1, value=3,total_in_cycle=1;
		long s_time=1,e_time=1;
        while(true/*value !=1*/)
        {
            System.out.println(time+":"+value +"-->"+total_in_cycle);
            total_in_cycle = value;
            s_time= time;
            e_time = total_in_cycle+s_time-1;
            if(!(s_time<=t && t<=e_time))
            {
            	value = 2* value;
            	time = e_time+1; 
            	total_in_cycle =1;
            }
            else
            {
				System.out.println("with in this range");
            	int count = t-time;
            	int val = vlaue - count;
            	//break;
            	//while( true)
            	//{
            	//	System.out.println(time+":"+value +"-->"+count);
            	//	if(time == t) {break;}
            	//	time++;
            	//	value--;
            	//	count++;
            	//}
            	break;	
            }
        }
	}
}