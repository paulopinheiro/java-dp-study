package br.com.paulopinheiro.javadpstudy.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty {
    private String name;
    private String title;
    private String department;
    protected final List<Faculty> facultyList = new ArrayList<>();

    public Supervisor(String name, String title, String department) {
        this.name = name;
        this.title = title;
        this.department = department;
    }

    public void addFaculty(Faculty professor) {
        this.facultyList.add(professor);
    }

    public void removeFaculty(Faculty professor) {
        this.facultyList.remove(professor);
    }

    public List<Faculty> getMyFaculty() {
        return this.facultyList;
    }

    @Override
    public String getDetails() {
        return this.name + ", " + this.title + " of " + this.department;
    }
}
