package com.muharlyamov.pet_logistic.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "view")
    @NotNull
    private String view;

    @Column(name = "shipment_adress")
    @NotNull
    private String shipment_adress;

    @Column(name = "coordinate")
    private String coordinate;

    public Client() {
    }

    public Client(String view, String shipment_adress, String coordinate) {
        this.view = view;
        this.shipment_adress = shipment_adress;
        this.coordinate = coordinate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getShipment_adress() {
        return shipment_adress;
    }

    public void setShipment_adress(String shipment_adress) {
        this.shipment_adress = shipment_adress;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && Objects.equals(view, client.view) && Objects.equals(shipment_adress, client.shipment_adress) && Objects.equals(coordinate, client.coordinate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, view, shipment_adress, coordinate);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", view='" + view + '\'' +
                ", shipment_adress='" + shipment_adress + '\'' +
                ", coordinate='" + coordinate + '\'' +
                '}';
    }
}
