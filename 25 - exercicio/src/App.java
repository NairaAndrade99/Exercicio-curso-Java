import java.util.Scanner;

import 25 - exercicio.entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        Product product = new Product ();
        
        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble ();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt ();

        System.out.print("Product data "+ product);

        System.out.println("\n");

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Update: " + product);

        System.out.println("\n");

        System.out.print("Enter the number of products to be remove in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("\n");

        System.out.println("Update: " + product);
    }
}
