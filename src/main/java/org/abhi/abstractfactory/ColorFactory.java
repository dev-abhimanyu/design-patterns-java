/**
 * Created by Abhimanyu
 * on 2023-01-23 January 2023
 **/
package org.abhi.abstractfactory;

public class ColorFactory implements AbstractFactory<Color>{
    @Override
    public Color create(String animalType) {
        if ("White".equalsIgnoreCase(animalType)) {
            return new White();
        } else if ("Brown".equalsIgnoreCase(animalType)) {
            return new Brown();
        }
        return null;
    }
}
