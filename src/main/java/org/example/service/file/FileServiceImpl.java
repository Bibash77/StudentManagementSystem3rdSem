package org.example.service.file;

import java.io.*;

/**
 * @author Bibash Bogati
 * @created 2025-05-02
 */
public class FileServiceImpl implements FileService {

    @Override
    public void writeFile(String content) {

        // file
        try {
            // create file instance
            File file = new File("test.txt");
            // check file exists
            if(!file.exists()){
                System.out.println("file not exists");
                // if not create new file
                file.createNewFile();
            } else {
                System.out.println("File exists");
            }

            // write content
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();

        } catch (IOException e) {
            // handle exception
            System.out.println(e.getMessage());
            throw new RuntimeException("Error writing file");
        }


        // filewriter



    }

    @Override
    public void writeFile(String fileName, String content) {
        try {
            File file = new File(fileName);
            if(!file.exists()){
                System.out.println("file not exists");
                // if not create new file
                file.createNewFile();
            } else {
                System.out.println("File exists");
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

    @Override
    public void readFile() {

        try {
            File file = new File("test.txt");
            FileReader fileReader = new FileReader(file);
            int data = fileReader.read();

            while (data != -1) {
                System.out.println((char) data);
                data = fileReader.read();
            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException.getMessage());
            // new file create
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }

    }

    @Override
    public void readFile(String fileName) {


        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            int data = fileReader.read();

            while (data != -1) {
                System.out.println((char) data);
                data = fileReader.read();
            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException.getMessage());
            // new file create
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}
