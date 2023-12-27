package com.vamsi.quizzapp.controller;

import com.vamsi.quizzapp.model.Question;
import com.vamsi.quizzapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestion()
    {
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category)
    {
        return questionService.getQuestionsByCategory(category);
    }
    @PostMapping("add")
    public String addQuestion(@RequestBody Question question)
    {
        return questionService.addQuestion(question);
    }

    @DeleteMapping("delete/{id}")
    public String deleteQuestion(@PathVariable int id)
    {
        return questionService.deleteQuestion(id);
    }

    /*@PutMapping("update/{id}")
    private String updateQuestion(@PathVariable @RequestBody int id)
    {
        return questionService.updateQuestion(id);
    }*/

}
