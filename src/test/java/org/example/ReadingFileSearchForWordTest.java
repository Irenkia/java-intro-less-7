package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class ReadingFileSearchForWordTest {
    private static final String FILE_NAME = "src/test/resources/fileReadSearchForWord.txt";

    public static void createFile() {
        File file = new File(FILE_NAME);
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File has been created.");
            }
        } catch (IOException e) {
            System.out.println("File already exists.");
            e.printStackTrace();
        }
    }

    @Test
    public void mustReadingFromFileSearchForWordIsExists() throws IOException {
        //given
        createFile();
        String word = "Java";

        //when
        boolean isWordExists = ReadingFileSearchForWord.searchForWord(FILE_NAME, word);

        //then
        Assertions.assertTrue(isWordExists);
    }

    @Test
    public void mustReadingFromFileSearchForWordNoExists() throws IOException {
        //given
        String word = "JavaScript";

        //when
        boolean isWordExists = ReadingFileSearchForWord.searchForWord(FILE_NAME, word);

        //then
        Assertions.assertFalse(isWordExists);
    }
}
