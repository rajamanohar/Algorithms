package hackerrank.datastructures;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter");
		String input = sc.nextLine();
		String temp[] = input.split(" ");
		int n = Integer.parseInt(temp[0]);
		int[] windows = new int[n];
		int m = Integer.parseInt(temp[1]);
		//System.out.println("Enter tickets left");
		String input2 = sc.nextLine();
		String temp1[] = input2.split(" ");
		for(int i=0;i<temp1.length;i++)
		{
			windows[i]=Integer.parseInt(temp1[i]);
		}
		int sum = sellTickets(windows,m);
	    System.out.println(sum);

	}

	private static int sellTickets(int[] windows, int m) {
		// TODO Auto-generated method stub
		int res=0;
		Comparator<Integer> numComparator = new Comparator<Integer>(){
			public int compare(Integer e1,Integer e2)
			{
				return e2 - e1;
			}
		};
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(numComparator);
		for(int num:windows)
		{
			//System.out.println("Added:"+num);
			queue.offer(num);
		}
		int i=m;
		while(i>0)
		{
			int count = queue.poll();
			//System.out.println("Polled:"+count);
			res+=count;
			queue.offer(count-1);
			i--;
		}
		return res;
	}

}
