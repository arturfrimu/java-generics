package com.generics.example.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participantList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        this.participantList.add(participant);
    }

    public void playWith(Team team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0)
            winnerName = this.name;
        else
            winnerName = team.name;

        System.out.println("Win team " + winnerName);
    }
}
