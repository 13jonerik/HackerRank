import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      Stack<String> stack = new Stack<String>();
       
      while (sc.hasNextLine()) {
          String[] input = sc.nextLine().split("");
          
          for (int i = 1; i < input.length; i++) {
              if (checkStack(input[i], stack)) {
                  stack.pop();
              } else {
                stack.push(input[i]); 
              }
          }

          if (stack.isEmpty()) { System.out.println(true); } 
          else { 
              System.out.println(false); 
              while (!stack.isEmpty()) {
                  stack.pop();
              }
          }
          
      }
      
   }
    
   public static boolean checkStack(String input, Stack stack) {
       
        if (stack.isEmpty()) { return false; }       
        switch(input) {
            case "}":
               if (stack.peek().equals("{")) { 
                   return true; 
               } else return false; 
           
            case "]":
               if (stack.peek().equals("[")) { 
                   return true; 
               } else return false; 
            
            case ")":
               if (stack.peek().equals("(")) { 
                   return true; 
               } else return false; 
            
           default: 
            return false; 
       }

   }
}
