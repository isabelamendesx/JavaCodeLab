import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
        * new FileWriter(path) -> sobrescreve ou cria um arquivo
        * new FileWriter(path, true) -> acrescenta no arquivo
        * */

        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night"};

        String path = "/home/isa/JavaCodeLab/arquivos/out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}