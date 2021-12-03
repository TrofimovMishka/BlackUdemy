package org.example.udemy.section8;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class Lesson_9_2_Files_Methods_Continious {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
//        Files.createFile(filePath);
//        String s = "-Hello\n-Hello bro!";
//
//        Files.write(filePath, s.getBytes()); // write string in file test10.txt
        List<String> list = Files.readAllLines(filePath);  // read info from file test10.txt and write in list
        for(String s: list){
            System.out.println(s);
        }
    }
}
