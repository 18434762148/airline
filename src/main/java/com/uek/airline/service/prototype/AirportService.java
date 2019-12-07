package com.uek.airline.service.prototype;

import com.uek.airline.entity.Airport;

import java.util.List;

public interface AirportService {
    void deleteAirport(String airportCode);
    List<Airport> listAirport(int pageNum , int pageSize);
    void saveAirport(Airport airport);
    void updateAirport(Airport airport);
    Airport getAirport(String airportCode);
}
