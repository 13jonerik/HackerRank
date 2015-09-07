import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int negatives = 0;
        int positives = 0;
        int zeros     = 0;
        
        for (int i = 0; i < num; i++) {
            int curr = sc.nextInt();
            if (curr < 0)       { negatives += 1; }
            else if (curr > 0)  { positives  += 1; }
            else if (curr == 0) { zeros     += 1; }
        }
        
        float ne    = ((float) negatives) /  num;
        float pos   = ((float) positives) / num;
        float zero  = ((float) zeros)     / num;
        
        
        System.out.println(String.format("%.3f", pos));
        System.out.println(String.format("%.3f", ne));
        System.out.println(String.format("%.3f", zero));
    
    
    }
}
