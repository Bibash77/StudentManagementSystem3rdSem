package org.example.service.file;

import java.io.IOException;

/**
 * @author Bibash Bogati
 * @created 2025-05-02
 */
public interface FileService {


    void writeFile(String content);

    void writeFile(String fileName , String content);

    void readFile();

    void readFile(String fileName);
}
