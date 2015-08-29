import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine(); 
        
        for (int i = 0; i < cases; i++) {
            
            int len = sc.nextInt();
            int jmp = sc.nextInt();
            sc.nextLine();
            
            int arrLen      = jmp + len; 
            int[] gameBoard = new int[arrLen];
            
             
            for (int j = 0; j < len; j++) {         // first loop fills in the 0's and 1's from input
                gameBoard[j] = sc.nextInt();
            }
            
            for (int j = len; j < arrLen; j++) {    // fill the remaining gameBoard with 2's to indicate win
                gameBoard[j] = 2;
            }
            
            if(sc.hasNext()) { sc.nextLine(); }   // move scanner, complete game below and scanner ready for next game within loop
            
            int play = 0;                // track number of moves
            int current = 0;             // track 'pointer' on the game board
            boolean endWin = false;      // track win / loss
            boolean loopFlag = false;     // track to make sure current isn't going back and forth
            
            while (play < len && !endWin) {
                
                if (gameBoard[current] == 2 || gameBoard[current + 1] == 2) { endWin = true; }  // if current points to a 2, win
                
                else if (gameBoard[current + jmp] == 0 || gameBoard[current + jmp] == 2) {      // greedy -- jump if can
                    loopFlag = false;
                    current = current + jmp;
                    ++play;
                } else if (gameBoard[current + 1] == 0) {                                       // greedy -- step if cant jump
                    loopFlag = true;
                    current = current + 1;
                    ++play;
                } else if (current != 0 && !loopFlag) {                      
                    if (gameBoard[current - 1] == 0) {                                          // step back if cant move forward
                        current = current - 1;
                        ++play;
                    }
                } else { play = len; }                                                           // if cant move, end game
                    
            }
            
            if (endWin) { System.out.println("YES"); }
            else        { System.out.println("NO");  }
            
        }
    }
}
