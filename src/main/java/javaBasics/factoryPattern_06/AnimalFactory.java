package javaBasics.factoryPattern_06;

public class AnimalFactory {

    public static Animal getAnimal(String animalType) {
        if (animalType.equals("cat")) {
            return new Cat();
        } else if (animalType.equals("dog")) {
            return new Dog();
        }
        throw new IllegalArgumentException("No animal found");
    }
}
