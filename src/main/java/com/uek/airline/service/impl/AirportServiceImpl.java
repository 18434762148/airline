package com.uek.airline.service.impl;

import com.github.pagehelper.PageHelper;
import com.uek.airline.entity.Airport;
import com.uek.airline.mapper.AirportMapper;
import com.uek.airline.service.prototype.AirportService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
@Service
public class AirportServiceImpl implements AirportService {
    @Resource
    private AirportMapper airportMapper;
    @Override
    public void deleteAirport(String airportCode) {
        airportMapper.deleteAirport(airportCode);
    }

    @Override
    public List<Airport> listAirport(int pageNum , int pageSize) {
        PageHelper.startPage(1,2);
        List<Airport> airports = airportMapper.listAirport();
        return airports;
    }

    @Override
    public void saveAirport(Airport airport) {
        airportMapper.saveAirport(airport);
    }

    @Override
    public void updateAirport(Airport airport) {
        airportMapper.updateAirport(airport);
    }

    @Override
    public Airport getAirport(String airportCode) {
        return airportMapper.getAirport(airportCode);
    }
}
