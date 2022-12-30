package org.example;

public class Animal {
    //protected type says:
    //any class that's a sublclass can access this field
    protected String type;

    private  String size;
    private double weight;

    public void print(){
        System.out.println("Animal class print method");
    }

    public Animal() {

    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    public void move(String speed){
        System.out.println(type+" moves "+speed);
    }
    public void makeNoise(){
        System.out.println(type+" makes this weird noise."); 
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

}
