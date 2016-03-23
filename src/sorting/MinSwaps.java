package sorting;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class MinSwaps  {
    public int swap(String A, String B){
    	
    	if(A.length()!=B.length())
			return -1;
		if(A.length()<1 || B.length()>1000)
			return -1;
		if(A.equals(B))
			return -1;
		int aCount = A.length() - A.replace("1", "").length();
		int bCount = B.length() - B.replace("1", "").length();
		if(aCount!=bCount)
			return -1;
		else{
			
			int i=0;
			int j=i+1;
			int swap=0;
			StringBuilder aStr = new StringBuilder(A);
			StringBuilder bStr = new StringBuilder(B);
			
			while(j<aStr.length()){
				if(aStr.charAt(i)==bStr.charAt(i)){
					i++;
					if(j==i)
						j++;
					}else{
					if(bStr.charAt(j)!=aStr.charAt(j)){
						if(bStr.charAt(i)!=bStr.charAt(j)){
							char c=bStr.charAt(i);
							bStr.setCharAt(i, bStr.charAt(j));
							bStr.setCharAt(j, c);
							swap++;
							i++;
						}
					}
					j++;
				}
				
			}
			return swap;
		}
		
    	
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc= new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		MinSwaps alg=new MinSwaps();
		int swapCount=alg.swap(A, B);
		System.out.println(swapCount);
			
	}

}

