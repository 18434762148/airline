package com.uek.airline.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.uek.airline.entity.Airport;
import com.uek.airline.service.prototype.AirportService;
import com.uek.airline.util.JsonResult;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AirportController {
    @Resource
    private AirportService airportService;
    @ApiOperation(value = "机场页面" , notes = "机场页面")
    @GetMapping("/airport")
    public void airport(){

    }
    @ApiOperation(value = "查询机场" , notes = "该接口可以查询所有的机场")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", required = true, value = "第几页", dataType = "int",paramType ="path"),
            @ApiImplicitParam(name = "pageSize", required = true, value = "页大小", dataType = "int",paramType = "path")
    })
    @GetMapping(value = "/listAirport",produces = "application/json; charset=utf-8")
    public ResponseEntity AirportList(int pageNum , int pageSize){
        JsonResult js = new JsonResult();
        List<Airport> airports = airportService.listAirport(pageNum, pageSize);
        js.setCode(200);
        js.setMsg("success");
        js.setData(airports);
        return ResponseEntity.ok(js);
    }
    @ApiOperation(value = "删除机场" , notes = "该接口可以删除某个机场")
    @DeleteMapping(value = "/deleteAirport")
    public ResponseEntity airportDelete(String airportCode){
        JsonResult js = new JsonResult();
        airportService.deleteAirport(airportCode);
        js.setCode(200);
        js.setMsg("success");
        return ResponseEntity.ok(js);
    }
}
