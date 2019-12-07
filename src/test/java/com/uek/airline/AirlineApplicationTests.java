package com.uek.airline;

import com.uek.airline.entity.Airport;
import com.uek.airline.mapper.AirportMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class AirlineApplicationTests {
    @Resource
    private AirportMapper airportMapper;
    @Test
    void contextLoads() {
        List<Airport> airports = airportMapper.listAirport();
        for (Airport airport : airports) {
            System.out.println(airport);
        }
    }

}
