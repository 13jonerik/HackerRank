import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num    = sc.nextInt();
        long sum   = 0;
        for (int i = 0; i < num; i++){
            sum += (long) sc.nextInt();
        }
    
        System.out.println(sum);
    }
}
