package com.virgin.holidays.departure.service;

import com.virgin.holidays.departure.dao.FlightDepartureDao;
import com.virgin.holidays.departure.model.FlightDays;
import com.virgin.holidays.departure.model.FlightDeparture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightDepartureService {

    private final FlightDepartureDao flightDepartureDao;

    @Autowired
    public FlightDepartureService(@Qualifier("Dao") FlightDepartureDao flightDepartureDao) {
        this.flightDepartureDao = flightDepartureDao;
    }

    public int addFlightDepartures(FlightDeparture[] flightDepartures){
        return flightDepartureDao.insertFlightDepartures(flightDepartures);
    }

    public List<FlightDeparture> getFlightsDepartbyDay(FlightDays flightDays){
        return flightDepartureDao.selectFlightsDepartbyDay(flightDays);
    }

    public List<FlightDeparture> getAllFlightDeparture() {
        return flightDepartureDao.getAllFlightDeparture();
    }
}
