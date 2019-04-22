package com.example.demo.com.example.model;

import javax.persistence.*;

@Entity
public class DeviceData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String dataName;
    private String dataType;
    private String address;
    private String HH;
    private String H;
    private String L;
    private String LL;
    private String saveFreq;
    private String comment;

    private String devicePort;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn
//    private DTUDevice dtuDevice;



//    public DTUDevice getDtuDevice() {
//        return dtuDevice;
//    }
//
//    public void setDtuDevice(DTUDevice dtuDevice) {
//        this.dtuDevice = dtuDevice;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHH() {
        return HH;
    }

    public void setHH(String HH) {
        this.HH = HH;
    }

    public String getH() {
        return H;
    }

    public void setH(String h) {
        H = h;
    }

    public String getL() {
        return L;
    }

    public void setL(String l) {
        L = l;
    }

    public String getLL() {
        return LL;
    }

    public void setLL(String LL) {
        this.LL = LL;
    }

    public String getSaveFreq() {
        return saveFreq;
    }

    public void setSaveFreq(String saveFreq) {
        this.saveFreq = saveFreq;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDevicePort() {
        return devicePort;
    }

    public void setDevicePort(String devicePort) {
        this.devicePort = devicePort;
    }

    @Override
    public String toString() {
        return "DeviceData{" +
                "id=" + id +
                ", dataName='" + dataName + '\'' +
                ", dataType='" + dataType + '\'' +
                ", address='" + address + '\'' +
                ", HH='" + HH + '\'' +
                ", H='" + H + '\'' +
                ", L='" + L + '\'' +
                ", LL='" + LL + '\'' +
                ", saveFreq='" + saveFreq + '\'' +
                ", comment='" + comment + '\'' +
                ", devicePort='" + devicePort + '\'' +
                '}';
    }
}
