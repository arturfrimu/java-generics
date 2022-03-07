package com.generics.example.game;

public class Test3 {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Maria", 15);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Ksenia", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team<Schoolar> schoolarTeam = new Team<>("Draco");
        Team<Student> studentTeam = new Team<>("Dunk");
        Team<Employee> workersTeam = new Team<>("Workers");

        Team<Schoolar> schoolarTeam2 = new Team<>("Wintro");
        schoolarTeam2.addNewParticipant(new Schoolar("Ivan", 13));
        schoolarTeam2.addNewParticipant(new Schoolar("Maria", 15));

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        workersTeam.addNewParticipant(employee1);
        workersTeam.addNewParticipant(employee2);

        // Problem nr 3 - Any team can play with any team
        
        schoolarTeam.playWith(workersTeam);
        workersTeam.playWith(studentTeam);

        // ==============================================================
    }
}
