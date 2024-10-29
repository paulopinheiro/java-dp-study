package br.com.paulopinheiro.javadpstudy.behavioral.iterator;

public class ArtsIterator implements CollegeIterator {
    private final String[] subjectArray;
    private int index;

    public ArtsIterator(String[] subjectArray) {
        this.subjectArray = subjectArray;
        this.index = 0;
    }

    @Override
    public void first() {
        this.index = 0;
    }

    @Override
    public String next() {
        if (this.index>=this.subjectArray.length) throw new ArrayIndexOutOfBoundsException("You are at the end of the list");

        String currentSubject = this.subjectArray[this.index];
        this.index += 1;
        return currentSubject;
    }

    @Override
    public boolean isDone() {
        return this.index == this.subjectArray.length;
    }

    @Override
    public String currentItem() {
        return this.subjectArray[this.index];
    }
}
