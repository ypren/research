package com.ypren.demo;

/**
 * Sealed class test.
 * Which added since Java 15
 */
public class SealedClass {
    public static void main(String[] args) {
        AnimalService dogService = new DogServiceImpl();
        dogService.doSomething();
    }
}

interface AnimalService {
    void doSomething();
}

sealed interface DogService extends AnimalService permits DogServiceImpl {

}

non-sealed class DogServiceImpl implements DogService {

    @Override
    public void doSomething() {
        System.out.println("From sealed class DogService.");
    }
}
