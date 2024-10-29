package br.com.paulopinheiro.javadpstudy.behavioral.iterator;

import java.util.LinkedList;

public class ScienceSubjectsCollection implements SubjectsCollection {
    private final LinkedList<String> subjectList = new LinkedList<>();

    @Override
    public void addSubject(String subject) {
        this.subjectList.add(subject);
    }

    @Override
    public CollegeIterator createIterator() {
        return new ScienceIterator(this.subjectList);
    }
    
}
