package masodikFeladat;

import java.io.IOException;
import java.net.ServerSocket;

public class multiSzerver {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1234);

        while (true){
            new Thread(new kliens(ss.accept())).start();

        }
    }
}
