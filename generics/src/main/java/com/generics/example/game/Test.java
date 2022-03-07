package com.generics.example.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Maria", 15);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Ksenia", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team schoolarTeam = new Team("Draco");

        // Problem nr 1 - We can add any participant to the schoolarTeam

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        schoolarTeam.addNewParticipant(student1);
        schoolarTeam.addNewParticipant(employee1);

        // ==============================================================

    }
}
