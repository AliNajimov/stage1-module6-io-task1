package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {
        FileInputStream inputStream = null;
        String str = "";
        try (FileInputStream fileInputStream = new FileInputStream(file.getAbsoluteFile());) {
            int c;
            while ((c = fileInputStream.read()) != -1) {
                char c1 = (char) c;
                str += c1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] strings = str.split("\\n");
        Profile profile = new Profile("Anna", 25, "anna@mailserver.com", 1234567890L);
        return profile;
    }
}
