import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        /* TRY WITH RESOURCES
        declara recursos e garante que esses recursos serão fechados ao final do bloco
         */
        String path = "/home/isa/JavaCodeLab/arquivos/in.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            // LE 1 LINHA DO ARQUIVO, NO FINAL RETORNA NULL
            String line = br.readLine();

            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}