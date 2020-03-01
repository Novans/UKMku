package com.example.ukmku.model;

public class FAQ {

    private String _id, question, answer;

    public FAQ(String _id, String question, String answer) {
        this._id = _id;
        this.question = question;
        this.answer = answer;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
