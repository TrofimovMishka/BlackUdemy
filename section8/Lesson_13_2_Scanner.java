package org.example.udemy.section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Lesson_13_2_Scanner {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner("C:\\Users\\Mike\\OneDrive\\Рабочий стол\\Text20");
        Scanner scanner = null;
        Set<String> set = new TreeSet<>();
        try {
            scanner = new Scanner(new FileReader
                    (new File("C:\\Users\\Mike\\OneDrive\\Рабочий стол\\Text20.txt")));

            scanner.useDelimiter("\\W"); // любой символ

            while (scanner.hasNext()) {

                String word = scanner.next();
                set.add(word);

            }
            for (String word : set) {
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            scanner.close();
        }
    }
}
