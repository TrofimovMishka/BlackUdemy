package org.example.udemy.section8;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class Lesson_10_3_DeleteDirectory {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Mike\\OneDrive\\Рабочий стол\\CopyHere");  // what need delete
        Files.walkFileTree(path, new MyFileVisitor3());
    }
}

class MyFileVisitor3 extends SimpleFileVisitor<Path>{

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Delete name: " + file.getFileName());
        Files.delete(file);                                                  // Удаляем файлы в папке
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Delete directory: "+ dir.getFileName());
        Files.delete(dir);                                                    // удаляем уже пустую папку
        return FileVisitResult.CONTINUE;
    }
}
