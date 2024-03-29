package com.uek.airline.mapper;

import com.uek.airline.entity.Airport;

import java.util.List;

public interface AirportMapper {
    void deleteAirport(String airportCode);
    List<Airport> listAirport();
    void saveAirport(Airport airport);
    void updateAirport(Airport airport);
    Airport getAirport(String airportCode);
}
