import java.io.*;
import java.net.*;

class Networking1 {

    static final int Listening_Port = 32008;

    public static void main(String[] args) {

        try {
            Socket connection =
                new Socket("192.168.1.45", Listening_Port);

            BufferedReader incoming = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
            );

            String LinefromServer = incoming.readLine();

            if (LinefromServer == null) {
                throw new IOException("Server closed the connection without sending data");
            }

            System.out.println(LinefromServer);

            incoming.close();
            connection.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}