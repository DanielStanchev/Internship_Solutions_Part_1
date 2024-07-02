package UnitTesting_07;

import javaBasics.factoryPattern_06.Animal;
import javaBasics.factoryPattern_06.AnimalFactory;
import javaBasics.factoryPattern_06.Cat;
import javaBasics.factoryPattern_06.Dog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AnimalFactoryTest {

    @Test
    public void getAnimalTest() {

        Animal cat = AnimalFactory.getAnimal("cat");
        assertEquals(Cat.class, cat.getClass());

        Animal dog = AnimalFactory.getAnimal("dog");
        assertEquals(Dog.class, dog.getClass());

        try {
            Animal unknown = AnimalFactory.getAnimal("lion");
        } catch (IllegalArgumentException e) {
            assertEquals("No animal found", e.getMessage());
        }
    }
}