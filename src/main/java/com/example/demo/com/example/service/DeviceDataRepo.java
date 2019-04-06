package com.example.demo.com.example.service;

import com.example.demo.com.example.model.DeviceData;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceDataRepo extends CrudRepository<DeviceData, Integer> {

//采用jpa自动提供的方法，如果有需要，可以在这添加自己的查询方式
}
