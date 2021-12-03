package org.example.udemy.section8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Map;

class Lesson_9_1_Interface_Path_and_Class_Files {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("text15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Mike\\OneDrive\\Рабочий стол\\M");

//////////////////////////////////////   METHODS INTERFACE PATH   //////////////////////////////////////////////////////

        System.out.println("1...filePath.getFileName():   "+filePath.getFileName());          //-> file name
        System.out.println("directoryPath.getFileName():   "+directoryPath.getFileName());//-> directory name
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("2...filePath.getParent()):   "+filePath.getParent());            //-> name parent
        System.out.println("directoryPath.getParent():   "+directoryPath.getParent());
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("3...filePath.getRoot()):   "+filePath.getRoot());           //-> adress root, корень откуда
        System.out.println("directoryPath.getRoot():   "+directoryPath.getRoot());  // берет начало файл или директория
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("4...filePath.isAbsolute()):   "+filePath.isAbsolute());      //-> boolean - adress is Absolute?
        System.out.println("directoryPath.isAbsolute():   "+directoryPath.isAbsolute());
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("5...filePath.toAbsolutePath()):   "+filePath.toAbsolutePath());      //-> Absolute adress
        System.out.println("directoryPath.toAbsolutePath():   "+directoryPath.toAbsolutePath());
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("6...filePath.toAbsolutePath().getParent()):   "+filePath.toAbsolutePath().getParent());  //-> name parent
        System.out.println("filePath.toAbsolutePath().getRoot()):   "+filePath.toAbsolutePath().getRoot());      //-> adress root, корень , откуда берет начало файл
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("7...directoryPath.resolve(filePath):   "+directoryPath.resolve(filePath)); //-> обьеденяет два пути
        System.out.println("---------------------------------------------------------------------------------");

        Path anotherPath = Paths.get("C:\\Users\\Mike\\OneDrive\\Рабочий стол\\M\\N\\Z\\test20.txt");
        System.out.println("8...directoryPath.relativize(anotherPath):   "+directoryPath.relativize(anotherPath)); // -> относительный путь anotherPath, относительно пути directoryPath
        System.out.println("---------------------------------------------------------------------------------");

//////////////////////////////////////   METHODS CLASS FILES   /////////////////////////////////////////////////////////

        if (!Files.exists(filePath)){    //если файла не существует (!)
            Files.createFile(filePath);  // создать файл по указанному адресу в filePath. createFile - выкидидывает IOException - лови его.
        }

        if (!Files.exists(directoryPath)){    //если директория не существует (!)
            Files.createDirectory(directoryPath);  // создать директорию по указанному адресу в directoryPath. createDirectory - выкидидывает IOException - лови его.
        }

        System.out.println("9...Files.isReadable(filePath):   "+Files.isReadable(filePath)); //-> boolean - Проверяем права на чтение
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("10...Files.isWritable(filePath):   "+Files.isWritable(filePath)); //-> boolean - Проверяем права на изменения в файле
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("11...Files.isExecutable(filePath):   "+Files.isExecutable(filePath)); //-> boolean - Проверяем права на запуск
        System.out.println("---------------------------------------------------------------------------------");

        Path filePath2 = Paths.get("C:\\Users\\Mike\\Documents\\UdemyBlack\\text15.txt");
        System.out.println("12...Files.isSameFile(filePath, filePath2):   "+Files.isSameFile(filePath, filePath2)); //-> boolean - Ссылаются ли оба пути на один и тот же файл?
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("13...Files.size(filePath):   "+Files.size(filePath)); //-> Размер файла в byte
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("14...Files.getAttribute(filePath, \"creationTime\"):   "+Files.getAttribute(filePath, "creationTime")); //-> Информацию об атрибуте creationTime
        System.out.println("15...Files.getAttribute(filePath, \"size\"):   "+Files.getAttribute(filePath, "size"));
        // есть много атрибутов у файла, какие их названия можно найти в инете при надобности
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("16...Files.size(filePath):   "+Files.readAttributes(filePath, "*"));
        //-> Вывести инфу о всех атрибутах(*) или через запятую указывать необходимые атрибуты
        System.out.println("---------------------------------------------------------------------------------");
        Map<String, Object> attributes = Files.readAttributes(filePath, "*");
        for (Map.Entry<String , Object> entry: attributes.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("---------------------------------------------------------------------------------");

        Path directoryPath2 = Paths.get("C:\\Users\\Mike\\OneDrive\\Рабочий стол\\example");
//        Files.copy(filePath, directoryPath.resolve(filePath)); // нужно указать еще и имя для копированного файла, в нашем случае хотим
        // чтобы имена файлов совпадали - для этого исп. метод кот. выдаст разницу  в адресах resolve
//        Files.copy(filePath, directoryPath.resolve("test166.txt"), StandardCopyOption.REPLACE_EXISTING); // нужно указать еще и имя для копированного файла
        // одна из возможных опций копирования - StandardCopyOption.REPLACE_EXISTING -> замени файл, если такой существует
        System.out.println("17...Files.copy: Done!");
        System.out.println("---------------------------------------------------------------------------------");

//        Files.copy(directoryPath2, directoryPath.resolve("B"));  // копируем папку example по адресу directoryPath2, в папку по directoryPath с новымименем В

        //  !!!!!!!!!!!!!!!!!!!но содержимое папки не скопируется таким образом!!!!!!!!!!!!!!!!!!

        System.out.println("18...Files.copy: Done!");
        System.out.println("---------------------------------------------------------------------------------");

//        Files.move(filePath, directoryPath.resolve("Test15.txt")); //-> Перемещаем файл
        System.out.println("19...Files.move:   ");
        System.out.println("---------------------------------------------------------------------------------");

//        Files.move(Paths.get("text15.txt"), (Paths.get("newTest15.txt"))); // ->  как использовать метод move для переименования файла

//        Files.delete(directoryPath2);  // удалить так можно если папка пуста, если не пуста то вручную сначала удаляем все содержимое



    }
}
