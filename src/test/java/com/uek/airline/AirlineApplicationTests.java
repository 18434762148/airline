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
    @Test
    void saveAirport(){
        airportMapper.saveAirport(Airport.builder().airportCode("YZY").airportName("原泽杨").city("晋城").build());
    }
    @Test
    void getAirport(){
        Airport yzy = airportMapper.getAirport("YZY");
        System.out.println(yzy);
    }
    @Test
    void updateAirport(){
        airportMapper.updateAirport(Airport.builder().airportName("晋城机场").airportCode("YZY").city("晋城").build());
    }
    @Test
    void deleteAirport(){
        airportMapper.deleteAirport("YZY");
    }
}
