package org.example.udemy.section8;

import java.io.File;
import java.io.IOException;
import java.sql.Array;
import java.util.Arrays;

class Lesson_7_File {
    public static void main(String[] args) throws IOException {
        File file = new File("Text1.txt");
        File folder = new File("C:\\Users\\Mike\\OneDrive\\Рабочий стол\\example");
        File file2 = new File("C:\\Users\\Mike\\OneDrive\\Рабочий стол\\example\\test20.txt");
        File folder2 = new File("C:\\Users\\Mike\\OneDrive\\Рабочий стол\\example\\SomeFolder");
        System.out.println(file.getAbsolutePath()); // показывает абсолютный путь
        System.out.println("_____________________________________________________________");

        System.out.println(folder.isAbsolute()); // -> boolean -указанный путь абсолютный?
        System.out.println("_____________________________________________________________");

        System.out.println(file.isDirectory()); // -> boolean -указанное папка?
        System.out.println("_____________________________________________________________");

        System.out.println(file2.exists()); // -> boolean -указанное существует?
        System.out.println(folder.exists());
        System.out.println(file.exists());
        System.out.println("_____________________________________________________________");


        System.out.println(file2.createNewFile()); // ->boolean - создает файл по указанному пути
        System.out.println(folder2.mkdir()); // ->boolean - создает файл по указанному пути
        System.out.println("_____________________________________________________________");

        System.out.println(file.length()); // ->byte - размер файла по указанному пути
        System.out.println(folder.length()); // ->byte - размер папки по указанному пути. Метод не складывает размеры
                                                //файлов внутри папки - для этого нужно самому написать код
        System.out.println("_____________________________________________________________");

        System.out.println(file2.delete()); // ->boolean - удаляет файл по указанному пути
        System.out.println(folder2.delete()); // ->boolean - удаляет папку если она пустая!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println("_____________________________________________________________");


        File [] array = folder.listFiles(); // ->File [] -  Выводит содержимое папки
        System.out.println(Arrays.toString(array));
        System.out.println("_____________________________________________________________");

        System.out.println(folder.isHidden()); // ->boolean - скрытая ли папка?
        System.out.println("_____________________________________________________________");

        System.out.println(file.canRead()); // ->boolean - есть ли доступ на чтение?
        System.out.println(file.canWrite()); // ->boolean - есть ли доступ на запись?
        System.out.println(file.canExecute()); // ->boolean - есть ли доступ на запуск?
        System.out.println("_____________________________________________________________");











    }
}
