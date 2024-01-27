package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadReplaceLettersWithCapitals {
    public static String readTextFromFile(String filePath) throws IOException, IOException {
        String text = Files.readString(Path.of(filePath)).toUpperCase();
        return text;
    }

    public static void writeToFile(String filePathToRead, String filePathToWrite) throws IOException {
        String text = readTextFromFile(filePathToRead);
        try {
            Files.writeString(Paths.get(filePathToWrite), text);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
