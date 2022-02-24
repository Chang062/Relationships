package com.nomad;
import java.util.*;

public class Person {
     Scanner input = new Scanner(System.in);
    private String name;
    private String address;

    public Person(){}
    public Person(String nme, String addr){
        this.name= nme;
        this.address = addr;
    }

    public void setAddress(String addr) {
        //System.out.println ("Enter Address");
        //String addr = "";
        //addr = input.nextLine();
        this.address = addr;
    }
    public void setName(String nme) {
        this.name = nme;
    }
    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }
}
