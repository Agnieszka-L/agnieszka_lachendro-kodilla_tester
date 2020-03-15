package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    public void findFlightsFromKrakow() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        String departure = "Kraków";
        //when
        List<Flight> flightsFromKrakow = flightFinder.findFlightsFrom(departure);
        //then
        assertEquals(2, flightsFromKrakow.size());
        Flight firstFlight = flightsFromKrakow.get(0);
        assertEquals(departure, firstFlight.getDeparture());
        Flight secondFlight = flightsFromKrakow.get(1);
        assertEquals(departure, secondFlight.getDeparture());
    }

    @Test
    public void findFlightsFromDallas() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        String departure = "Dallas";
        //when
        List<Flight> flightsFromDallas = flightFinder.findFlightsFrom(departure);
        //then
        assertEquals(0, flightsFromDallas.size());
    }

    @Test
    public void findFlightsFromChciago() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        String departure = "Chicago";
        //when
        List<Flight> flightsFromChicago = flightFinder.findFlightsFrom(departure);
        //then
        assertEquals(1, flightsFromChicago.size());
        Flight firstFlight = flightsFromChicago.get(0);
        assertEquals(departure, firstFlight.getDeparture());

    }

    @Test
    public void findFlightsToWarszawa() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        String arrival = "Warszawa";
        //when
        List<Flight> flightsTo = flightFinder.findFlightsTo(arrival);
        //then
        assertEquals(2, flightsTo.size());
        Flight firstFlight = flightsTo.get(0);
        assertEquals(arrival, firstFlight.getArrival());
        Flight secondFlight = flightsTo.get(1);
        assertEquals(arrival, secondFlight.getArrival());
    }

    @Test
    public void findFlightsToDallas() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        String arrival = "Dallas";
        //when
        List<Flight> flightsTo = flightFinder.findFlightsTo(arrival);
        //then
        assertEquals(0, flightsTo.size());
    }

    @Test
    public void findFlightsToChicago() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        String arrival = "Chicago";
        //when
        List<Flight> flightsTo = flightFinder.findFlightsTo(arrival);
        //then
        assertEquals(1, flightsTo.size());
        Flight firstFlight = flightsTo.get(0);
        assertEquals(arrival, firstFlight.getArrival());
    }
}