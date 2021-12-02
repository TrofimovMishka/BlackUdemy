package org.example.udemy.section8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

class Lesson_6_RandomAccessFile {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("Text1.txt", "rw");
        ){
            int a = file.read();        //read 1 bit from pointer default (0;0) -> (строка ; столбец)
            System.out.println((char)a);// after this method pointer moving to (0; 1)

            int b = file.read();        //read 1 bit from pointer (0;1) -> (строка ; столбец)
            System.out.println((char)b);

            String s1 = file.readLine();  // read 1 string from pointer
            System.out.println(s1);

            file.seek(6);            // set pointer to 6 position

            String s2 = file.readLine();  // read 1 string from pointer poz. 6
            System.out.println(s2);

            System.out.println(file.getFilePointer());  // return actual position pointer

            file.seek(0);
            file.writeBytes("Hello");   // write string in file, old bytes in this position will remove

            file.seek(file.length());  // set pointer to end file
            file.writeBytes("\n \tBye Bye ");





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
