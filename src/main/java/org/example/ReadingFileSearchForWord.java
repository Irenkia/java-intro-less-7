package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingFileSearchForWord {
    public static boolean searchForWord(String filePath, String word) {
        String wordSmallLetters = word.toLowerCase();
        try {
            String text = Files.readString(Path.of(filePath));
            String[] words = text.split("\n");
            for (int i = 0; i < words.length; i++) {
                if (words[i].toLowerCase().contains(wordSmallLetters)) {
                    return true;
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return false;
    }
}
