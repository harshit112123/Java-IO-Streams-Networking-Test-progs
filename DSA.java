import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DSA {
    static void main() throws IOException {
        FileWriter fr = new FileWriter("output.txt");
        PrintWriter pr = new PrintWriter(fr);
        pr.println("Hello");
        pr.println("This is also a test String");
        pr.flush();
        pr.close();
    }
}
