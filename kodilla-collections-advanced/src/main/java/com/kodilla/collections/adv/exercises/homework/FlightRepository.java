package com.kodilla.collections.adv.exercises.homework;


import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        Flight krakowWarszawa = new Flight("Kraków", "Warszawa");
        Flight krakowWChicago = new Flight("Kraków", "Chicago");
        Flight chicagoWarszawa = new Flight("Chicago", "Warszawa");
        Flight barcelonaRzym = new Flight("Barcelona", "Rzym");
        flights.add(krakowWarszawa);
        flights.add(barcelonaRzym);
        flights.add(chicagoWarszawa);
        flights.add(krakowWChicago);
        return flights;
    }
}
