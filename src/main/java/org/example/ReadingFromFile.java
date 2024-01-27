package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingFromFile {

    public static void printTextFromFile(String filePath) throws IOException {
        String text = Files.readString(Path.of(filePath));
        System.out.println(text);
    }

}
