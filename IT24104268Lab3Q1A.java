import java.util.Scanner;

public class IT24104268Lab3Q1A {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    
    System.out.print("Enter the price of 1 kg of rice (e.g., 5.25): ");
    double pricePerKg = scanner.nextDouble();

    
    System.out.print("Enter the number of kilograms of rice to buy: ");
    double quantity = scanner.nextDouble();

    
    double totalAmount = pricePerKg * quantity;

    
    System.out.println("The total amount to pay is: $" + totalAmount);

  
    scanner.close();
  }
}