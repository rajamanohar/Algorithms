package sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Algorithms {
	  public String decentNumber(int digLen){
	        if(digLen==1 || digLen==1000001) return "-1";
	        //Generating the number        
	        String s=Integer.toString(5);
	        String repeated = new String(new char[digLen]).replace("\0", s);
	        
	        Long rep= Long.parseLong(repeated);
	        
	        return repeated;
	    }
	    public static void main(String[] args) {
//	        Scanner in = new Scanner(System.in);
//	        int t = in.nextInt();
//	        Algorithms sl=new Algorithms();
//	        for(int a0 = 0; a0 < t; a0++){
//	           int n = in.nextInt();
//	            
//	           String decentNum=sl.decentNumber(n);
//	           System.out.println(decentNum);
//	            }
	    int[] a={5,1,8,6,9};
	    Sorting s=new Sorting();
	    s.quicksort(a,0, 4);
	    for(int i=0;i< a.length; i++)
	    	System.out.print(a[i]+" ");
	    	
	    }
}
