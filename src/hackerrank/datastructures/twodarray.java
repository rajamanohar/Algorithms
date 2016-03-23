package hackerrank.datastructures;

import java.util.Scanner;

public class twodarray {

	public void calSum2DArray()
	{
		int[][] a = new int[6][6];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			String s = sc.nextLine();
			String[] substr = s.split(" ");

			for (int j = 0; j < substr.length; j++)
				a[i][j]= Integer.parseInt(substr[j]);
		}
		int[] sumArr= new int[16];
		int k=0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++){
				int sum=0;
				sum+=a[i][j]+a[i][j+1]+a[i][j+2];
				sum+=a[i+1][j+1];
				sum+=a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
				sumArr[k++]=sum;
			}
				
		}
		int max=sumArr[0];
		for(int i=1;i<sumArr.length;i++)
			if(sumArr[i]>max)
				max=sumArr[i];
		System.out.println(max);
	}
	
}
