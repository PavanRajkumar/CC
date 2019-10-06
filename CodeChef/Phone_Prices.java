//https://www.codechef.com/OCT19B/problems/S10E

import java.util.*;

public class Codechef {

	static void compute(int[] arr, int N) {
		int good = 0;
		for(int i=5;i<N+5;i++){
			int count = 0;
			for(int j=i-1;j>=i-5;j--){
				if(arr[i]<arr[j]){
					count++;
					if(count==5)
						good++;
				}
				else
					break;
			}
		}
		System.out.println(good);
	}


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int N = sc.nextInt();
			int arr[] = new int[N+5];
			for(int k=0;k<5;k++)
				arr[k]=999;
			for(int j=5;j<N+5;j++)
				arr[j]=sc.nextInt();
			compute(arr,N);
		}
	}
}
