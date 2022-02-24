package com.nomad;

public class Captain extends Player{
    private boolean captain;
    Team panters = new Team("Lakers", 15);
    public Captain (){}

    public boolean setCap() {
        return true;
    }

    public void setCaptain (){
        setName("Bond");
        setAddress("Kingston");
        setNumber(15);
        setPosition("Quarter back");
        setCap();
    }

    public void getCaptain(){
       System.out.println( getName());
        System.out.println(getAddress());
        System.out.println(getNumber());
        System.out.println(getPosition());
        System.out.println(panters.getName());
        System.out.println(setCap());


    }


}

