package com.muharlyamov.pet_logistic.controller.filters;

import org.springframework.stereotype.Component;

import java.time.chrono.ChronoLocalDateTime;
import java.util.HashMap;

@Component
public class OrdersFilter {

    private String shipmentDateBegin;
    private String shipmentDateEnd;
    private String organizationViewPart;
    private String clientViewPart;
    private String carViewPart;
    private String statusViewPart;

    public OrdersFilter() {
    }

    public String getShipmentDateBegin() {
        return shipmentDateBegin;
    }

    public void setShipmentDateBegin(String shipmentDateBegin) {
        this.shipmentDateBegin = shipmentDateBegin;
    }

    public String getShipmentDateEnd() {
        return shipmentDateEnd;
    }

    public void setShipmentDateEnd(String shipmentDateEnd) {
        this.shipmentDateEnd = shipmentDateEnd;
    }

    public String getOrganizationViewPart() {
        return organizationViewPart;
    }

    public void setOrganizationViewPart(String organizationViewPart) {
        this.organizationViewPart = organizationViewPart;
    }

    public String getClientViewPart() {
        return clientViewPart;
    }

    public void setClientViewPart(String clientViewPart) {
        this.clientViewPart = clientViewPart;
    }

    public String getCarViewPart() {
        return carViewPart;
    }

    public void setCarViewPart(String carViewPart) {
        this.carViewPart = carViewPart;
    }

    public String getStatusViewPart() {
        return statusViewPart;
    }

    public void setStatusViewPart(String statusViewPart) {
        this.statusViewPart = statusViewPart;
    }

    public HashMap<String, Object> getFlledFilters(){
        HashMap<String, Object> result = new HashMap<>();

        if (!this.getShipmentDateBegin().equals(null)) {result.put("shipmentDateBegin", this.getShipmentDateBegin());}
        if (!this.getShipmentDateEnd().equals(null)) {result.put("ShipmentDateBeginEnd", this.getShipmentDateEnd());}
        if (!this.getOrganizationViewPart().equals(null)) {result.put("organizationViewPart", this.getOrganizationViewPart());}
        if (!this.getClientViewPart().equals(null)) {result.put("clientViewPart", this.getClientViewPart());}
        if (!this.getCarViewPart().equals(null)) {result.put("carViewPart", this.getCarViewPart());}
        if (!this.getStatusViewPart().equals(null)) {result.put("statusViewPart", this.getStatusViewPart());}

        return result;
    }

    @Override
    public String toString() {
        return "OrdersFilter{" +
                "shipmentDateBegin=" + shipmentDateBegin +
                ", shipmentDateEnd=" + shipmentDateEnd +
                ", organizationViewPart='" + organizationViewPart + '\'' +
                ", clientViewPart='" + clientViewPart + '\'' +
                ", carViewPart='" + carViewPart + '\'' +
                '}';
    }
}
