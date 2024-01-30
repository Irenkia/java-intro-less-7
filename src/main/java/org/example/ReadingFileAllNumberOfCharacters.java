package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingFileAllNumberOfCharacters {

    public static void printAllNumberOfCharacters(String filePath) {
        String checkedPath = checkParameterForZero(filePath);
        try {
            String text = Files.readString(Path.of(checkedPath));
            System.out.println("In file contained " + text.length() + " characters");
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
