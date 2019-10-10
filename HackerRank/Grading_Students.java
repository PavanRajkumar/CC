//https://www.hackerrank.com/challenges/grading/problem

import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            int marks = sc.nextInt();
            if(marks < 38)
                System.out.println(marks);
            else if(marks%10 == 0)
                System.out.println(marks);
            else if(marks%10<=5 && marks%10>=3) {
                int t = marks/10;
                int o = marks%10;
                System.out.println(t*10+5);
            }
            else if(marks%10>=8) {
                int t = marks/10;
                System.out.println((t+1)*10);
            }
            else
                System.out.println(marks);
        }
    }
}
