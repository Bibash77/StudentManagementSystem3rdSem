package org.example.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Bibash Bogati
 * @created 2025-05-04
 */
public class LogsData implements Serializable {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private Date currentDate;

    private String message;
}
