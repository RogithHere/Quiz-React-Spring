package com.rogith.QuizSpring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Quiz")
public class QuestionController {

    @GetMapping("allQuiz")
    public String getQuestions(){
        return "15 Questions";
    }
}
