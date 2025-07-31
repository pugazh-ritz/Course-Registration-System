package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.repository.CourseRegistryRepo;
import com.example.Course.Registration.System.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    public List<Course> getCourses() {
     return courseRepo.findAll();
    }
    @Autowired
    CourseRegistryRepo courseRegistryRepo;
    public List<CourseRegistry> getEnrolledStudents() {
    return  courseRegistryRepo.findAll();
    }

    public void registerCourse(String name, String email, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name,email,courseName);
        courseRegistryRepo.save(courseRegistry);
    }
}
