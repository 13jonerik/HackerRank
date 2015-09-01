import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        int entries = sc.nextInt(); sc.nextLine();     
        
        Map<String, Integer> map = new HashMap<String, Integer>(); 
        for (int i = 0; i < entries; i++) {
            String name = sc.nextLine();
            int number  = sc.nextInt(); sc.nextLine();
            map.put(name, number);
            
        }
        
        String[] inputs = new String[entries];
        for (int i = 0; i < entries; i++) {
            if (sc.hasNext()) {
                inputs[i] = sc.nextLine();
            }
        }
        
        for (String each : inputs) {
            if (map.containsKey(each)) {
                System.out.println(each + "=" + map.get(each));
            } else { System.out.println("Not found"); }
        }
    }
}
