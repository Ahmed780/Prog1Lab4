import java.util.*;

public class Word {
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
  

//Write a program that expects a word containing the @ character as an input. If the word does not contain an @ character, then your program should keep prompting the user for a word. When the user types in a word containing an @ character, the program should simply print the word and terminate
