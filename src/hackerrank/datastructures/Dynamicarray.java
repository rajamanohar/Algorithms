package hackerrank.datastructures;


import java.util.*;

public class Dynamicarray {

	void test(int[] a){
		a[0]=3;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Scanner sc=new Scanner(System.in);
    int N, Q;
    
    N = sc.nextInt();
    Q = sc.nextInt();
   if((N >= 1)&&( Q <= Math.pow(10, 5))){
    int lastans=0;
    int[][] a=new int[Q][3];
    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(N);
    
    for(int i=0;i<Q;i++){
		for (int j = 0; j < 3; j++)	
			a[i][j]=sc.nextInt();
    }
    for(int i=0;i<N;i++){
    	ArrayList<Integer> list1=new ArrayList<Integer>();
    	list.add(list1);
    }
    
    for(int i=0;i<Q;i++){
    	int x=a[i][1];
		int y=a[i][2];
		int seq=(x^lastans)% N;
		ArrayList<Integer> list1;
    	if(a[i][0]==1){
    			list1=list.get(seq);
				list1.add(y);
			}else if(a[i][0]==2){
				list1=list.get(seq);
				int size=list1.size();
				lastans=list1.get(y%size);
				System.out.println(lastans);
			}
    }
  
   }
	
	}

}
