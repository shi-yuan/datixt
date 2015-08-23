package com.datixt.model;

import java.util.List;

public class Question {
    /**
     * 题号
     */
    private Integer id;

    /**
     * 内容
     */
    private String content;

    /**
     * 答案选项
     */
    private List<Answer> answers;

    /**
     * 正确答案
     */
    private String answer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

