package com.example.demo.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.utils.Course;

public interface CourseRepository extends CrudRepository<Course, String>{
	public List<Course> findByTopicId(String topicId);
}
