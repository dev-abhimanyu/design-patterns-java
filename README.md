# design-patterns-java
## Implementation of some commonly used Design Patterns in Java

Design patterns are solutions to general problems that software developers faced during software development. This repository contains some of the most commonly used Desgin Patterens implementation in Java including:

1. Singleton 
2. Abstract Factory 

### Singleton 

A singleton class is a class that can have only one object at a time. This is done to restrict the limit of the number of object creation to only one. This ensures that there is access control to resources, for example, socket or database connection.
Singleton design pattern includes:
* Make a constructor private.
* Write a static method that has the return type object of this singleton class (lazy initialization).

### Abstract Factory 

Abstract Factory is a creational design pattern that lets us produce families of related objects without specifying their concrete classes. This is achieved through:
* Interfaces
* An abstract class or an interface called "Abstract Factory" which is responsible for generating factories of different classes. These classes are then used to create instances.
