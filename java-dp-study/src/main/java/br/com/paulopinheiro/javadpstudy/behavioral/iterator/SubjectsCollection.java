package br.com.paulopinheiro.javadpstudy.behavioral.iterator;

public interface SubjectsCollection {
    public void addSubject(String subject);
    public CollegeIterator createIterator();
}
