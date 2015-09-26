import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static class Node {
        int val;
        boolean flag;
 
        Node (int val, boolean flag) {
            this.val = val;
            this.flag = flag;
        }
        
        void turnOnFlag(Node node) {
            node.flag = true;
        }
        
        void turnOffFlag(Node node) {
            node.flag = false; 
        }

    }
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int q = sc.nextInt();
        Node[] elements = new Node[N];
        int l;
        int k;
        
        for (int i = 0; i < N; i++) {
            elements[i] = new Node(sc.nextInt(), false);
        }
        
        for (int j = 0; j < q; j++) {
            l = sc.nextInt();
            k = sc.nextInt();
            
            for (Node each : elements) {
                if (each.val >= l) {
                    each.flag = true;
                }
            }
                
            int count = 0;
            for (int t = 0; t < N; t++) {
                if (elements[t].flag == true) {
                ++count;
                }
                    
                if (count == k) { 
                    System.out.println(elements[t].val);
                    t = N;
                }
            }
            
            for (Node each : elements) {
                each.flag = false;
            }
            
        }
    }
}
