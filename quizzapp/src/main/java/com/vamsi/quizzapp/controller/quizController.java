package com.vamsi.quizzapp.controller;

import com.vamsi.quizzapp.model.Question;
import com.vamsi.quizzapp.model.QuestionWrapper;
import com.vamsi.quizzapp.model.Response;
import com.vamsi.quizzapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class quizController {

        @Autowired
        QuizService quizService;

        @PostMapping("create")
        public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title)
        {
            return quizService.createQuiz(category, numQ, title);
        }

        @PostMapping("get/{id}")
        public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id)
        {
                return quizService.getQuizQuestions(id);
        }
        @PostMapping("submit/{id}")
        public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id,@RequestBody List<Response> responses)
        {
                return quizService.calculateResult(id,responses);
        }

}
