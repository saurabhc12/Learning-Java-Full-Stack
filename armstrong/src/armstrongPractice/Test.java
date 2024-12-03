package armstrongPractice;

import java.util.*;
public class Test {
      public static void main(String[] args) {
    	  
    	  Scanner sc=new Scanner(System.in);
    	  
    	  System.out.print("Enter a number: ");
    	  int number = sc.nextInt();
          

    	  int originalNumber = number;
          int result = 0;
    	          int n = 0;

    	          
        while (originalNumber != 0) {
    	              originalNumber /= 10;
    	              n++;
    	          }

    	          originalNumber = number;

    	          while (originalNumber != 0) {
    	              int remainder = originalNumber % 10;
    	              result += Math.pow(remainder, n);
    	              originalNumber /= 10;
    	          }

    	          if (result == number) {
    	              System.out.println(number + " is an Armstrong number.");
    	          } else {
    	              System.out.println(number + " is not an Armstrong number.");
    	          }
    	      }
    	  

	
      

}
