package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class ReadingFileAllNumberOfCharactersTest {
    @Test
    public void mustReadingFromFileAllNumberOfCharacters() throws IOException {
        //given
        File newFile = new File("src/main/resources/fileReadAllNumberOfCharacters.txt");

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
        ReadingFileAllNumberOfCharacters.printAllNumberOfCharacters(newFile);
    }
}
