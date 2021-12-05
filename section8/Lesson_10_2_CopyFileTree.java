package org.example.udemy.section8;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class Lesson_10_2_CopyFileTree {         ////////////////////////Copy directory////////////////////////
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\Users\\Mike\\OneDrive\\Рабочий стол\\X"); // copy from
        Path destination = Paths.get("C:\\Users\\Mike\\OneDrive\\Рабочий стол\\CopyHere");  // copy to
        Files.walkFileTree(source, new MyFileVisitor2(source, destination));
    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));   // (source.relativize(dir)) -> получаем относительный путь первой папки
                                                                            // resolve - обьединяет 2 пути
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING); // copy(dir(Что копируем!!), newDestination(куда копируем!!!))
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}

