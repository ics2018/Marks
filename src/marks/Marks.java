/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marks;
import java.util.Scanner;
/**
 *
 * @author rkaune
 */
public class Marks {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        double mark;
        System.out.print("Please enter your course mark ");
        mark = keyedInput.nextDouble();
        
        if (mark>=80){
            System.out.println("You received an A.");
        }
        else if (mark>=70){
            System.out.println("You received a B.");
        }
        else if (mark>=60){
            System.out.println("You received a C.");
        }
        else if (mark>=50){
            System.out.println("You received a D.");
        }
        else {
            System.out.println("Sorry, you have failed.");
        }
        keyedInput.close();
        // TODO code application logic here
    }
    
}
