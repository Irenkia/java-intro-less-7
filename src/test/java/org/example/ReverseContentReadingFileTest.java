package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class ReverseContentReadingFileTest {

    @Test
    public void mustPrintReverseContentFromFile() throws IOException {
        //given
        File file = new File("src/test/resources/fileReadAllNumberOfCharacters.txt");
        String path = file.getPath();

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
        ReverseContentReadingFile.printReverseContent(path);
    }
}
