package com.example.demo.com.example.controller;


import com.example.demo.com.example.model.DTUDevice;
import com.example.demo.com.example.service.DTUDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/device")
public class DTUDDeviceController {
    @Autowired
    private DTUDeviceService dtuDeviceService;

    @GetMapping(path = "/add")
    public @ResponseBody String addNewDevice(@RequestBody DTUDevice device)
    {
        DTUDevice savedDevice = dtuDeviceService.addDevice(device);
        if( null == savedDevice)
        {
            return "saved failed";
        }
        return "saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody List<DTUDevice> getAllDevice()
    {
        return dtuDeviceService.findAllDevice();
    }

    @GetMapping(path = "/port")
    public @ResponseBody DTUDevice getByPort(@RequestParam String port)
    {
        return dtuDeviceService.findByPort(port);
    }


}
