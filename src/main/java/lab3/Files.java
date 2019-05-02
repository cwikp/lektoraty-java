package lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Files {

    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("youtube_top_5000.txt");
        BufferedReader reader = new BufferedReader(file);

        String line = reader.readLine();

        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
    }
}
