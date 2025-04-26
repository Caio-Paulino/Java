package academy.devdojo.javaoneforall.polymorphism.test;

import academy.devdojo.javaoneforall.polymorphism.service.DatabaseRepositoryService;

public class RepositoryTest {
    public static void main(String[] args) {
        DatabaseRepositoryService dbService = new DatabaseRepositoryService();
        dbService.save();
    }
}
