package com.nomad;

public class Team {

    private String name;
    private int record;
    League league;

    public Team(){}
    public Team(String nme, int rec, League newLeague){
        this.name = nme;
        this.record = rec;
        this.league = newLeague;
    }
    public Team(String nme, int rec){
        this.name = nme;
        this.record = rec;}

    public String getName(){
        return name;
    }
    public int getRecord() {
        return record;
    }
    public void display(){

       System.out.println("name of team: " + getName() + "\n Record: " + getRecord() + "\nLeague: " + league.getleagueName()) ;


    }
}
