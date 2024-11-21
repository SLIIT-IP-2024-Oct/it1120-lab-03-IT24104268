import java.util.Scanner;

public class IT24104268Lab3Q3 {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    
    System.out.print("Enter the rupee amount: ");
    int amount = scanner.nextInt();

    
    int[] noteDenominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

    
    for (int denomination : noteDenominations) {
      int numberOfNotes = amount / denomination;
      amount %= denomination;  

      
      System.out.println(denomination + " Notes/Coins - " + numberOfNotes);
    }

    
    scanner.close();
  }
}