package br.com.paulopinheiro.javadpstudy.behavioral.iterator;

public class Client {
    private static final SubjectsCollection scienceList = new ScienceSubjectsCollection();
    private static final SubjectsCollection artsList = new ArtsSubjectsCollection();

    public static void main(String[] args) {
        populateScienceList();
        populateArtsList();

        System.out.println("\nScience subjects list:");
        traverseList(scienceList.createIterator());

        System.out.println("\nArts subjects list:");
        traverseList(artsList.createIterator());
    }

    private static void populateScienceList() {
        scienceList.addSubject("Biology");
        scienceList.addSubject("Engineering");
        scienceList.addSubject("Mechanics");
        scienceList.addSubject("Trigonometry");
    }

    private static void populateArtsList() {
        artsList.addSubject("Music");
        artsList.addSubject("Painting");
        artsList.addSubject("Ballet");
        artsList.addSubject("Sculpture");
    }

    private static void traverseList(CollegeIterator iterator) {
        iterator.first();
        while(!iterator.isDone()) System.out.println(iterator.next());
    }
}
