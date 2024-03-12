package com.example.restapi.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.entites.Course;
import com.example.restapi.services.CourseServices;

@RestController
public class MyController {

    // using run time polymorphism by refferring parent interface of CourseServiceImpl class
    @Autowired
    private CourseServices courseService;
    
    @GetMapping("/test")
    public String getMessage()
    {
        return "Welcome to my rest api application";
    }
    
    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        // calling CourseServiceImpl class's getCourses method using it's interface reference variable
        return this.courseService.getCourses();
        
    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
        return this.courseService.getCourse(Long.parseLong(courseId));
    }
    
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
    	return this.courseService.addCourse(course);
    }
    
        @PutMapping("/courses{courseId}")
    	public Course updateCourse(@RequestBody Course course)
    	{
    		return this.courseService.updateCourse(course);
    	}
        @DeleteMapping("/courses/{courseId}")
        public Course deleteCourse(@PathVariable String courseId)
        {
            return this.courseService.getCourse(Long.parseLong(courseId));
        }
//    	
//    	// delete all record
//    	
//    	@DeleteMapping("/courses")
//    	public String deleteCourse()
//    	{
//    		
//    		return "Student data deleted Successfully";
//
//    	}
        
    
		

}

