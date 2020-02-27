package com.virgin.holidays.departure.dao;

import com.virgin.holidays.departure.model.FlightDays;
import com.virgin.holidays.departure.model.FlightDeparture;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository("Dao")
public class FlightDepartureDaoService implements FlightDepartureDao {

    private static List<FlightDeparture> DB = new ArrayList<>();

    @Override
    public List<FlightDeparture> selectFlightsDepartbyDay(FlightDays flightDays) {
        return DB.stream().filter(flightDeparture -> flightDeparture.getDepartureDays().stream().anyMatch(flightDays1 -> flightDays.equals(flightDays1))
        ).sorted((f1, f2) -> (f1.getDepartureTime().compareTo(f2.getDepartureTime()))).collect(Collectors.toList());
    }

    @Override
    public int insertFlightDepartures(FlightDeparture[] flightDepartures) {
        for (FlightDeparture flightDeparture : flightDepartures) {
            DB.add(new FlightDeparture(flightDeparture.getDepartureTime(),
                    flightDeparture.getDestination(),
                    flightDeparture.getDestAirportIATA(),
                    flightDeparture.getFlightNumber(),
                    flightDeparture.getDepartureDays())
            );
        }
        return 1;
    }

    @Override
    public List<FlightDeparture> getAllFlightDeparture() {
        return DB;
    }

}
