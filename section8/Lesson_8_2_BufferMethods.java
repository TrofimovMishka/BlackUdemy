package org.example.udemy.section8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

class Lesson_8_2_BufferMethods {
    public static void main(String[] args) {

        try (RandomAccessFile file = new RandomAccessFile("Text1.txt", "r");
             FileChannel channel = file.getChannel();
        ) {
            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);                    // read info from channel and write in buffer
            buffer.flip();
            System.out.println((char) buffer.get()); // read byte 0
            System.out.println((char) buffer.get()); // read byte 1
            System.out.println((char) buffer.get()); // read byte 2
            buffer.rewind();                        // set position in buffer in 0
            System.out.println((char) buffer.get()); // read byte 0
            System.out.println("__________________________________________________________");

            buffer.compact();                       // copy not read byte to begin and set position after this byte
            channel.read(buffer);                   // read info from channel and write in buffer
            buffer.flip();                          // change buffer WRITE mod -> to buffer READ mode
            while (buffer.hasRemaining()) {            // while has read
                System.out.println((char) buffer.get());
            }
            buffer.clear();           // set position in buffer in 0 and  change buffer READ mod -> to buffer WRITE mode
            channel.read(buffer);                   // read info from channel and write in buffer
            buffer.flip();                          // change buffer WRITE mod -> to buffer READ mode

            System.out.println("__________________________________________________________");
            System.out.println((char) buffer.get()); // read byte 0
            buffer.mark();                            // set marker in position 1
            System.out.println((char) buffer.get()); // read byte 1
            System.out.println((char) buffer.get()); // read byte 2
            buffer.reset();                           // return position to marker -> position 1
            while (buffer.hasRemaining()) {            // while has read
                System.out.println((char) buffer.get());
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
