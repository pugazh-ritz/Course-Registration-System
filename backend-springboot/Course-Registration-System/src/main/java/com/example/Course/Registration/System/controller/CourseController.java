package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping("courses")
   public List<Course> getCourses() {
          return courseService.getCourses();
   }
   @GetMapping("courses/enrolled")
    public List<CourseRegistry> getEnrolledStudents() {
        return courseService.getEnrolledStudents();
   }
   @PostMapping("courses/register")
    public String registerCourse(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("courseName") String courseName) {
        courseService.registerCourse(name,email,courseName);
        return "Congratulations! "+ name +" Course Registered Successfully!";
   }
}
