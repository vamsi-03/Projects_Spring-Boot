package com.vamsi.quizzapp.service;

import com.vamsi.quizzapp.model.Question;
import com.vamsi.quizzapp.dao.QuestionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDAO questionDao;

    public List<Question> getAllQuestions()
    {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
         questionDao.save(question);
         return "success";
    }

    public String deleteQuestion(int id) {
        questionDao.deleteById(id);
        return "deleted the record with id "+id+" successfully";
    }

    /*public String updateQuestion(int id) {
        questionDao.save(question);

    }*/
}
