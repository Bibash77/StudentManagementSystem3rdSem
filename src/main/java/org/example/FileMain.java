package org.example;

import org.example.service.file.FileService;
import org.example.service.file.FileServiceImpl;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Bibash Bogati
 * @created 2025-05-02
 */
public class FileMain {


    public static void main(String[] args){
        FileService fileService = new FileServiceImpl();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a file content: ");
        String data = scanner.nextLine();

        String studnetName = "TestStudent";
        fileService.writeFile(studnetName, data);


        fileService.readFile(studnetName);



    }
}
