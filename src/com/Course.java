package com;

import java.time.LocalDate;

public class Course {
    private Long courseId;
    private String courseName;
    private LocalDate startDate;
    private  LocalDate endDate;

    public Course() {
    }

    public Course(Long courseId, String courseName, LocalDate startDate, LocalDate endDate) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public Course(Long courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
}
