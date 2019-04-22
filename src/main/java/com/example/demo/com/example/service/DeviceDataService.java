package com.example.demo.com.example.service;

import com.example.demo.com.example.model.DTUDevice;
import com.example.demo.com.example.model.DeviceData;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.nio.cs.FastCharsetProvider;

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
        if(null == device)
        {
            throw new RuntimeException("device port is not exist!");
        }
        DeviceData savedData =  deviceDataRepo.save(deviceData);
        if(null == savedData)
        {
            throw new RuntimeException("device data saved failed.");
        }
//        device.getDeviceDataSet().add(deviceData);
//        deviceData.setDtuDevice(device);
        //cascade，所以只要更新一的那端
//        DTUDevice savedDtud = dtuDeviceService.updateDevice(device);
//        boolean saveFlag = false;
//
//        for(DeviceData d : savedDtud.getDeviceDataSet())
//        {
//            if(deviceData.getId().equals(d.getId()))
//            {
//                saveFlag=true;
//            }
//        }
//
//        if(!saveFlag)
//        {
//            throw new RuntimeException("device data saved failed");
//        }

        return savedData;
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

    public String verfyData(DeviceData deviceData)
    {
        DeviceData result = addData(deviceData);

        if( Double.parseDouble(result.getHH() )> 0.8 || Double.parseDouble(result.getH())>0.8||Double.parseDouble(result.getL())>0.8 || Double.parseDouble(result.getLL())>0.8)
        {
            return "Warning the value of HH/H/L/LL is higher";
        }
        return result.toString();
    }


}
