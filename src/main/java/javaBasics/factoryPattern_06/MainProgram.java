package javaBasics.factoryPattern_06;


import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        //Write an interface Animal which has 1 method - void walk(). Write a class Dog
        //that implements the interface (walk() method prints "A dog is walking"). Write a class Cat that
        //implements Animal. Create main program, which accepts “cat” or “dog” as parameter, creates
        //the appropriate object and call its walk method. For this purpose use Factory pattern.

        Scanner scanner = new Scanner(System.in);
        String animalType = scanner.nextLine();

        Animal animal = AnimalFactory.getAnimal(animalType);
        animal.walk();

    }
}