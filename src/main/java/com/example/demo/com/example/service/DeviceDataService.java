package com.example.demo.com.example.service;

import com.example.demo.com.example.model.DTUDevice;
import com.example.demo.com.example.model.DeviceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//关于DeviceData的业务处理可以放这里
@Service
public class DeviceDataService {

    @Autowired
    private DeviceDataRepo deviceDataRepo;

    @Autowired
    private DTUDeviceService dtuDeviceService;

    public DeviceData addData(DeviceData deviceData)
    {
        DTUDevice device = dtuDeviceService.findByPort(deviceData.getDevicePort());
        device.getDeviceDataSet().add(deviceData);
        deviceData.setDtuDevice(device);
        dtuDeviceService.updateDevice(device);
        return deviceDataRepo.save(deviceData);
    }

    public DeviceData updateData(DeviceData deviceData)
    {
        return addData(deviceData);
    }

    public void deleteData(DeviceData deviceData)
    {
        deviceDataRepo.delete(deviceData);
    }

    public List<DeviceData> findAllData()
    {
        List<DeviceData> list = new ArrayList<>();
        Iterable<DeviceData> iter = deviceDataRepo.findAll();
        iter.forEach(entity -> {list.add(entity);});

        return list;
    }

    public DeviceData findOneData(Integer id)
    {
        DeviceData data = deviceDataRepo.findById(id).get();

        return data;
    }


}
