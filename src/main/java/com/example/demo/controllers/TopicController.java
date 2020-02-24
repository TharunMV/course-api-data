package com.example.demo.controllers;

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

import com.example.demo.services.TopicService;
import com.example.demo.utils.Topic;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@GetMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@GetMapping("/topics/{topicId}")
	public Optional<Topic> getTopic(@PathVariable String topicId) {
		return topicService.getTopic(topicId);
	}
	
	@PostMapping(value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@PutMapping(value="/topics/{topicId}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String topicId) {
		topicService.updateTopic(topicId, topic);
	}
	
	@DeleteMapping(value="/topics/{topicId}")
	public void deleteTopic(@PathVariable String topicId) {
		topicService.deleteTopic(topicId);
	}
}
