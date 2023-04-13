package com.muharlyamov.pet_logistic.controller.filters;

import org.springframework.stereotype.Component;

import java.security.PublicKey;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

@Component
public class OrdersFilter {

    private String shipmentDateBegin;
    private String shipmentDateEnd;
    private String organizationViewPart;
    private String clientViewPart;
    private String carViewPart;

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

    public HashMap<String, Object> getFlledFilters(){
        HashMap<String, Object> result = new HashMap<>();

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
