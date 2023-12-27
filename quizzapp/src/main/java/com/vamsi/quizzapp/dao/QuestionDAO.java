package com.vamsi.quizzapp.dao;

import com.vamsi.quizzapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDAO extends JpaRepository<Question,Integer>
{
    List<Question> findByCategory(String category);

    @Override
    void deleteById(Integer id);

    @Query(value = "select * from quizquestion q where q.category=:category order by random() limit :numQ", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int numQ);
}

