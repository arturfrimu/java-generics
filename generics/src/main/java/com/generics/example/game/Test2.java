package com.generics.example.game;

public class Test2 {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Maria", 15);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Ksenia", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        // Problem nr 2 - We can create any team with any type

        Team<Schoolar> schoolarTeam = new Team<>("Draco");
        Team<Student> studentTeam = new Team<>("Dunk");
        Team<Employee> workersTeam = new Team<>("Workers");

        // incorrect business login
        // type argument java.lang.String is not within bounds of type-variable T
//      Team<String> str = new Team<>("Bad Idea");


        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        workersTeam.addNewParticipant(employee1);
        workersTeam.addNewParticipant(employee2);


        // ==============================================================
    }
}
