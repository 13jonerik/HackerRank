import java.io.*;
import java.util.*;

public class Solution {

      
   public static void main(String[] args) 
   {

          
     Scanner scan = new Scanner(System.in);
     String s=scan.nextLine();
                        
     StringTokenizer tokens = new StringTokenizer(s, " !,?._'@");
     System.out.println(tokens.countTokens());
     while (tokens.hasMoreTokens()) {
         System.out.println(tokens.nextToken());
     }

   }
}
