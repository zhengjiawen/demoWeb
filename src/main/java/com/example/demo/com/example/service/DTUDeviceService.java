package com.example.demo.com.example.service;

import com.example.demo.com.example.model.DTUDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//Device的业务处理放这里,目前只有简单的CRUD
@Service
public class DTUDeviceService {

    @Autowired
    private DTUDeviceRepo dtuDeviceRepo;

    public void addDevice(DTUDevice device)
    {
        dtuDeviceRepo.save(device);
    }

    public void updateDevice(DTUDevice device)
    {
        dtuDeviceRepo.save(device);
    }

    public void deleteDevice(DTUDevice device)
    {
        dtuDeviceRepo.delete(device);
    }

    public List<DTUDevice> findAllDevice()
    {
        List<DTUDevice> list = new ArrayList<>();
        Iterable<DTUDevice> iter = dtuDeviceRepo.findAll();
        iter.forEach(device -> {list.add(device);});
        return list;
    }

    public DTUDevice findByPort(String port)
    {
        DTUDevice device = dtuDeviceRepo.findById(port).get();
        return device;
    }

}
