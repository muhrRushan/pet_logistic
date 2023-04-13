package com.muharlyamov.pet_logistic.entity;

import com.muharlyamov.pet_logistic.entity.enums.OrderStatus;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "status")
    @NotNull
    private String status;

    @Column(name = "number")
    @NotNull
    private String number;

    @Column(name = "date")
    @NotNull
    private LocalDateTime date;

    @Column(name = "shipment_date")
    @NotNull
    private LocalDateTime shipment_date;

    @OneToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @OneToOne
    @JoinColumn(name = "organization_id")
    @NotNull
    private Organization organization;

    @OneToOne
    @JoinColumn(name = "client_id")
    @NotNull
    private Client client;

    public Order() {
    }

    public Order(String status, String number, LocalDateTime date, LocalDateTime shipment_date, Route route, Organization organization, Client client) {
        this.status = status;
        this.number = number;
        this.date = date;
        this.shipment_date = shipment_date;
        this.route = route;
        this.organization = organization;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getShipment_date() {
        return shipment_date;
    }

    public String shipment_date_formatted() {
        return shipment_date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm"));
    }

    public String date_formatted() {
        return date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm"));
    }

    public void setShipment_date(LocalDateTime shipment_date) {
        this.shipment_date = shipment_date;
    }

    public boolean isStatusEqual(String status) {
        return OrderStatus.getStatusByRussianView(this.status).toString().equals(status);
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(status, order.status) && Objects.equals(number, order.number) && Objects.equals(date, order.date) && Objects.equals(shipment_date, order.shipment_date) && Objects.equals(route, order.route) && Objects.equals(organization, order.organization) && Objects.equals(client, order.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, number, date, shipment_date, route, organization, client);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", number='" + number + '\'' +
                ", date=" + date +
                ", shipment_date=" + shipment_date +
                ", route=" + route +
                ", organization=" + organization +
                ", client=" + client +
                '}';
    }
}
