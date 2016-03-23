package hackerrank.datastructures;

import java.util.Scanner;

public class Tickets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (n >= 1 && n <= 100000) {
			int[] a = new int[n];
			int arrSum = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if( a[i]>=1 && a[i]<=100000)arrSum += a[i];
				else 
				{
					m=-1;
					break;
				}
				
			}

			if (m >= 1 && m <= arrSum) {
				int sum = 0, max, index = 0;
				for (int i = 0; i < m; i++) {
					max = a[0];
					for (int j = 1; j < n; j++) {
						if (a[j] > max) {
							max = a[j];
							index = j;
						}
						
					}
					a[index] = a[index] - 1;
					sum += max;
				}
				System.out.println(sum);
			}

		}
	}

}
