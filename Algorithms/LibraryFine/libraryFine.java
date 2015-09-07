import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String endDate = sc.nextLine();

        String startDate   = sc.nextLine();
        
        int[] checkOut = new int[3];
        int[] turnIn   = new int[3];
        
        String[] start = startDate.split(" ");
        String[] end   = endDate.split(" ");
        
        
        
        for (int i = 0; i < 3; i++){
            checkOut[i] = Integer.parseInt(start[i]);
            turnIn[i]   = Integer.parseInt(end[i]);
        }
        
        System.out.println(calculateFine(checkOut, turnIn));
    }
    
    public static int calculateFine(int[] start, int[] end){
        int year  = end[2] - start[2];
        int month = end[1] - start[1];
        int day   = end[0] - start[0];
        int sum   = 0;
        
        if (year > 0) {
            return 10000;
        } else if (year == 0 && month > 0) {
            return 500 * month;
        } else if (year == 0 && month == 0 && day > 0) {
            return 15 * day;
        } else {
            return 0;
        }
    }
}
