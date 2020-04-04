//https://www.codechef.com/NOV19B/problems/HRDSEQ

import java.util.*;

public class Hard_Sequence{
	    public static void main(String[] args) {
	    	try {
	    	Scanner sc = new Scanner(System.in);
	    	int T = sc.nextInt();
	    	for (int m=0;m<T;m++) {
	    	int x = sc.nextInt();
	    	int N = x;
	    	int a[] = new int[129];
	    	a[0] = 0;
	    	a[1] = 0;
	    	for(int i=1;i<N;i++) {
	    		int flag = 0;
	    		int count = i;
	    		for(int j=i-1;j>=0;j--) {

	    			if(a[j] == a[i]) {
	    				flag = 1;
	    				count--;
	    				break;
	    			}
	    			count--;

	    		}
	    		if(flag == 0)
	    			a[i+1] = 0;
	    		else
	    			a[i+1] = i-count;
	    	}

	    	int count1 = 0;
	    	for(int k=0;k<N;k++) {
	    		//System.out.print(a[k]+" ");
	    		if(a[N-1] == a[k])
	    			count1++;
	    	}

			System.out.println(count1);
			sc.close();
	    	}
	    	}
	    	catch(Exception e) {
	    		System.out.println(e);
	    	}
	    }
	}
