import java.util.*;

public class Factorial {
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
  

