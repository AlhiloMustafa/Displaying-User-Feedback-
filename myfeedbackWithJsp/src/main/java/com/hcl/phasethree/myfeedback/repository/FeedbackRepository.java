package com.hcl.phasethree.myfeedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.phasethree.myfeedback.entity.Feedback;

public interface FeedbackRepository  extends JpaRepository<Feedback,Integer>{

	Feedback findByUsername(String username);

}
