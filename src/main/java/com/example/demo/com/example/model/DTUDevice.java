package com.example.demo.com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class DTUDevice {
    @Id
    private String port;
    private double longtitude;
    private double latitude;
    private String address;
    private String operationPhone;
    private String operationName;
    private String devicePhone;
    private Date devicePhoneData;
    private String manger;
    private String mangerPort;
    private String operationPort;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dtuDevice")
    private Set<DeviceData> deviceDataSet = new HashSet<>();

    public Set<DeviceData> getDeviceDataSet() {
        return deviceDataSet;
    }

    public void setDeviceDataSet(Set<DeviceData> deviceDataSet) {
        this.deviceDataSet = deviceDataSet;
    }

    public String getOperationPort() {
        return operationPort;
    }

    public void setOperationPort(String operationPort) {
        this.operationPort = operationPort;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOperationPhone() {
        return operationPhone;
    }

    public void setOperationPhone(String operationPhone) {
        this.operationPhone = operationPhone;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getDevicePhone() {
        return devicePhone;
    }

    public void setDevicePhone(String devicePhone) {
        this.devicePhone = devicePhone;
    }

    public Date getDevicePhoneData() {
        return devicePhoneData;
    }

    public void setDevicePhoneData(Date devicePhoneData) {
        this.devicePhoneData = devicePhoneData;
    }

    public String getManger() {
        return manger;
    }

    public void setManger(String manger) {
        this.manger = manger;
    }

    public String getMangerPort() {
        return mangerPort;
    }

    public void setMangerPort(String mangerPort) {
        this.mangerPort = mangerPort;
    }


}
