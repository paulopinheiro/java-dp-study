package br.com.paulopinheiro.javadpstudy.behavioral.iterator;

public class ArtsSubjectsCollection implements SubjectsCollection {
    private int arrayLength = 0;
    private final static int MAX_SIZE = 4;
    private final String[] subjectList = new String[MAX_SIZE];

    @Override
    public void addSubject(String subject) {
        if (this.arrayLength >= MAX_SIZE) throw new ArrayIndexOutOfBoundsException("Subjects list is full");

        subjectList[arrayLength] = subject;
        arrayLength += 1;
    }

    @Override
    public CollegeIterator createIterator() {
        return new ArtsIterator(this.subjectList);
    }
}
