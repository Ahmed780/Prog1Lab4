/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 * This programs asks the user for a word.
 * If the word does not contain an @ character, then the user is asked for another word. 
 * @author Uzair Ahmed 
 */

public class Q44 {
  public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    String word;
        
    System.out.println("please enter a word with @");
    word = sc.next();
        
    while (! word.contains("@")) {
    //while the word doesnt contain @, ask the user for another word (@)
    System.out.println("Try again");
    word = sc.next();
    System.out.println("The word is "+word);
    }


    }
}
  


