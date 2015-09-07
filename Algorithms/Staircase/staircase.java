import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String repeat;
        String pounder;
        for (int i = 1; i <= num; i++){
            repeat = new String(new char[num - i]).replace("\0", " ");
            pounder = new String(new char[i]).replace("\0", "#");
            System.out.println(repeat + pounder);
        }
    
    }
}
