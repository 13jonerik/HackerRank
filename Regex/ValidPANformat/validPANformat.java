import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static boolean isValidPAN(String s) {
        String regex = "^[A-Z]{5}[0-9]{4}[A-Z]";
        if (s.matches(regex)) return true;
        else { return false; }
        
    }
  
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int i = Integer.parseInt(br.readLine());
            for (int j = 0; j < i; j++) {
                String s = br.readLine();
                System.out.println(isValidPAN(s) ? "YES" : "NO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
