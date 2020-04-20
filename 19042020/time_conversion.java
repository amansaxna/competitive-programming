//https://www.hackerrank.com/challenges/time-conversion
//string formatting
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class time_conversion {


    static String timeConversion(String s)
    {
    	String hh1 = "" + s.charAt(0);
        String hh2 = "" + s.charAt(1);
        int i = (Integer.parseInt(hh1)*10 + Integer.parseInt(hh2) );
        if(s.contains("AM"))
        {
            //System.out.println("AM");
            if( i == 12)	
            {
            	String f_s =  ""+ 0 + 0 +":" +  s.charAt(3) + s.charAt(4) +":"+ s.charAt(6)+ s.charAt(7);
            	return f_s;
            }
            else
            {
            	String f_s =  ""+s.charAt(0) + s.charAt(1)+":" +  s.charAt(3) + s.charAt(4) +":"+ s.charAt(6)+ s.charAt(7);
            	return f_s;
            }
           
        }
        else if(s.contains("PM"))
        {
            //System.out.println("PM");
            if( i == 12 )
            {
                            String f_s = ""    + i +":" +  s.charAt(3) + s.charAt(4) +":"+ s.charAt(6)+ s.charAt(7);
            return f_s;    
            }
            else
            {
                i += 12;
                 String f_s = ""    + i +":" +  s.charAt(3) + s.charAt(4) +":"+ s.charAt(6)+ s.charAt(7);
            return f_s;    
            }
            //System.out.println(i);
        }
        return s;
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
 		String s = sc.nextLine();
 		System.out.println(s);
 		String f_s = timeConversion(s);
 		System.out.println(f_s);
    }
}
