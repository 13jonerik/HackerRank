import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        BigInteger num = new BigInteger("1");
        int i = n;
        while ( n > 0) {
            num = num.multiply(BigInteger.valueOf(n));
            --n;
            
        }
        System.out.println(num);
    }
}
