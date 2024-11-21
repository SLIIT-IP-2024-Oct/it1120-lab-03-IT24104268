import java.util.Scanner;

public class IT24104268Lab3Q4 {

  public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);

    
    System.out.print("Enter a five-digit number: ");
    int number = scanner.nextInt();

    
    if (number >= 10000 && number < 100000) {
      
      int digit1 = number / 10000;
      int remaining = number % 10000;

      int digit2 = remaining / 1000;
      remaining %= 1000;

      int digit3 = remaining / 100;
      remaining %= 100;

      int digit4 = remaining / 10;
      int digit5 = remaining % 10;

    
      System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
    } else {
      System.out.println("Invalid input. Please enter a five-digit number.");
    }

    // Close the Scanner object (optional for good practice)
    scanner.close();
  }
}