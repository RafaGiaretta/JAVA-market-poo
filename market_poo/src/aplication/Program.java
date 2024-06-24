package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product Data: ");
		System.out.println("Product name: ");
		String name = sc.next();
		System.out.print("Product price: ");
		double price = sc.nextDouble();
		System.out.print("Product quantity: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);
		
		product.setName("Computer");
		System.out.println("Updated name : " + product.getName());
		
		product.setPrice(7500.00);
		System.out.println("Updated price : " + product.getPrice());

		System.out.println("\nProduct data: " + product);

		System.out.println("Enter the number of products to be added in stock: ");
		int nQuantity = sc.nextInt();
		product.addProduct(nQuantity);
		System.out.println("\nUpdated data: " + product);

		System.out.println("Enter the number of products to be remmoved in stock: ");
		int quantityRemoved = sc.nextInt();
		product.removeProduct(quantityRemoved);
		System.out.println("\nUpdated data: " + product);

		sc.close();
	}

}
