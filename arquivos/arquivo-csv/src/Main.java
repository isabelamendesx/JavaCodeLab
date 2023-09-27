import entities.Product;

import javax.sound.sampled.Line;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //LEITURA DO CAMINHO DO TECLADO
        System.out.println("Enter file path: ");
        String sourceFilePath = sc.nextLine();

        // File me permite criar um objeto com um caminho
        File sourceFile = new File(sourceFilePath);
        // Parente pega a pasta do arquivo
        String sourceFolderPath = sourceFile.getParent();

        // Criando a pasta OUT para o arquivo de saída
        boolean success = new File(sourceFolderPath + "/out").mkdir();

        System.out.println("Folder created: " + success);

        // Criando summary.csv
        String targetFilePath = sourceFolderPath + "/out/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(targetFilePath))){

            String line;

            while((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    double price = Double.parseDouble(parts[1]);
                    int quantity = Integer.parseInt(parts[2].trim());
                    Product product = new Product(name, price, quantity);
                    bw.write(product.getName() + "," + product.totalPrice());
                    bw.newLine();
                }
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}