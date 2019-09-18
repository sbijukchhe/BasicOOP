
// Dog inherits fields and methods from Animal - Inheritance
public class Dog extends Animal{

    // no-arg constructor
    public Dog(){
        System.out.println("Now I am a Dog!");
    }

    // Polymorphism
    @Override
    public String sleep() {
        return "A dog sleeps...";
    }

    // Polymorphism
    @Override
    public String eat() {
        return "A dog eats bones...";
    }

    public String makeSound() {
        return "woof...";
    }
}
