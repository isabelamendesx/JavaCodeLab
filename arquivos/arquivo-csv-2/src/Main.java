import entities.Product;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException{

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

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

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFilePath))){

            String itemCSV = br.readLine();

            while(itemCSV != null){

                String[] fields = itemCSV.split(",");
                if(fields.length == 3) {
                    String name = fields[0];
                    double price = Double.parseDouble(fields[1]);
                    int quantity = Integer.parseInt(fields[2].trim());
                    list.add(new Product(name, price, quantity));
                }
                itemCSV = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFilePath))){

                for(Product item: list){
                    bw.write(item.getName() + "," + String.format("%.2f", item.totalPrice()));
                    bw.newLine();
                }

                System.out.println(targetFilePath + " CREATED");

            } catch (IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e){
            System.out.println("Error writing file: " + e.getMessage());
        }

        sc.close();


    }
}