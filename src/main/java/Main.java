// Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the subtotal and gratuity rate
    System.out.println("Enter the subtotal: ");
    double subtotal = input.nextDouble();
    System.out.println("Enter the gratuity rate: ");
    double gratuityRate = input.nextDouble();

    // Calculate the gratuity and total
    double gratuity = subtotal * (gratuityRate / 100);
    double total = subtotal + gratuity;

    //Print the gratuity and total
    System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    
  }


}