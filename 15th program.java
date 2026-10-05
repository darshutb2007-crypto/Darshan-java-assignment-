class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Fox extends Animal {
    void sound() {
        System.out.println("Fox makes a sound.");
    }
}

class Rabbit extends Animal {
    void hop() {
        System.out.println("Rabbit hops around.");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.hop();
    }
}
