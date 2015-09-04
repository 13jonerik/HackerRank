import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num  = sc.nextInt(); sc.nextLine();
        
        List<int[]> lists = new ArrayList<int[]>();
        int[] temp; 
        
        for (int i = 0; i < num; i++) {
            int len = sc.nextInt(); 
            temp = new int[len + 1];
            temp[0] = len;
            
            for (int j = 1; j <= len; j++) {
                temp[j] = sc.nextInt();
            }
            lists.add(temp);
            sc.nextLine();
        }
       
        int queries = sc.nextInt(); 
        int line; 
        int index;
        
        for (int k = 0; k < queries; k++) {
            sc.nextLine(); 
            line  = sc.nextInt() - 1;
            index = sc.nextInt();
            try {
                System.out.println(lists.get(line)[index]);
            } catch(IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
    
}
