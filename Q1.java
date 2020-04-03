/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 * This program checks if a word is a palindrome or not.  if it reads the same backward as forward. 
 * A few examples are “civic”, “radar” and “level”.
 * @author Uzair Ahmed 
 */
public class Q1 {
  public static void main(String[] args) {
        
      String forward;
      String backward = "";
	  
      Scanner in = new Scanner(System.in);   
      System.out.println("Please enter a word/palindrome");  
      forward = in.next();
      String forward2 = forward.toLowerCase();
      forward2=forward2.replaceAll("[^a-z]","");
      int length = forward.length();   
      
      for ( int i = length - 1; i >= 0; i-- )  
      backward = backward + forward.charAt(i);  
      if (forward.equals(backward))  
      System.out.println("It is a palindrome.");  
      else  
      System.out.println("It isn't a palindrome."); 

    }
}
