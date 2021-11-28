package org.example.udemy.section8;

import java.io.FileWriter;
import java.io.IOException;

class Lesson_2_TryWithResources {
    public static void main(String[] args) throws IOException {
        String rubai = "some text";

        try(FileWriter writer = new FileWriter("example2.txt")) {
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done!");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
