package masodikFeladat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class szerver {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 1234);

        BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String bemenet = bf.readLine();
        PrintWriter fajlba = new PrintWriter("kiiras.txt");
        fajlba.println(bemenet);
        System.out.println(bemenet);
        fajlba.flush();

        bf.close();
        s.close();
    }
}
