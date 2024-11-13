/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task23;
import java.util.Scanner; 
/**
 *
 * @author 2277120
 */
public class Task23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalRetailValue = 0.0;

        while (true) {
            System.out.print("Enter product number (1-5 or 0 to stop): ");
            int productNumber = scanner.nextInt();
            
            if (productNumber == 0) {
                break; 
            }
            
            System.out.print("Enter quantity sold: ");
            int quantitySold = scanner.nextInt();
            
            double price = 0.0;
            switch (productNumber) {
                case 1:
                    price = 2.98;
                    break;
                case 2:
                    price = 4.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                case 4:
                    price = 4.49;
                    break;
                case 5:
                    price = 6.87;
                    break;
                default:
                    System.out.println("Invalid product number. Please enter a number between 1 and 5.");
            }
            
            totalRetailValue += price * quantitySold;
        }

        System.out.printf("Total retail value of all products sold is: $%.2f%n", totalRetailValue);
        scanner.close();
    }
}   
