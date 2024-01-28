package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class ReadingFileAllNumberOfCharactersTest {
    @Test
    public void mustReadingFromFileAllNumberOfCharacters() throws IOException {
        //given
        String filePath = "src/main/resources/fileReadAllNumberOfCharacters.txt";
        File newFile = new File(filePath);

        //when
        try {
            if (!newFile.exists()) {
                newFile.createNewFile();
                System.out.println("File has been created.");
            }
        } catch (IOException e) {
            System.out.println("File already exists.");
            e.printStackTrace();
        }

        //then
        ReadingFileAllNumberOfCharacters.printAllNumberOfCharacters(filePath);
    }
}
