package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {
        FileInputStream fileInputStream = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            fileInputStream = new FileInputStream(file.getAbsolutePath());
            int c;
            while ((c = fileInputStream.read()) != -1) {
                char ch = (char) c;
                stringBuilder.append(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        Profile profile = new Profile();
        profile.setName("Anna");
        profile.setAge(25);
        profile.setEmail("anna@mailserver.com");
        profile.setPhone(1234567890L);
        profile.hashCode();
        return profile;
    }
}
