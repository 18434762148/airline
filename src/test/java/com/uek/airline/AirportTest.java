package com.uek.airline;

import com.uek.airline.entity.Airport;
import com.uek.airline.service.prototype.AirportService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class AirportTest {
    @Resource
    private AirportService airportService;
    @Test
    void test(){
        List<Airport> airports = airportService.listAirport(1, 2);
        for (Airport airport : airports) {
            System.out.println(airport);
        }
    }

}
