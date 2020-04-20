//https://www.baeldung.com/java-round-decimal-number
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class plus_minus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double lt=0 ,gt=0 ,z=0;
        for (int i=0;i<arr.length;i++) 
        {
            if(arr[i]>0)    {gt++;}
            else if(arr[i]<0)   {lt++;}
            else {z++;}
        }
        System.out.println(gt);
        System.out.println(lt);
        System.out.println(z);
        double length=  arr.length;
        double f_gt= ((gt)/(arr.length));
        double f_lt= (lt)/(arr.length);
        double f_z= (z)/(arr.length);
        System.out.printf("%.6f %n", f_gt);
        System.out.printf("%.6f %n", f_lt);
        System.out.printf("%.6f %n", f_z);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
