package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class ReadingFromFileTest {

    @Test
    public void mustReadingFromFile() throws IOException {
        //given
        File file = new File("src/test/resources/fileForRead.txt");
        String pathToFile = file.getPath();

        //when
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File has been created.");
            }
        } catch (IOException e) {
            System.out.println("File already exists.");
            e.printStackTrace();
        }

        //then
        ReadingFromFile.printTextFromFile(pathToFile);
    }
}
