package feladat;

import java.io.*;

public class beolvas {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("a.txt"));
        String szoveg;
        while ((szoveg = bufferedReader.readLine()) != null) {
            System.out.println("Beolvasott szöveg: " + szoveg);
            char[] chars = szoveg.toCharArray();
            int valtozo;
            String ujSzoveg = "";
            for (int i = 0; i < chars.length; i++) {
                valtozo = chars[i] + 1;
                char ch = (char) valtozo;
                ujSzoveg = ujSzoveg + ch;
            }
            System.out.println("Titkosított szöveg: " + ujSzoveg);
        }
    }
}

