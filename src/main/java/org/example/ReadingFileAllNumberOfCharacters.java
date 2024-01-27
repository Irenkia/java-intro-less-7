package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.lang.Character.isDigit;
import static java.lang.Character.isJavaLetter;

public class ReadingFileAllNumberOfCharacters {
    public static void printAllNumberOfCharacters(File file) throws IOException {
        String pathToFile = file.getPath();
        String text = Files.readString(Path.of(pathToFile));
        char[] charArray = text.toCharArray();
        int count = 0;
        for (char c : charArray) {
            if (isJavaLetter(c) || isDigit(c)) {
                count++;
            }
        }
        System.out.println("In file \"" + file.getName() + "\" contained " + count + " characters");
    }
}
