class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Mainn {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Generic Animal", 5);
        animals[1] = new Dog("Buddy", 3);
        animals[2] = new Dog("Max", 4);

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}