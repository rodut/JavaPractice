/**
 * Write a Java program to find the size of a specified file.
 * Sample Output:
 * /home/students/abc.txt  : 0 bytes
 * /home/students/test.txt : 0 bytes
 */

package com.practice.basic1;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSize {
    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Users\\Tudor\\IdeaProjects\\NewJava\\out.txt";

        File file = new File(fileName);
        long fileSize = file.length();
//        System.out.format("The size of the file is: %d bytes", fileSize);
        System.out.println("The size of the file is: " + fileSize + " bytes.");


/*
        Path filePath = Paths.get(fileName);
        FileChannel fileChannel = FileChannel.open(filePath);
        long fileSize = fileChannel.size();
        System.out.println("The size of the file is: " + fileSize + " bytes.");


        Path filePath = Paths.get(fileName);
        long fileSize = Files.size(filePath);
        System.out.println("The size of the file is: "+ fileSize + " bytes.");
 */

    }
}
