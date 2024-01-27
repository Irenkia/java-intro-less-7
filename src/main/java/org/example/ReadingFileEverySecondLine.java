package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingFileEverySecondLine {
    public static void readFileEverySecondLine(String filePath) throws IOException {
//        String pathToFile = file.getPath();
        String text = Files.readString(Path.of(filePath));
        String[] words = text.split("\n");
        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) {
                System.out.println(words[i]);
            }
        }
    }

}
