package com.company;

public class Person {
    String name ="";
    String military="";
    String education="";
    String workhistory="";

    Person(){}

    Person(String mname, String mmili, String medu,String work){

        this.name= mname;
        this.military = mmili;
        this.education = medu;
        this.workhistory = work;
    }
}
