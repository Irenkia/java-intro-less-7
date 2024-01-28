package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.lang.Character.isDigit;
import static java.lang.Character.isJavaLetter;

public class ReadingFileAllNumberOfCharacters {
    public static void printAllNumberOfCharacters(String filePat) throws IOException {
        String text = Files.readString(Path.of(filePat));
        System.out.println("In file contained " + text.length() + " characters");
    }
}
