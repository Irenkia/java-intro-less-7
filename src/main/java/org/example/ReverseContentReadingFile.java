package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReverseContentReadingFile {
    public static void printReverseContent(String filePath) throws IOException {
        String text = Files.readString(Path.of(filePath));
        StringBuffer buffer = new StringBuffer(text);
        System.out.println(buffer.reverse());
    }
}
