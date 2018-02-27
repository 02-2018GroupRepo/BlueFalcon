package com.company;



public class Main {

    /* our clas within a class. if this were its own file as another group had it, it would be called "Person.class"  */


    public static void main(String[] args) {
	// write your code here
        /*creating a new instance for each person*/
        Person victor = new Person("Victor","", "University of Michigan","Some Factory");
        Person Bryant = new Person("Bryant","","Howard University","Lockheed Martin");
        Person Branden = new Person("Branden","US Navy","St. Leo University","Altanta Police");
        Person Shane = new Person("Shane","","Georgia Southern University","Sales");
        Person Rosslyn = new Person("Rosslyn","","University of North Texas","Cartronics");
        Person Dina = new Person("Dina","", "Georgia Tech","NBC");
        Person Aleya = new Person("Aleya","","Geogia State University","Georgia State TA");

        /*group each person into an array of Person objects*/
        Person[] people ={victor,Branden,Bryant,Shane,Rosslyn,Dina, Aleya};



        System.out.println("Team Blue Falcon");

        /*these are 'foreach' loops. essentially saying, for each Person object in the people array,
        refer to that Person as "p" and do work with p.*/
        for (Person p: people) {
            System.out.println(p.name);
        }

        System.out.println("\n\n");


        for (Person p: people) {
            if(!(p.education.isEmpty())){
                System.out.println("Studied at " + p.education);
            }

            if(!(p.military.isEmpty())){
                System.out.println(p.military);
            }
            if(!(p.workhistory.isEmpty())){
                System.out.println("Worked in " + p.workhistory);
            }

        }

    }
}
