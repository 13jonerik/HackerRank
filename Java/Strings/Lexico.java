import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc      = new Scanner(System.in);
        String input    = sc.nextLine();
        int len         = sc.nextInt();
        
        char[] chars = input.toCharArray();
        String high     = "";
        String low      = "";
        String current  = "";
        
        high    = setLen(len, chars, 0);
        low     = setLen(len, chars, 0);
        current = setLen(len, chars, 0);
           
        for (int i = 0; i < chars.length - (len-1); ++i){
            if (current.compareTo(low) < 0)  { low  = current; }
            if (current.compareTo(high) > 0) { high = current; }
            current = setLen(len, chars, i);
        }
        
        if (current.compareTo(low) < 0)  { low  = current; }
        if (current.compareTo(high) > 0) { high = current; }
        
        System.out.println(low);
        System.out.println(high);
        
    }
    
    public static String setLen(int length, char[] chars, int current) {
        String str = "";
        for (int i = 0; i < length; i++) {
            str = str + chars[current++];
        }
        
        return str;
    }
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc      = new Scanner(System.in);
        String input    = sc.nextLine();
        int len         = sc.nextInt();
        
        char[] chars = input.toCharArray();
        String high     = "";
        String low      = "";
        String current  = "";
        
        high    = setLen(len, chars, 0);
        low     = setLen(len, chars, 0);
        current = setLen(len, chars, 0);
           
        for (int i = 0; i < chars.length - (len-1); ++i){
            if (current.compareTo(low) < 0)  { low  = current; }
            if (current.compareTo(high) > 0) { high = current; }
            current = setLen(len, chars, i);
        }
        
        if (current.compareTo(low) < 0)  { low  = current; }
        if (current.compareTo(high) > 0) { high = current; }
        
        System.out.println(low);
        System.out.println(high);
        
    }
    
    public static String setLen(int length, char[] chars, int current) {
        String str = "";
        for (int i = 0; i < length; i++) {
            str = str + chars[current++];
        }
        
        return str;
    }
}
