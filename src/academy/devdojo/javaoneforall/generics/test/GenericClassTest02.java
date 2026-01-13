package academy.devdojo.javaoneforall.generics.test;

import academy.devdojo.javaoneforall.generics.domain.Boat;
import academy.devdojo.javaoneforall.generics.service.ProfitableBoatService;

public class GenericClassTest02 {
    public static void main(String[] args) {
        ProfitableBoatService profitableBoatService = new ProfitableBoatService();
        Boat boat = profitableBoatService.retrieveAvailableBoat();
        System.out.println("Using Boat for one month...");
        profitableBoatService.returnRentalBoat(boat);
    }
}
