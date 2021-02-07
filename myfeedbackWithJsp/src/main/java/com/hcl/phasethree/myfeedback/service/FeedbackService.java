package com.hcl.phasethree.myfeedback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.phasethree.myfeedback.entity.Feedback;
import com.hcl.phasethree.myfeedback.repository.FeedbackRepository;

@Service
public class FeedbackService {

	@Autowired
	private FeedbackRepository repository;
	
	

	public Feedback saveFeedback(Feedback feedback) {

		return repository.save(feedback);
	}

	
	
	public List<Feedback> getAllFeedbacks() {
		
		System.out.println("in service get all methods");
		
		List<Feedback> allfeedbacks =repository.findAll();
		allfeedbacks.toString();
		
		for (Feedback feedback : allfeedbacks) {
			
			System.out.println(feedback);
		}
		System.out.println("got all the feed back suuscssfully");
		return allfeedbacks;
	}
	
	

	public Feedback getFeedback(Integer id) {
		
		Feedback fb=repository.findById(id).orElse(null);
		System.out.println("in my the service layer : "+fb.toString());

		return fb;
	}
	
	

	public Feedback getFeedbackByUsername(String username) {

		return repository.findByUsername(username);
	}

}
