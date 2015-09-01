import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Byte len = sc.nextByte();
        sc.nextLine();
        
        String[] in = sc.nextLine().split(" ");
        int[] intArr = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            intArr[i] = Integer.parseInt(in[i]);
        }
        
        int count   = 0;
        int sum;
    
        for (int i = 0; i < len; i++) {
            sum = 0;
            sum += intArr[i];
            if (sum < 0) {
                ++count;
            }
            
            for (int j = 1 + i; j < len; j++) {
                sum += intArr[j];
                if (sum < 0) {
                    ++count;
                }
            }
        }
        
        System.out.println(count);
    
    }
}
