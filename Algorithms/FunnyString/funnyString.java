import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num    = sc.nextInt(); sc.nextLine();
        
        String fwd;
        String rev;
        
        for (int i = 0; i < num; i++) {
            fwd = sc.nextLine();
            rev = new StringBuilder(fwd).reverse().toString();
            if(checkFunny(fwd, rev)) {
                System.out.println("Funny");
            } else { System.out.println("Not Funny"); }
        }
    }
    
    public static boolean checkFunny(String forward, String reverse){
        boolean check = true;
        int fwd;
        int rev;
        
        for (int i = 1; i < forward.length(); i++) {
            
            fwd = Math.abs((int) forward.charAt(i - 1) - (int) forward.charAt(i));
            rev = Math.abs((int) reverse.charAt(i - 1) - (int) reverse.charAt(i));
            
            if (fwd != rev) {
                check = false;
            }
        }
        return check;
    }
}
