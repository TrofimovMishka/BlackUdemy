package org.example.udemy.section8;

import java.io.*;

class Lesson_4_FileInputStream_FileOutputStream { //stary.jpg
    public static void main(String[] args) {

///////////////////////////////// NOT USE THIS CODE FOR READ AND WRITE BINARY FILE///////////////////////////////

//        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\stary.jpg"));
//             BufferedWriter writer = new BufferedWriter(new FileWriter("stary.jpg"))
//        ) {
//            int charackter;
//            while ((charackter = reader.read()) != -1){
//                writer.write(charackter);
//            }
//            System.out.println("Done!");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

////////////////////////////////////// USE THIS CODE ///////////////////////////////////////////////////////////

        try(FileInputStream inputStream = new FileInputStream("D:\\stary.jpg");
        FileOutputStream outputStream = new FileOutputStream("stary.jpg")) {
            int i;
            while( (i = inputStream.read()) != -1){
                outputStream.write(i);
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
/////////////////////////////////// DataOutputStream  &  DataInputStream/////////////////////////////////////////

        try(DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("my_test.bin"));
            DataInputStream inputStream = new DataInputStream(new FileInputStream( "my_test.bin"))){
            outputStream.writeBoolean(false);
            outputStream.writeInt(26467);
            outputStream.writeByte(4);
            outputStream.writeShort(120);
            outputStream.writeLong(1_000_000);
            outputStream.writeFloat(3.14f);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
