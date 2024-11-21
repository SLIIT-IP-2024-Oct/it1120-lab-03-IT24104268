import java.util.Scanner;

public class IT24104268Lab3Q2 {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    
    System.out.print("Enter the monthly salary (e.g., 2500.00): ");
    double monthlySalary = scanner.nextDouble();

    
    System.out.print("Enter the number of OT hours: ");
    double otHours = scanner.nextDouble();

    
    System.out.print("Enter the OT hourly rate (e.g., 12.50): ");
    double otRate = scanner.nextDouble();

    
    double otAmount = otHours * otRate;

    
    double totalSalary = monthlySalary + otAmount;

    
    System.out.println("The OT amount is: $" + otAmount);
    System.out.println("The total salary is: $" + totalSalary);

    
    scanner.close();
  }
}