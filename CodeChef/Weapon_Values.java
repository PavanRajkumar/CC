//https://www.codechef.com/NOV19B/problems/SC31

import java.util.*;

import java.lang.*;
	public class CodeForces{
	    public static void main(String[] args) {
	    	try {
	    		Scanner sc = new Scanner(System.in);
	    		int T = sc.nextInt();

	    		for(int m=0;m<T;m++) {

	    			int N = sc.nextInt();

	    			if(N == 1) {
	    				int count = 0;
	    				String str = sc.next();
	    				char temp1[] = str.toCharArray();
	    				for(int x=0;x<temp1.length;x++)
	    					if(temp1[x] == '1')
	    						count++;
	    				System.out.println(count);
	    			}

	    			else {

	    				String str1 = sc.next();
	    				String str2 = sc.next();
	    				char res[] = new char[10];
	    				for(int y=0;y<10;y++) {
	    					if(str1.charAt(y) == str2.charAt(y))
	    						res[y] = '0';
	    					else
	    						res[y] = '1';
	    				}

	    				for(int j=3;j<=N;j++) {
	    					String s = sc.next();
	    					char temp[] = s.toCharArray();
	    					for(int z=0;z<10;z++) {
		    					if(temp[z] == res[z])
		    						res[z] = '0';
		    					else
		    						res[z] = '1';
		    				}

	    				}

	    				int count1 = 0;
	    				for(int r=0;r<10;r++)
	    					if(res[r] == '1')
	    						count1++;
	    				System.out.println(count1);


	    			}


	    		}
	    	}
	    	catch(Exception e) {
	    		//ignore
	    	}
	    }
	}
