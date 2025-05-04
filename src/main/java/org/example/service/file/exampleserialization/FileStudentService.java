package org.example.service.file.exampleserialization;

import org.example.entities.LogsData;

/**
 * @author Bibash Bogati
 * @created 2025-05-04
 */
public interface FileStudentService {



    void writeIntoFile(int rollNo, LogsData logsData);
    void readFile(int rollNo, LogsData logsData);
}
