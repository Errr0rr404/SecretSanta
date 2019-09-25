package secret;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class DataReader {

    static String readText(String filePath) throws IOException {
        String text;
        String a = null;

        FileReader reader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(reader);
        while ((text = bufferedReader.readLine()) != null) {
            a = text;
        }
        reader.close();
        return a;
    }

    static void appendStrToFile(String fileName, String str) {
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter(fileName, true));
            out.write(str + ",");
            out.close();
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }
}