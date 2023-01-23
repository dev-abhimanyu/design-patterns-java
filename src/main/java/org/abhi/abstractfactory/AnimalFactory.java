/**
 * Created by Abhimanyu
 * on 2023-01-23 January 2023
 **/
package org.abhi.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal>{
    @Override
    public Animal create(String animalType) {
        if ("Duck".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Dog".equalsIgnoreCase(animalType)) {
            return new Duck();
        }
        return null;
    }
}
