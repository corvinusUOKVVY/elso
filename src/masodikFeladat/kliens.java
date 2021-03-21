package masodikFeladat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

public class kliens implements Runnable{
    private Socket s;

    public kliens(Socket s){

        this.s = s;
    }

    @Override
    public void run() {
        try {
            Date datum = new Date();
            String szoveg =  " Ez a masodik beadando feladat, ami szoveges allomanyban lesz. ";
            String beir = "Mai datum: " + datum + szoveg;

            PrintWriter pw = new PrintWriter(s.getOutputStream());
            pw.println(beir);
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
