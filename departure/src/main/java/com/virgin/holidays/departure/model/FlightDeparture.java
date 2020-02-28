package com.virgin.holidays.departure.model;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightDeparture {

    private final LocalTime departureTime;
    private final String destination;
    private final String destAirportIATA;
    private final String flightNumber;
    private List<FlightDays> departureDays = new ArrayList<FlightDays>();

    public FlightDeparture(@JsonProperty("departureTime") LocalTime departureTime,
                           @JsonProperty("destination") String destination,
                           @JsonProperty("destAirportIATA") String destAirportIATA,
                           @JsonProperty("flightNumber") String flightNumber,
                           @JsonProperty("departureDays") List<FlightDays> departureDays) {
        this.departureTime = departureTime;
        this.destination = destination;
        this.destAirportIATA = destAirportIATA;
        this.flightNumber = flightNumber;
        this.departureDays = departureDays;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public String getDestAirportIATA() {
        return destAirportIATA;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    @JsonIgnore
    public List<FlightDays> getDepartureDays() {
        return departureDays;
    }
}
