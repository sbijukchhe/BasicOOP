/*
 * All Birds are Animals but all Animals are not Birds
 */

// Bird inherits fields and methods from Animal - Inheritance
public class Bird extends Animal {

    // no - arg constructor
    public Bird() {
        //super();
        System.out.println("A bird is hatched...");
    }

    // Polymorphism
    @Override
    public String sleep() {
        return "A bird sleeps soundly...";
    }
    // Polymorphism
    @Override
    public String eat() {
        return "A bird eats...";
    }


    // returns String
    public String fly() {
        //Birds can fly but other animals can't so this method
        //is unique to the Bird class
        return "A bird flies...";
    }
}
 