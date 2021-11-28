package org.example.udemy.section8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Lesson_3_BufferedReader_BufferedWriter {
    static String st = " Test text for BufferedWriter";
    public static void main(String[] args){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("example2.txt"));){
            writer.write(st);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
