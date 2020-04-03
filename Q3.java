
import java.util.*;

public class Q3 {
	public static void main(String[] args) {

		double random = Math.round(Math.random() * 100);
		double word;

		System.out.println(random);

		Scanner sc = new Scanner(System.in);

		System.out.println("Guess the number");
		word = sc.nextDouble();
		
		int a = 1;
		for (int i = 1; i < 10; i++) {
			
			if (word == random) {
				System.out.println("\nCorrect");
				i = 10;
			} else {
				System.out.println("Try Again!");
				word = sc.nextDouble();
				a += 1;
			}
		}
		if(a >= 10) {
			System.out.println("\nUnlucky");			
		}
	}

}