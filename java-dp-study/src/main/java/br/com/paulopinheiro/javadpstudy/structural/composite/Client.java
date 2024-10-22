package br.com.paulopinheiro.javadpstudy.structural.composite;

public class Client {
    public static void main(String[] args) {
        //Preparing the hierarchy
        Professor samuel = new Professor("Samuel","Adjunt");
        Professor trisha = new Professor("Trisha","Associate");
        Professor rick = new Professor("Rick","Professor");
        Professor karen = new Professor("Karen","Professor");
        Professor kate = new Professor("Kate","Associate");

        Supervisor dean = new Supervisor("John", "Dean", "Technology");
        Supervisor mathHead = new Supervisor("Paul","Head","Mathematics");
        Supervisor csHead = new Supervisor("Cristine","Head","Computer Science");

        dean.addFaculty(mathHead);
        dean.addFaculty(csHead);

        mathHead.addFaculty(samuel);
        mathHead.addFaculty(trisha);

        csHead.addFaculty(rick);
        csHead.addFaculty(karen);
        csHead.addFaculty(kate);

        //Showing details of entire hierarchy
        System.out.println("The college has the following structure:");
        System.out.println(dean.getDetails());
        for (Faculty head:dean.getMyFaculty()) {
            System.out.println("\t" + head.getDetails());
            for (Faculty professor:((Supervisor)head).getMyFaculty()) {
                System.out.println("\t\t" + professor.getDetails());
            }
        }

        //Removing a Computer Science member
        //And showing details only of the department
        csHead.removeFaculty(rick);
        System.out.println("Then, after " + rick.getDetails() + 
           " leaving the organization CSE Department has the following faculty:");
        for (Faculty p:csHead.getMyFaculty()) {
            System.out.println(p.getDetails());
        }
    }
}
