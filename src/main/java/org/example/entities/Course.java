package org.example.entities;

import java.util.Date;

/**
 * @author Bibash Bogati
 * @created 2025-04-27
 */
public class Course {

    private Integer courseId;

    private String courseName;

    private Date startDate;

    private Date endDate;

    public Course(Integer courseId, String courseName, Date startDate, Date endDate) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Course() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
