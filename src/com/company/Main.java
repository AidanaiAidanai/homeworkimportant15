package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Animal shark = new Shark();
       Animal turtle = new Turtle();
       Animal eagle = new Eagle();
     Shark[]sharks = new Shark[1];
       Turtle[]turtles = new Turtle[1];
       Eagle[]eagles = new Eagle[1];

       Animal[]animals = {shark, turtle, eagle};
        for (Animal animal1 : animals) {
            if(animal1 instanceof Shark){
                System.out.println(animal1);
                ((Shark) animal1).attack();
                sharks[0]=(Shark) animal1;
            }
            if(animal1 instanceof Turtle){
                System.out.println(animal1);
                ((Turtle) animal1).swim();
                turtles[0]=(Turtle) animal1;
            }
            if(animal1 instanceof Eagle){
                System.out.println(animal1);
                ((Eagle) animal1).fly();
                eagles[0] = (Eagle) animal1;
            }
        }
    }
}
