<<<<<<< HEAD
public class Ques2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        
        animal.makeSound();
        cat.makeSound();
        dog.makeSound();
    }
}
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The Cat meows.");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
=======
public class Ques2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        
        animal.makeSound();
        cat.makeSound();
        dog.makeSound();
    }
}
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The Cat meows.");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
>>>>>>> d5fa77123764c975fd733818b5f9fbfcee1af006
}