package org.example.service.file;

import java.io.*;

/**
 * @author Bibash Bogati
 * @created 2025-05-04
 */
public class FileImageServiceImpl implements FileService {

    @Override
    public void writeFile(String content) {

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
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(content.getBytes());
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void readFile() {

    }

    @Override
    public void readFile(String fileName) {
        try {
            File file = new File(fileName);
            FileInputStream fileReader = new FileInputStream(file);
            int data = fileReader.read();

            while (data != -1) {
                System.out.println((byte) data);
                data = fileReader.read();
            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException.getMessage());
            // new file create
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }


    public void readImage(String fileName) {

        try {
            File file = new File("testimage.png");
            FileInputStream fileReader = new FileInputStream(file);
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

    public static void main(String[] args) {
        FileImageServiceImpl fileImageService = new FileImageServiceImpl();
        fileImageService.readFile("testimage.png");
    }
}
