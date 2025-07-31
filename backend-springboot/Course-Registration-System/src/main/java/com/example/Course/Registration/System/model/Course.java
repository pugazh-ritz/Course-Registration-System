package com.example.Course.Registration.System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private String courseName;
    private String courseCode;
    private String trainerName;
    private  int DurationInWeeks;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public int getDurationInWeeks() {
        return DurationInWeeks;
    }

    public void setDurationInWeeks(int durationInWeeks) {
        DurationInWeeks = durationInWeeks;
    }
}
