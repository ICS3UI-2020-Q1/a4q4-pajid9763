import java.util.Scanner;
/**
 * program that calculates FizzBuzz pattern
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask the user for a positive integer
  System.out.println("Please enter a positive integer to see the FizzBuzz numbers");
  int num = input.nextInt();
  int i = 0;

  // loop for chosen period of times
  while (i < num){
    i = i + 1;

    // check if number is divisible by 5 and 3
    if (i % 5 == 0 && i % 3 == 0){
      System.out.println("FizzBuzz");

    // check if number is divisible by 5
    } else if (i % 5 == 0){
      System.out.println("Buzz");

    // check if number is divisible 3
    } else if (i % 3 == 0){
      System.out.println("Fizz");
    
    // if it not divisible by 5 and 3, 5, or 3, print regular number
    }else{
      System.out.println(i);
    }
    }
  }
  }

    
  




// for loop instead of while loop
  // loop for chosen period of times
  //for (int i=1; i<=n; i++)
  
    //if (i % 15 == 0)
      //System.out.println("Fizzbuzz");

    //else if (i % 5 == 0)
      //System.out.println("Buzz");

    //else if (i % 3 == 0)
      //System.out.println("Fizz");

    //else 
      //System.out.println(i);

 // }

    
 
 // }
  

