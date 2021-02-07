package com.hcl.phasethree.myfeedback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.phasethree.myfeedback.entity.Feedback;
import com.hcl.phasethree.myfeedback.service.FeedbackService;

@RestController
public class FeedbackController {

	@Autowired
	private FeedbackService service;

	@GetMapping("/")
	public ModelAndView welcom() {

		ModelAndView mav = new ModelAndView("/index");

		return mav;

	}

	// http://localhost:9090/sendFeedback
	@PostMapping("/sendFeedback")
	public Feedback addFeedback(@RequestParam String username, @RequestParam String comment) {

		Feedback feedback = new Feedback(null, username, comment);

		return service.saveFeedback(feedback);

	}

	// http://localhost:9090/getAllFeedbacks
	@GetMapping("/getAllFeedbacks")
	public List<Feedback> getAllFeedbacks() {

		return service.getAllFeedbacks();
	}

	// http://localhost:9090/getFeedback/138
	@GetMapping("/getFeedback")
	public Feedback getFeedback(@RequestParam Integer id) {

		Feedback fb = service.getFeedback(id);

		return fb;
	}

//	http://localhost:9090/getFeedbackbyname/mustafa
	@GetMapping("/getFeedbackbyname")
	public Feedback getFeedbackByUsername(@RequestParam String username) {

		return service.getFeedbackByUsername(username);

	}

}


////http://localhost:9090/sendFeedback
//	@PostMapping("/sendFeedback")
//	public Feedback addFeedback(@RequestBody Feedback feedback) {
//		
//		Feedback feedback=new Feedback(Null,"stive","good feed");
//		
//		return service.saveFeedback(feedback);
//
//	}
