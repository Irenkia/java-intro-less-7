package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingFromFile {

    public static void printTextFromFile(File file) throws IOException {
        String pathToFile = file.getPath();
        String text = Files.readString(Path.of(pathToFile));
        System.out.println(text);
    }

}
