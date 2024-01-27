package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class ReadingFromFileTest {

    @Test
    public void mustReadingFromFile() throws IOException {
        //given
        File newFile = new File("src/test/resources/fileForRead.txt");

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
        ReadingFromFile.printTextFromFile(newFile);
    }
}
