package application;

import entities.ImportedProduct;
import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<Product>();

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Product #" + i + "data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.next();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();


            if (ch == 'c' || ch == 'u') {
                Product products = new Product(name, price);
                list.add(products);
            }

            // TODO: implement logic for UsedProduct
            // ...

            if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                Product products = new ImportedProduct(name, price, customsFee);
                list.add(products);
            }
        }

        System.out.println("PRICE TAGS: ");
        // TODO: fix output, it's not displaying the name of product
        for (Product products : list) {
            System.out.println(products.getName() + products.priceTag());
        }


        sc.close();
    }
}
