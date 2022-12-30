package org.example;
/*
Christian Cyr
    demonstration of polymorphism
 */
public class Main {
    public static void main(String[] args) {


        Animal animal = new Animal("Generic Animal", "Huge",400);
        doAnimalStuff(animal,"slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        //doAnimalStuff is a method from Animal,
        // so it displays the use of inheritance
        doAnimalStuff(yorkie,"fast");
        //retriever displays inheritance through doAnimalStuff method
        Dog retriever = new Dog("Labrador",65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");
        Dog wolf = new Dog("Wolf",40);
        doAnimalStuff(wolf,"slow");
        Fish goldie = new Fish("Goldfish",.25,2,3);
        doAnimalStuff(goldie, "fast");




    }
    //pre: Animal, speed
    //post:makeNoise, move, toString
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);

        //this line underneath calls toString method
        //if a dog object uses doAnimalStuff method then the
        //   toString for Dog would be called as well as Animal
        System.out.println(animal);
        System.out.println("- - - -");

    }
}