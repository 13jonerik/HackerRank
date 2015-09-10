import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first  = sc.nextInt();
        int second = sc.nextInt();
        int nth    = sc.nextInt();
        
        BigInteger firstIndex = BigInteger.valueOf(first);
        BigInteger secondIndex = BigInteger.valueOf(second);
        
        BigInteger sum =  BigInteger.valueOf('0');
        BigInteger temp;


        for (int i = 0; i < nth - 2; i ++) {
            temp = secondIndex.multiply(secondIndex);
            sum = temp.add(firstIndex);
            firstIndex = secondIndex;
            secondIndex = sum;
        }
        
        System.out.println(sum);
    }
}
