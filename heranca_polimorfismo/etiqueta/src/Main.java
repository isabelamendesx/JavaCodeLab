import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");

        List<Product> products = new ArrayList<>();


        System.out.print("Enter the number of products: ");
        Integer numProducts = sc.nextInt();
        for(int i = 1; i <= numProducts; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported? (c/u/i)? ");
            char aux = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Price: ");
            Double productPrice = sc.nextDouble();
            if(aux == 'c'){
                Product product = new Product(productName, productPrice);
                products.add(product);
            } else if (aux == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate productDate = LocalDate.parse(sc.next(), formatter);
                Product product = new UsedProduct(productName, productPrice, productDate);
                products.add(product);
            } else if (aux == 'i'){
                System.out.print("Customs fee: ");
                Double productFee = sc.nextDouble();
                Product product = new ImportedProduct(productName, productPrice, productFee);
                products.add(product);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product p : products){
            System.out.println(p.priceTag());
        }

        sc.close();

    }
}