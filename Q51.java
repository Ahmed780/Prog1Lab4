/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 * This program that uses a for loop to find the factorial of a given nmber
 * @author Uzair Ahmed 
 */
public class Q51 {
  public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
    	int n;
    	int result = 1;
        
    	System.out.println("please enter a number");
    	n = sc.nextInt();
      
	for (int i = 1; i <= n; i++) {
    	result = result * i;
    	}
    	System.out.println("The factorial of the number is " + result);
 
  }
}
  

