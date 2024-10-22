package br.com.paulopinheiro.javadpstudy.udemy.composite.example1;

interface Employee {
    public void showEmployeeDetails();
}

class Developer implements Employee {
    private String name;
    private long empId;
    private String position;

    public Developer(long empId, String name, String position)  {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails()   {
        System.out.println(empId+" " +name+ " " + position);
    }
}

class Manager implements Employee {
    private String name;
    private long empId;
    private String position;

    public Manager(long empId, String name, String position)  {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails()   {
        System.out.println(empId+" " +name+ " " + position);
    }
}
