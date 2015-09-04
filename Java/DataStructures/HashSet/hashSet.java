import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt(); sc.nextLine();
        
        int pairs = 0;
        HashSet<String> set = new HashSet<>();
        
        for (int i = 0; i < cases; i++) {
            String line   = sc.nextLine();
            set.add(line);
            System.out.println(set.size());         
        }
    }
}
