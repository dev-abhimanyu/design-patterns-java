/**
 * Created by Abhimanyu
 * on 2023-01-23 January 2023
 **/
package org.abhi.abstractfactory;

public class AbstractFactoryDriver {
    public static void main(String[] args) {
        // to get a new Animal Factory and then get a new Animal from it
        Dog tom = (Dog) FactoryProvider.getFactory("Animal").create("Dog");
        System.out.println(tom.getAnimal() + " " +tom.makeSound());

        // to get a new Color Factory and then get a new Color from it
        Color color = (Color) FactoryProvider.getFactory("Color").create("White");
        System.out.println(color.getColor());
    }
}
