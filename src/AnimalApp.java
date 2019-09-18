/*
Your Assignment:

What just happened? Comment your understanding of object-oriented programming from the four classes created above.
Where is the method executing encapsulation? Inheritance? Or polymorphism?

Create 2 more animal classes (i.e. Dog, Mouse, etc.) and extend the animal class to verify your understanding.

I don't see encapsulation in this program
 */



// ******  I don't see encapsulation in this program  **************
// *****  For encapsulation, we need to define private variables; and getters and setters method to access them  *****

public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());  // Polymorphism
        print(c.sleep());  // Polymorphism
        print(c.purr()); // Inheritance


        Bird b = new Bird();
        print(b.eat());  // Polymorphism
        print(b.sleep());  // Polymorphism
        print(b.fly());// Inheritance

        Dog d = new Dog();
        print(d.eat());  // Polymorphism
        print(d.sleep());  // Polymorphism
        print(d.makeSound());// Inheritance


        Mouse m = new Mouse();
        print(m.eat());  // Polymorphism
        print(m.sleep());  // Polymorphism
        print(m.makeSound());// Inheritance


        // Polymorphism
        Animal a1 = new Cat();
        print("Cat with Animal reference: " + a1.eat());
        print("Cat with Animal reference: " + a1.sleep());
       // print(a1.purr());  // invalid because with parent reference child specific methods can't be accessed
        print("-------------------------------------------------");


        // Polymorphism
        Animal a2 = new Bird();
        print("Bird with Animal reference: " + a2.eat());
        print("Bird with Animal reference: " + a2.sleep());
        print("-----------------------------------------------------");

        // Polymorphism
        Animal a3 = new Dog();
        print("Dog with Animal reference: " + a3.eat());
        print("Dog with Animal reference: " + a3.sleep());
        print("-------------------------------------------------");

        // Polymorphism
        Animal a4 = new Mouse();
        print("Mouse with Animal reference: " + a4.eat());
        print("Mouse with Animal reference: " + a4.sleep());
        print("---------------------------------------------------");
    }

    private static void print(String s) {
        System.out.println(s);
    }
}