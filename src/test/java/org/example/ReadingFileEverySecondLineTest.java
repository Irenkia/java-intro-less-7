package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class ReadingFileEverySecondLineTest {
    @Test
    public void mustReadingFromFile() throws IOException {
        //given
        File newFile = new File("src/test/resources/fileReadEverySecondLine.txt");
        String filePath = newFile.getPath();

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
        ReadingFileEverySecondLine.readFileEverySecondLine(filePath);
    }
}
