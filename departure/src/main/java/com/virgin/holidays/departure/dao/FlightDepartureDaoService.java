package com.virgin.holidays.departure.dao;

import com.virgin.holidays.departure.model.FlightDays;
import com.virgin.holidays.departure.model.FlightDeparture;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository("Dao")
public class FlightDepartureDaoService implements FlightDepartureDao {

    private static List<FlightDeparture> DB = new ArrayList<>();

    @Override
    public List<FlightDeparture> selectFlightsDepartbyDay(FlightDays flightDays) {
        return DB.stream().filter(flightDeparture -> flightDeparture.getDepartureDays().stream().anyMatch(flightDays1 -> flightDays.equals(flightDays1))
        ).sorted((Comparator.comparing(FlightDeparture::getDepartureTime))).collect(Collectors.toList());
    }

    @Override
    public int insertFlightDepartures(FlightDeparture[] flightDepartures) {
        DB.addAll(Arrays.stream(flightDepartures).collect(Collectors.toList()));
        return 1;
    }

    @Override
    public List<FlightDeparture> getAllFlightDeparture() {
        return DB;
    }

}
