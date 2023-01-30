/**
 * Created by Abhimanyu
 * on 2023-01-29 January 2023
 **/
package org.abhi.singleton;

class Singleton{
    private static Singleton singleton_instance = null;
    private Singleton(){
        System.out.println("Singleton: Constructor called");
    }
    public static Singleton getInstance(){
        if(singleton_instance == null)
            singleton_instance = new Singleton();
        return singleton_instance;
    }

}
public class SingletonDriver {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        System.out.println("Hashcode of obj1 is :" + obj1.hashCode());
        System.out.println("Hashcode of obj2 is :" + obj2.hashCode());
        System.out.println("Hashcode of obj3 is :" + obj3.hashCode());
        if(obj1==obj2 && obj2==obj3)
            System.out.println("The three objects point to the same memory location on the heap i.e., to the same object.");
        else
            System.out.println("The three objects DO NOT point to the same memory location on the heap.");
    }
}
