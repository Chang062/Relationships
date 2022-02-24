package com.nomad;

public class Coach extends Person{
    private int accreditationLevel;
    private int yearsExperienced;

    public Coach(){};
    public Coach (String nme ,String addr, int level, int years){
        super(nme,addr);
        this.accreditationLevel=level;
        this.yearsExperienced = years;
    }
        public int getAccreditationLevel()
        {
            return accreditationLevel;
        }
        public int getYearsExperienced()
        {
         return yearsExperienced;
        }
}
