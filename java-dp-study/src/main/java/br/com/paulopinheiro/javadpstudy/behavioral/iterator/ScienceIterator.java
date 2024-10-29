package br.com.paulopinheiro.javadpstudy.behavioral.iterator;

import java.util.LinkedList;

public class ScienceIterator implements CollegeIterator {
    private final LinkedList<String> subjectList;
    private int index;

    public ScienceIterator(LinkedList<String> subjectList) {
        this.subjectList = subjectList;
        index = 0;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public String next() {
        if (this.index >= this.subjectList.size()) throw new ArrayIndexOutOfBoundsException("You are at the last element in the list");

        String previousSubject = this.subjectList.get(this.index);
        index+= 1;
        return previousSubject;
    }

    @Override
    public boolean isDone() {
        return this.index == this.subjectList.size();
    }

    @Override
    public String currentItem() {
        return this.subjectList.get(this.index);
    }
}
