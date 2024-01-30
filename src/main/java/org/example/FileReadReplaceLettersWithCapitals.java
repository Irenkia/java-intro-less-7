package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadReplaceLettersWithCapitals {
    public static String readTextFromFile(String filePath) {
        String checkedPath = checkParameterForZero(filePath);
        try {
            String text = Files.readString(Path.of(checkedPath)).toUpperCase();
            return text;
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return "";
    }

    public static void writeToFile(String filePathToRead, String filePathToWrite) {
        String text = readTextFromFile(filePathToRead);
        try {
            Files.writeString(Paths.get(filePathToWrite), text);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static String checkParameterForZero(String filePath){
        if(filePath == null){
            filePath = "";
        }
        return filePath;
    }
}
