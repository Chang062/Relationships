package com.nomad;

public class Player extends Person {
    private int number;
    private String position;
    private Team team;

   public Player(){};
    public Player (String nme, String addr, int num, String pos, Team teamName){
        super(nme,addr);
        this.number = num;
        this.position = pos;
        this.team = teamName;
    }
    public void setNumber(int num){
        this.number= num;
    }
    public void setPosition(String pos){
        this.position = pos;
    }

    public Player(int num, String pos) {
        this.number = num;
        this.position = pos;
    }

    public int getNumber() {
        return number;
    }
    public String getPosition(){
        return position;
    }

    void displayPlayer (){
        System.out.println (getName());
        System.out.println ( getPosition());
        System.out.println (getNumber());
        System.out.println (team.getName());
    }
}
