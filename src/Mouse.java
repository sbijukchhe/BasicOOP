
// Mouse inherits fields and methods from Animal - Inheritance
public class Mouse extends Animal {

    // no-arg constructor
    public Mouse(){
        System.out.println(("This is a  mouse....."));
    }

    // Polymorphism
    @Override
    public String sleep() {
        return "A mouse sleeps...";
    }

    // Polymorphism
    @Override
    public String eat() {
        return "A mouse eats cheese...";
    }

    public String makeSound() {
        return "squeak...";
    }
}
