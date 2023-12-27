package com.vamsi.quizzapp.dao;

import com.vamsi.quizzapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
