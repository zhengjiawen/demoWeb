package com.example.demo.com.example.service;

import com.example.demo.com.example.model.DTUDevice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DTUDeviceRepo extends CrudRepository<DTUDevice, String> {



}
