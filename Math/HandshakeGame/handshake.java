import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int tests = sc.nextInt();
        int attendees;
        for (int i = 0; i < tests; i++) {
            attendees = sc.nextInt();
            if (attendees == 1) {
                System.out.println(0);
            } else {
                System.out.println(((attendees-1)+1)*(attendees-1)/2 );
            }      
        } 
    }
}
