import java.util.*;

public class Count {
  public static void main(String[] args) {

        int multiples=0;
        for(int i=33;i<=97;i++){

        if(i%7==0)	{
        System.out.println(i);
        multiples+=1;
            }
        }
        System.out.println("Number of multiples of 7 between 33 and 97: "+multiples);
  }
}
  

// Write a program that uses a for loop to count how many multiples of 7 are between 33 and 97, inclusive