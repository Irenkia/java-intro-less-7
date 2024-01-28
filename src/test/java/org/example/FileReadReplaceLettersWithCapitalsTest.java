package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileReadReplaceLettersWithCapitalsTest {
    public static void createFile(String pathToFile) {
        File file = new File(pathToFile);
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
    public void mustReadingFromFilePrintTextCapitalsLetters() {
        //given
        String filePathToRead = "src/test/resources/filePrintTextCapitalsLetters.txt";
        createFile(filePathToRead);

        //when
        String newText = FileReadReplaceLettersWithCapitals.readTextFromFile(filePathToRead);

        //then
        System.out.println(newText);
    }

    @Test
    public void whenReadingFromEmptyFile() {
        //given
        String filePathToRead = "src/test/resources/fileEmpty.txt";
        createFile(filePathToRead);

        //when
        String newText = FileReadReplaceLettersWithCapitals.readTextFromFile(filePathToRead);

        //then
        System.out.println(newText);
    }

    @Test
    public void mustWriteTextCapitalsLettersToFile() {
        //given
        String filePathToWrite = "src/test/resources/output.txt";
        createFile(filePathToWrite);
        String filePathToRead = "src/test/resources/filePrintTextCapitalsLetters.txt";

        //when
        FileReadReplaceLettersWithCapitals.writeToFile(filePathToRead, filePathToWrite);

        //then
        String newText = FileReadReplaceLettersWithCapitals.readTextFromFile(filePathToWrite);
        System.out.println(newText);
    }
}
