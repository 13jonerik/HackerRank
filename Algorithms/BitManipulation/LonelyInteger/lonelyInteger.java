import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> mockStack = new ArrayList<>();
        int len = sc.nextInt(); sc.nextLine();
        int curr;
        for (int i = 0; i < len; i++) {
            curr = sc.nextInt();
            if (mockStack.contains(curr)) {
                mockStack.remove(new Integer(curr)); 
            } else {
                mockStack.add(curr);
            }
        }        
        System.out.println(mockStack.get(0)); 
    } 
}

