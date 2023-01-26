package com.siri.learnspringboot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siri.learnspringboot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
