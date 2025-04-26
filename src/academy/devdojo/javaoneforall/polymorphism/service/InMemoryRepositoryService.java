package academy.devdojo.javaoneforall.polymorphism.service;

import academy.devdojo.javaoneforall.polymorphism.repository.Repository;

public class InMemoryRepositoryService implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in the memory");
    }
}
