import java.io.*;

class ByteStreamExample {
    public static void main(String[] args) throws IOException{
       FileReader f = new FileReader("Java IO Stream Networking test progs/source1.txt");
       BufferedReader br = new BufferedReader(f);
       int x = br.read();
       System.out.println(x);

       br.close();
    }
}
