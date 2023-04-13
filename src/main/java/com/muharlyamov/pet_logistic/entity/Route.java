package com.muharlyamov.pet_logistic.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "routes")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "view")
    @NotNull
    private String view;

    @Column(name = "number")
    @NotNull
    private String number;

    @Column(name = "date")
    @NotNull
    private LocalDateTime date;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @OneToOne
    @JoinColumn(name = "driver_id")
    private Driver drivers;

    @OneToMany
    @JoinColumn(name = "route_id")
    private List<Order> orders;

    public Route() {
    }

    public Route(String view, String number, LocalDateTime date, Car car, Driver drivers) {
        this.view = view;
        this.number = number;
        this.date = date;
        this.car = car;
        this.drivers = drivers;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Driver getDrivers() {
        return drivers;
    }

    public void setDrivers(Driver drivers) {
        this.drivers = drivers;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return id == route.id && Objects.equals(view, route.view) && Objects.equals(number, route.number) && Objects.equals(date, route.date) && Objects.equals(car, route.car) && Objects.equals(drivers, route.drivers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, view, number, date, car, drivers);
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", view='" + view + '\'' +
                ", number='" + number + '\'' +
                ", date=" + date +
                ", car=" + car +
                ", drivers=" + drivers +
                '}';
    }
}
