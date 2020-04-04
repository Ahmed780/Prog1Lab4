/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 * This program validates email addresses.  
 * It checks if an email contains @ and ._.
 * Examples of valid emails are araujot@vanier.college and araujot@vaniercollege.qc.ca, 
 * Invalid ones would be araujot&vanier.college or araujot@vanier.
 * @author Uzair Ahmed 
 */
public class Q2{
	public static void main(String[] args) {
			
	System.out.println("Enter an email");
	Scanner sc=new Scanner(System.in);
	String email=sc.nextLine();
		
	for (int i=0; i < email.length(); i++)
        email.charAt(i);
		
	if(email.contains("..")||email.contains(".@")||email.contains("@.")){
	System.out.println("\nThe email is invalid");
	}
	else if(email.endsWith(".")||email.endsWith("@"))
	System.out.println("\nThe email is invalid");
	else if(email.contains("@")&&(email.contains(".")))
	System.out.println("\The email is valid");
	else
	System.out.println("\nThe email is invalid");
	}
}
