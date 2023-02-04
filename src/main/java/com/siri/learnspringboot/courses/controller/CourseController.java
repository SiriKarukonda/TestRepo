package com.siri.learnspringboot.courses.controller;

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

import com.siri.learnspringboot.courses.bean.Course;
import com.siri.learnspringboot.courses.repository.CourseRepository;

@RestController
public class CourseController {

	@Autowired
	private CourseRepository repository;
	
	@GetMapping ("/courses")
	public List<Course> getAllCourses(){
		return repository.findAll();
		//		return Arrays.asList(new Course(1, "MicroServices 1","in28Minutes"),new Course(2, "MicroServices","in28Minutes"));
	}
	@GetMapping ("/courses/{id}")
	public Course get1Courses(@PathVariable long id){
    Optional<Course> course = repository.findById(id);
    if(course.isEmpty()) {
    throw new RuntimeException("Course not found with id - " + id);
    }
    	return course.get();
	}
	
	
	
	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Course course){
		repository.save(course);
	}
	
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable long id) {
		repository.deleteById(id);
	}
    }

