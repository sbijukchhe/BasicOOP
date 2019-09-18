/*
 * All Cats are Animals but all Animals are not Cats
 */

// Cat inherits fields and methods from Animal - Inheritance
public class Cat extends Animal {

    public Cat() {
        super();
        System.out.println("Now I am a Cat!");
    }

    // Polymorphism
    @Override
    public String sleep() {
        return "A cat sleeps...";
    }

    // Polymorphism
    @Override
    public String eat() {
        return "A cat eats...";
    }

    public String purr() {
        return "purrr...";
    }

}