package cc;

import java.util.*;

public class CodeForces{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            if(s.length()>10){
            	char a = s.charAt(0);
            	int b = s.length()-2;
            	char c = s.charAt(s.length()-1);
                System.out.print(a);
                System.out.print(b);
                System.out.print(c);
            }
            else{
                System.out.println(s);
            }
        }
    }
}
