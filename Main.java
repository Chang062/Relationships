package com.nomad;

public class Main {

    public static void main(String[] args) {

        Player play = new Player("John","Down town",15,"Defence",new Team("Lakers", 15));
        Captain cappo = new Captain();

        Team team = new Team("Warriors", 15, new League("Silver"));

        team.display();

        //play.displayPlayer();
        //cappo.setCaptain();
       // cappo.getCaptain();
    }
}
