//https://www.hackerrank.com/challenges/time-conversion/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
      static String timeConversion(String s) {

        char twelve[] = s.toCharArray();
        char twenty4[] = new char[8];
        String s12 = new String("12:00:00AM");
        String noon = new String("12:00:00PM");
        String noon12 = new String("12:00:00");
        String noon00 = new String("00:00:00");

       // for(int i=2;i<6;i++)
            twenty4[2]=twelve[2];
            twenty4[3]=twelve[3];
            twenty4[4]=twelve[4];
            twenty4[5]=twelve[5];
            twenty4[6]=twelve[6];
            twenty4[7]=twelve[7];

        if(twelve[8]=='A'){
            if(s == s12)
                return noon00;
            else if(twelve[0]=='1' && twelve[1]=='2'){
                twenty4[0]='0';
                twenty4[1]='0';
                String string = new String(twenty4);
                return string;
            }
            else{
                twenty4[0]=twelve[0];
                twenty4[1]=twelve[1];
                String string = new String(twenty4);
                return string;
            }
        }

        else{
            if(s == noon)
                return noon12;
            else if(twelve[0]=='1' && twelve[1]=='2'){
                twenty4[0]='1';
                twenty4[1]='2';
                String string = new String(twenty4);
                return string;
            }
            else{
            String x = "" + (Integer.parseInt(s.substring(0,2)) + 12);
            char[] f = x.toCharArray();
            twenty4[0] = f[0];
            twenty4[1] = f[1];
            String lol = new String(twenty4);
            return lol;
          }
        }
    }



    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
