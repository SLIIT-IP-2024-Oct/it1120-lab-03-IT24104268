import java.util.Scanner;

public class IT24104268Lab3Q1B {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    
    System.out.print("Enter the price of 1 kg of rice (e.g., 5.25): ");
    double pricePerKg = scanner.nextDouble();

    
    System.out.print("Enter the number of kilograms of rice to buy: ");
    double quantity = scanner.nextDouble();

    
    double totalAmount = pricePerKg * quantity;

    
    double discount = totalAmount * 0.1;

    
    double finalAmount = totalAmount - discount;

    
    System.out.println("The total amount before discount is: $" + totalAmount);

    
    System.out.println("Discount (10%): $" + discount);

    
    System.out.println("The final amount to pay after discount is: $" + finalAmount);

    
    scanner.close();
  }
}