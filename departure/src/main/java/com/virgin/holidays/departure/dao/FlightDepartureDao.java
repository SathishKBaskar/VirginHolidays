package com.virgin.holidays.departure.dao;

import com.virgin.holidays.departure.model.FlightDays;
import com.virgin.holidays.departure.model.FlightDeparture;

import java.util.List;

public interface FlightDepartureDao {

    List<FlightDeparture> selectFlightsDepartbyDay(FlightDays flightDays);

    int insertFlightDepartures(FlightDeparture[] flightDepartures);

    List<FlightDeparture> getAllFlightDeparture();

}
