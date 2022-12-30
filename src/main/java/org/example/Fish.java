package org.example;

public class Fish extends Animal{
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        //calls constructor from Animal
        super(type, "small", weight);
        //unique traits of fish below
        this.gills = gills;
        this.fins = fins;
    }
    private void moveMuscles(){
        System.out.println("muscles moving");
    }
    private void moveBackFin(){
        System.out.println("backfin moving because speed == fast");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed=="fast"){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
