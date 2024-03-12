package com.example.restapi.services;


import java.util.*;
import com.example.restapi.entites.Course;

public interface CourseServices {
    
public List<Course> getCourses();
public Course getCourse(long courseId);
public Course addCourse(Course course);
public Course updateCourse(Course course);
public Course deleteCourse(long courseId);

}