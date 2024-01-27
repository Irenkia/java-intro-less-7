package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileServiceTest {

    @Test
    void mustCreateFile() {
        //given
        String filePath = "src/test/resources/fileToCreate.txt";
        File file = FileService.createFile(filePath);

        //when
        boolean exists = file.exists();

        //then
        Assertions.assertTrue(exists);
    }

    @Test
    void mustWriteToFile() throws IOException {
        //given
        String text = "Kurs\nJava\nLekcja 6\nPliki\nWyjątki\nPliki\nKoniec\npliku";
        String pathToFile = String.valueOf(Path.of("src/test/resources/fileToCreate.txt"));

        //when
        FileService.writeToFile(pathToFile, text);

        //then
        String showText = Files.readString(Path.of(pathToFile));
        System.out.println(showText);
    }

}
