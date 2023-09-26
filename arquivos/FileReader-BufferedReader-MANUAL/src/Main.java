import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String path = "/home/isa/JavaCodeLab/arquivos/in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

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
        finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                    ;
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }





    }
}