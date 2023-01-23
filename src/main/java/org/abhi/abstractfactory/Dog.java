/**
 * Created by Abhimanyu
 * on 2023-01-23 January 2023
 **/
package org.abhi.abstractfactory;

public class Dog implements Animal{
    @Override
    public String getAnimal() {
        return "Dog";
    }
    @Override
    public String makeSound() {
        return "Bark";
    }
}
