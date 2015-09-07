import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num    = sc.nextInt();
        
        int[][] matrix   = new int[num][num];
        int diagOne = 0;
        int diagTwo = 0;
        
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++){
                matrix[i][j] = sc.nextInt();
            }  
        }
        
        for (int i = 0; i < num; i++) {
            diagOne += matrix[i][i];
            diagTwo += matrix[i][num - i - 1];
        }
        
        System.out.println(Math.abs(diagOne-diagTwo));
        
    }
}
