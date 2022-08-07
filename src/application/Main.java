package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<Product>();

        System.out.print("Enter the number of products: ");
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

            // TODO: separate if for usedProduct
            if (ch == 'c') {
                list.add(new Product(name, price));
            }

            // TODO: implement logic for UsedProduct
            else if (ch == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, manufactureDate));
            }

            else {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println("PRICE TAGS: ");
        // TODO: fix output, it's not displaying the name of product
        for (Product products : list) {
            System.out.println(products.priceTag());
        }


        sc.close();
    }
}
