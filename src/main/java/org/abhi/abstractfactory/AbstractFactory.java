package org.abhi.abstractfactory;

public interface AbstractFactory<T> {
    T create(String animalType);
}
