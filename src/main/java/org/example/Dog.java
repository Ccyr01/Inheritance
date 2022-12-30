package org.example;

public class Dog extends Animal{
    //Dog has two fields from this class but can inherit from Animal
    //due to the extends keyword and Dog is a subclass of animal
    private String earShape;
    private String tailShape;
    //Constructor that includes 0 parameters
    //Automatically sets:
    //type to Mutt
    //size to Big
    //weight to 50
    public Dog() {
        super("Mutt", "Big", 50);
    }
    //Constructor includes four fields
    //Doesn't include String size this is
    //Makes earShape Perky and tailShape Curly if not specified when creating dog
    //Then calls other constructor with four parameters which
    //also calls the Animal constructor with super
    public Dog(String type,  double weight) {
        this(type,weight, "Perky" , "Curly");
    }

    //Call to super constructor plus unique attributes
    //THis constructor calls Animal constr which needs a String size
    public Dog(String type, double weight, String earShape, String tailShape){
        super(type,weight < 15 ? "Small" : (weight < 40 ? "medium" : "Large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;

    }
    //tosString includes earShape, tailShape and from super
    //super: type, size, and weight
    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
    //move uses Animal move as well as an extra sysout
    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");
        if(speed == "slow"){
            walk();
            wagTail();

        }
        else{
            run();
            bark();
        }
        System.out.println();
    }
    //method bark is private because we are only going to call from move method internally
    private void bark(){
        System.out.println("Woof! ");
    }

    private void walk(){
        System.out.println("Dog Walking ");
    }
    private void run(){
        System.out.println("Dog running ");
    }
    private void wagTail(){
        System.out.println("Dog Wagging Tail. ");
    }
    //method makeNoise displays overwriting the Animal makeNoise method
    public void makeNoise(){
        if(type == "Wolf"){
            System.out.println("Ow Woooo because I'm a Wolf inside makeNoise method");
        }
        bark();
        System.out.println();
    }
}
