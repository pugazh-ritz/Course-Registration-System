package com.example.Course.Registration.System.repository;

import com.example.Course.Registration.System.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,String> {
}
