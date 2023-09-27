import entities.Product;

import javax.sound.sampled.Line;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // String com o caminho pro arquivo INPUT
        String inPath = "/home/isa/JavaCodeLab/arquivos/in.csv";
        String outPath = "/home/isa/JavaCodeLab/arquivos/arquivo-csv/out/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(inPath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))){

            String line;

            while((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    double price = Double.parseDouble(parts[1]);
                    int quantity = Integer.parseInt(parts[2].trim());
                    Product product = new Product(name, price, quantity);
                    bw.write(String.valueOf(product));
                    bw.newLine();
                }
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}