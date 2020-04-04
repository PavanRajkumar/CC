//https://www.codechef.com/APRIL20B/problems/CARSELL

import java.util.*;
import java.lang.*;

class CARSELL{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=0;t<T;t++){
            int N = sc.nextInt();
            Integer arr[] = new Integer[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr,Collections.reverseOrder());
            int sum = 0;
            for(int j=0;j<N;j++){
                int p = arr[j] - j;
                if(p<=0)
                    p = 0;
                sum = sum + p;
                sum = sum % 1000000007;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}