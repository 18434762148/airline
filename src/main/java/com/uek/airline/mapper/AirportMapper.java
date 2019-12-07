package com.uek.airline.mapper;

import com.uek.airline.entity.Airport;

import java.util.List;

public interface AirportMapper {
    void deleteAirport(String airportCode);
    List<Airport> listAirport();
    void saveAirport(AirportMapper airport);
//    void updateAirport(String airportCode,String city,String airportName);
    AirportMapper getAirport(String airportCode);
}
