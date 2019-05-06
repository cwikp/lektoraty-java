package lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HomeworkArraysFromFile {

    public static void main(String[] args) throws IOException {
        String[] youtubers = new String[5000];
        FileReader file = new FileReader("youtube_top_5000.txt");
        BufferedReader reader = new BufferedReader(file);

        String line = reader.readLine();
        int i = 0;

        while (line != null) {
            youtubers[i] = line;
            line = reader.readLine();
            i++;
        }

        for (String youtuber : youtubers) {
            System.out.println(youtuber.toUpperCase() + " " + youtuber.length());
        }

        String longestYoutuberName = "";
        for (String youtuber : youtubers) {
            if (youtuber.length() > longestYoutuberName.length()) {
                longestYoutuberName = youtuber;
            }
        }
        System.out.println("Longest youtuber name: '" + longestYoutuberName + "' contains " + longestYoutuberName.length() + " chars");
    }
}
