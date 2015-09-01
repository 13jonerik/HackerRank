import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] in = new int[6][6];
        
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++){
                in[row][col] = sc.nextInt();
            }
            sc.nextLine();
        }
        
        int maxSum = -63;
        
        for (int row = 0; row < 4; row++){
            for (int col = 0; col < 4; col++){
                int tempSum = sumHourglass(in, row, col);
                if (tempSum > maxSum) {
                    maxSum = tempSum;
                }
            }
        }
        
        System.out.println(maxSum);
        
    }
    
    public static int sumHourglass(int[][] in, int row, int col) {
       
        int sum = 0;
        
        int column = col;
        sum += in[row][column++];
        sum += in[row][column++];
        sum += in[row][column++];
        
        column = col + 1; 
        row += 1;
        sum += in[row][column];
        
        row += 1;
        column = col;
        sum += in[row][column++];
        sum += in[row][column++];
        sum += in[row][column++];
        
        return sum; 
    }
}
