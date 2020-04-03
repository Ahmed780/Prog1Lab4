import java.util.*;
public class Q2
{
	public static void main(String[] args) {
			
		System.out.println("Enter an email");
		Scanner sc=new Scanner(System.in);
		String email=sc.nextLine();
		
		for (int i=0; i < email.length(); i++)
        email.charAt(i);
		
		if(email.contains("..")||email.contains(".@")||email.contains("@.")||email.contains("._.")){
		System.out.println("\nInvalid");
		}
		else if(email.endsWith(".")||email.endsWith("@"))
		System.out.println("\nInvalid");
		else if(email.contains("@")&&(email.contains(".")))
		System.out.println("\nValid");
		else
		System.out.println("\nInvalid");
	}
}
