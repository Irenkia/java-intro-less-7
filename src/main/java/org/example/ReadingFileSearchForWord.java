package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingFileSearchForWord {
    public static boolean searchForWord(String filePath, String word) throws IOException {
        String wordSmallLetters = word.toLowerCase();
        String text = Files.readString(Path.of(filePath));
        String[] words = text.split("\n");
        for (int i = 0; i < words.length; i++) {
            if (words[i].toLowerCase().contains(wordSmallLetters)) {
                return true;
            }
        }
        return false;
    }
}
