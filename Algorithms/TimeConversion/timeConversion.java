import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dateBuffer = sc.nextLine();
    
        SimpleDateFormat printDate = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseDate = new SimpleDateFormat("hh:mm:ssa");
        try {
            Date date = parseDate.parse(dateBuffer);
            System.out.println(printDate.format(date));
        } catch (ParseException e) {
            e.getMessage();
        }
    }
}
