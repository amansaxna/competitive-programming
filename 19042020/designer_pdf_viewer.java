//designer-pdf-viewer
//https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class designer_pdf_viewer {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) 
    {
    	System.out.println(word);
    	int[] height_word = new int[word.length()];
    	for(int i =0; i<word.length();i++)
    	{
    		int ch =0;
    		ch = (int)word.charAt(i);
    		System.out.println(ch-'a');
    		//convert int ch -> relative Index 
    		ch = ch - 'a'; /*ASCII(a)*/ 
    		height_word[i] = h[ch];
    	}
    	//find max_height
    	int max_height =0;
    	for(int i : height_word)
    	{
    		if(i> max_height)	{max_height = i;}
    	}

    	return (max_height * word.length());

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);        
        int[] h = new int[26];

        for (int i = 0; i < 26; i++) {
            h[i] = sc.nextInt();
        }
        sc.nextLine();
        String word = sc.nextLine();

        int result = designerPdfViewer(h, word);

        System.out.println(result);

        scanner.close();
    }
}
