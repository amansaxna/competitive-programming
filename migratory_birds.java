//https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class migratory_birds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(int[] arr)
    {
        int[] o_arr = {0,0,0,0,0};
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i] == 1) {o_arr[0]++;}
            else if(arr[i] == 2) {o_arr[1]++;}
            else if(arr[i] == 3) {o_arr[2]++;}
            else if(arr[i] == 4) {o_arr[3]++;}
            else/*(arr[i] == 5)*/ {o_arr[4]++;}
        }   
        System.out.println(Arrays.toString(o_arr));
        //find the largest
        int o_largest = o_arr[0];
        int index=1;
        for(int i =0; i<o_arr.length; i++)
        {
            if(o_largest < o_arr[i])    {o_largest = o_arr[i]; index = i+1;}
        }
        System.out.println(o_largest);
        return index;
    }

    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int result = migratoryBirds(arr);
        System.out.println(result);
        
        
    }
}
