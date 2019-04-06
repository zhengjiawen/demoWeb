package com.example.demo.com.example.controller;

import com.example.demo.com.example.model.DeviceData;
import com.example.demo.com.example.service.DeviceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/data")
public class DeviceDataController {

    @Autowired
    private DeviceDataService deviceDataService;

    @GetMapping(path = "/add")
    public @ResponseBody DeviceData addNewData(@RequestBody DeviceData deviceData)
    {
        DeviceData newData = deviceDataService.addData(deviceData);
        return newData;
    }

    @GetMapping(path = "/all")
    public @ResponseBody List<DeviceData> getAllData()
    {
        return deviceDataService.findAllData();
    }

    @GetMapping(path = "/id")
    public @ResponseBody DeviceData getDataById(@RequestParam int id)
    {
        return deviceDataService.findOneData(id);
    }





}
