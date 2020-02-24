package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.utils.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
