package hackerrank.alldomain.algorithms.implementation;

import java.util.Scanner;
import java.io.*;
import java.util.*;
public class SherlockBeast {
	
	public SherlockBeast(){

		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0;i<N;i++){
		    int cur=sc.nextInt();
			String number=SherlockBeast.fillin5s(cur);
			
					
		do{
			if(SherlockBeast.occurancedivby3(number) ){
				System.out.println(number);
				break;
			}
			else {
				number=SherlockBeast.fillin3sinlast3digits(number);
				if(number.equals("-1")){
					System.out.println("-1");
					break;
				}
				else if(SherlockBeast.occurancedivby5(number) && SherlockBeast.occurancedivby3(number)){
					System.out.println(number);
					break;
					
				}	
			}		
		}while(true);
		
		
		}
	
	
	}
public static String fillin5s(int n){
		
		String str2 = new String(new char[n]).replace("\0", "5");
		
		return str2;
	}
	public static boolean occurancedivby5(String n){
		
		int count = n.length() - n.replace("3", "").length();
		if(count % 5==0)return true;
		else return false;
	}
    public static String fillin3sinlast3digits(String n){
		
		//if length constraint fails print -1 and exit
    	if(n.length()<5)return "-1";
    	else {
    		int index=n.indexOf('3');
    		
    		if(index<5 && index > -1)return "-1";
    		else if(index==-1){
    			String str2 = new String(new char[5]).replace("\0", "3");
    			int subIndex=n.length()-5;
    			String res=n.substring(0, subIndex)+str2;
    			return res;
    		}
    		else{
    			int len=n.length()-index;
    			
    			String str2 = new String(new char[len]).replace("\0", "3");
    			String res=n.substring(0, index)+str2;
    			return res;
    		}
    	}
    
	}

	public static boolean occurancedivby3(String n){
		
		int count = n.length() - n.replace("5", "").length();
		if(count % 3==0)return true;
		else return false;
	}
	
}
