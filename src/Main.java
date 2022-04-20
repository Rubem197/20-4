import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        File t1 = new File("texto.txt");
        String contenido = "";
        String linea;

        try {
            if (t1.exists()) {
                BufferedReader bf = new BufferedReader(new FileReader(t1));
                while ((linea = bf.readLine()) != null) {
                    contenido += linea + "\n";
                }
                bf.close();
                t1 = new File("textoCopia.txt");
                char[] c1 = contenido.toCharArray();
                PrintWriter pw = new PrintWriter(t1);
                for (int i = 0; i < c1.length; i++) {
                    if (c1[i] == '\n') {
                        pw.println();
                    }else{
                        pw.append(c1[i]);

                    }

                }
                pw.close();

            } else {
                System.out.println("el archivo fue borrado");
            }

        } catch (Exception e) {
            System.out.println("Cagaste");
        }
    }
}
