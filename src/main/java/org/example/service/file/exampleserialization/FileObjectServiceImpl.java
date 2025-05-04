package org.example.service.file.exampleserialization;

import org.example.entities.LogsData;
import org.example.service.file.FileService;

import java.io.*;
import java.util.Date;

/**
 * @author Bibash Bogati
 * @created 2025-05-04
 */


public class FileObjectServiceImpl implements FileStudentService {



    @Override
    public void writeIntoFile(int rollNo, LogsData logsData) {
       try {
           File file = new File(rollNo + ".txt");
           if(!file.exists()){
               System.out.println("file not exists");
               // if not create new file
               file.createNewFile();
           } else {
               System.out.println("File exists");
           }

           ObjectOutputStream fileWriter = new ObjectOutputStream(new FileOutputStream(file));
           fileWriter.writeObject(logsData);
           fileWriter.close();

       } catch (IOException ioException) {
           ioException.printStackTrace();
       }

    }



    @Override
    public void readFile(int rollNo, LogsData logsData) {
        try {
            File file = new File(String.valueOf(rollNo) + ".txt");

            InputStream inputStream = new FileInputStream(file);

            ObjectInputStream fileReader = new ObjectInputStream(inputStream);

            LogsData data = (LogsData) fileReader.readObject();

            while (data != null) {
                System.out.println(data.getMessage());
                data = (LogsData) fileReader.readObject();
            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException.getMessage());
            // new file create
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        } catch (ClassNotFoundException classNotFoundException){
            System.out.println(classNotFoundException.getMessage());
        }
    }

    public static void main(String[] args) {
        FileObjectServiceImpl fileObjectService = new FileObjectServiceImpl();

        LogsData logsData = new LogsData();
        logsData.setId(1);
        logsData.setMessage("Hello World");
        logsData.setCurrentDate(new Date());

        fileObjectService.writeIntoFile(1, logsData);

        fileObjectService.readFile(1, logsData);
    }
}
