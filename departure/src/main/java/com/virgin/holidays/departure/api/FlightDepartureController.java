package com.virgin.holidays.departure.api;

import com.virgin.holidays.departure.model.FlightDays;
import com.virgin.holidays.departure.model.FlightDeparture;
import com.virgin.holidays.departure.service.FlightDepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/departure")
@RestController
public class FlightDepartureController {

    private final FlightDepartureService flightDepartureService;

    @Autowired
    public FlightDepartureController(FlightDepartureService flightDepartureService) {
        this.flightDepartureService = flightDepartureService;
    }

    @PostMapping
    public void addFlightDepartures(@RequestBody FlightDeparture[] flightDepartures){
        flightDepartureService.addFlightDepartures(flightDepartures);
    }

    @GetMapping
    public List<FlightDeparture> getAllFlightDeparture(){
        return flightDepartureService.getAllFlightDeparture();
    }

    @GetMapping(path = "{day}")
    public List<FlightDeparture> getFlightsDepartbyDay(@PathVariable("day") FlightDays flightDays){
        return flightDepartureService.getFlightsDepartbyDay(flightDays);
    }
}
