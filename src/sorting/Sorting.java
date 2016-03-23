package sorting;

import java.util.Random;


public class Sorting {

    public void insertionsort(int[] a){
    	for(int i=0;i<a.length-1;i++){
			int j=i;
			int key=a[i+1];
			while((j>=0) && (a[j]>key)){
				int t=a[j];
				a[j]=key;
				a[j+1]=t;
				j--;
			}
		}
    }
    private int quicksortPartition(int[] A,int lo, int hi)
    {
    	Random r=new Random();
    	int n=r.nextInt(hi-lo)+lo;
    	int pivot=A[n];
    	
    	while(hi>=lo){
    		while(A[hi]>pivot) hi--;
    		while(A[lo]<pivot) lo++;
    		if(hi>=lo){
    			int temp=A[hi];
    			A[hi]=A[lo];
    			A[lo]=temp;
    			lo++;
    			hi--;
    		}	
    	};
    	return lo;
    }
    public void quicksort(int[] A,int lo, int hi)
    {
    	  int index = quicksortPartition(A, lo, hi);
	      if (lo < index - 1)
	    	  quicksort(A, lo, index - 1);
	      if (index < hi)
	    	  quicksort(A, index, hi);
    }
    public void bubblesort(int[] a){
    	for(int i=0;i<a.length-1;i++){
    		for(int j=0;j<a.length-(i+1);j++){
    			if(a[j]>a[j+1]){
    				int t=a[j];
    				a[j]=a[j+1];
    				a[j+1]=t;
    			}
    		}
    	}
    }
    public void selectionsort(int[] a){
    	for(int i=0;i< a.length-1; i++){
    		int minIndex=i;
    		for(int j=i+1;j<a.length;j++)
    				if(a[j]<a[minIndex])
    						minIndex=j;
    		 if(minIndex!=i){
    			 int t=a[i];
    			 a[i]=a[minIndex];
    			 a[minIndex]=t;
    		 }
    	}
    }
}
