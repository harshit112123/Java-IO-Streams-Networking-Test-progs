
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class JavaIO{
    public static void main(String[] args) throws IOException {
        
            FileWriter f = new FileWriter("output.txt");
            PrintWriter out = new PrintWriter(f);
            out.println("Hello");
            out.println(true);
            out.printf("My name is Harshit and my age is %d", 22);
            out.flush();

            FileReader f1 = new FileReader("input.txt");
            System.out.println(f1.read());

            out.close();
            f1.close();
    }
}