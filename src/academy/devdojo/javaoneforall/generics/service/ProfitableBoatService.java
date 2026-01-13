package academy.devdojo.javaoneforall.generics.service;

import academy.devdojo.javaoneforall.generics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class ProfitableBoatService {
    private List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Speedboat"), new Boat("Canoe")));

    public Boat retrieveAvailableBoat() {
        System.out.println("Retrieving available Boat");
        Boat boat = availableBoats.remove(0);
        System.out.println("Renting Boat: " + boat);
        System.out.println("Available cars to rent: ");
        System.out.println(availableBoats);
        return boat;
    }

    public void returnRentalBoat(Boat boat) {
        System.out.println("Returning Boat: " + boat);
        availableBoats.add(boat);
        System.out.println("Available cars to rent: ");
        System.out.println(availableBoats);
    }
}
