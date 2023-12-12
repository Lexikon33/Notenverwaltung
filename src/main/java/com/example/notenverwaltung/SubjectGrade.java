package com.example.notenverwaltung;

public class SubjectGrade extends Grade{

    private Subject subject;

    public SubjectGrade(String nameGrade) {
        super(nameGrade);
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
