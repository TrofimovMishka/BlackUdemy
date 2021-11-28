package org.example.udemy.section8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Lesson_1_CharacterStreams_ByteStreams {  //FileWriter and FileReader
    public static void main(String[] args) throws IOException {
        String rubai = "some text";
        String s = "Hello";
        FileWriter writer = null;

        try {
            writer = new FileWriter("example2.txt");
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));

            }
            writer.write("\n");
//            writer.write(rubai);   //second method write info in file
            writer.write(s);
            writer.write("\n");
            System.out.println("Done!");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            writer.close();
        }

        /////////////////////////////////////FileReader////////////////////////////////////////////


        FileReader reader = null;
        try {
            reader = new FileReader("example2.txt");
            int charakter;
            while ((charakter = reader.read())!=-1){   // read while file not end
                System.out.print((char)charakter);   //method read return int, when we casting to char : (char)charakter
            }
            System.out.println("Done!");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            reader.close();
        }
    }
}

