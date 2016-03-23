import java.util.Random;
import java.util.Scanner;

public class TowersOfHanoi {

	public void solve(int n, String start, String auxiliary, String end) {
		if (n == 1) {
			System.out.println(start + " -> " + end);
		} else {
			solve(n - 1, start, end, auxiliary);
			System.out.println(start + " -> " + end);
			solve(n - 1, auxiliary, start, end);
		}
	}

	int quicksortPartition(int[] A, int lo, int hi) {
		Random r = new Random();
		int n = r.nextInt(hi - lo) + lo;
		
		int pivot = A[n];
		
		
		while (hi >= lo) {
			while (A[hi] > pivot) {
				hi--;
			}
			while (pivot > A[lo]) {
				lo++;
			}
			if (hi >= lo) {
				int temp = A[hi];
				A[hi] = A[lo];
				A[lo] = temp;
				lo++;
				hi--;
			}
		};
		return lo;

	}

	void quickSort(int arr[], int left, int right) {
	      int index = quicksortPartition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	}

	public static void main(String[] args) {

		int[] A={6,9,3,10,7,8,9};
		
		TowersOfHanoi t=new TowersOfHanoi();
		t.quickSort(A, 0, A.length-1);
		
		for(int i=0;i<A.length;i++)
			System.out.println(A[i]+" ");
		
	}

}
