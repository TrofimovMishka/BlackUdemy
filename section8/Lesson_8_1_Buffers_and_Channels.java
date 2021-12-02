package org.example.udemy.section8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

class Lesson_8_1_Buffers_and_Channels {
    public static void main(String[] args) {
        try (RandomAccessFile accessFile = new RandomAccessFile("Text1.txt", "rw");
             FileChannel chanel = accessFile.getChannel();  // create channel for comunikation
        ) {
            ByteBuffer buffer = ByteBuffer.allocate(25);   // create buffer with 25 byte size, if overweight -> casts exceptio

            ///////////////////////////////////// READ some info from Text1.txt///////////////////////////////

            StringBuilder builder = new StringBuilder();
            int byteRead = chanel.read(buffer);            // read info from channel and write in buffer
            while (byteRead > 0) {                            // пока есть что читать (что то удалось записать в буфер?)->
                System.out.println("read: " + byteRead);    //->  выводим размер byteRead

                buffer.flip();                            // change buffer WRITE mod -> to buffer READ mode
                while (buffer.hasRemaining()) {             // while has what read ->
                    builder.append((char) buffer.get());   // read 1 byte from buffer and write to StringBuilder
                }
                buffer.clear();                           // change buffer READ mod -> to WRITE mode
                byteRead = chanel.read(buffer);           // read info from channel and WRITE in buffer
            }
            System.out.println(builder);

            //////////////////////////////////// WRITE some info to Text1.txt///////////////////////////////

            String text = "\n Hello every body, I start learn java!!!";
            ByteBuffer buffer1 = ByteBuffer.allocate(text.getBytes().length); // create new buffer for write, capacity = (text.getBytes()(масив байтов).length)
            buffer1.put(text.getBytes());      // WRITE to buffer
            buffer1.flip();                    // change buffer WRITE mod -> to buffer READ mode
            chanel.write(buffer1);             // READ from buffer and write to file

            //////////////////////////////////// WRITE some info to Text1.txt  METHOD 2 ///////////////////////////////

            String text2 = "\n Bye Bye losers!!";
            ByteBuffer buffer2 = ByteBuffer.wrap(text2.getBytes());  // создание буфера размером для масива байтов в параметре,
            // WRITE to buffer text2.getBytes() - масив байтов
            // после этого перевод режима буфера в чтение

            chanel.write(buffer2);                                     // READ from buffer and write to file

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
