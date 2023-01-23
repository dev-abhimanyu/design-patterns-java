/**
 * Created by Abhimanyu
 * on 2023-01-23 January 2023
 **/
package org.abhi.abstractfactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String factoryType){
        if("Animal".equalsIgnoreCase(factoryType)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(factoryType)){
            return new ColorFactory();
        }
        return null;
    }
}
