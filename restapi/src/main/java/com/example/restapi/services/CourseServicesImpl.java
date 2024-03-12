package com.example.restapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.restapi.entites.Course;

@Service
public class CourseServicesImpl implements CourseServices {

    List<Course> list;
    public CourseServicesImpl()
    {
        list=new ArrayList<>();
        list.add(new Course(111,"Core Java","java fundamentals, multithreading and collections"));
        list.add(new Course(222,"Advanced java","All about frameworks and REST API"));

    }
    
    @Override
    public List<Course> getCourses() {
            return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c= null;
        for(Course course:list)
        {
            if(course.getId()==courseId)
            {
                c=course;
                break;
            }
        }
        return c;
    }

    public Course addCourse(Course course) {
    list.add(course);
    return course;
    }

	@Override
	public Course updateCourse(Course crs) {
		
			
			Course c=null;
			for(Course course:list)
			{
				if(course.getId()==crs.getId())
				{
					course.setTitle(crs.getTitle());
					course.setDescription(crs.getDescription());
					c=course;
				}
			}
			
		
		return c;
	}

	@Override
	public Course deleteCourse(long courseId) 
	{
		
		return null;
		
	
			
		
	}
}