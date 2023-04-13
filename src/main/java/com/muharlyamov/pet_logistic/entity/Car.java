package com.muharlyamov.pet_logistic.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "view")
    @NotNull
    private String view;

    @Column(name = "reg_number")
    @NotNull
    private String regNumber;

    public Car() {
    }

    public Car(String view, String regNumber) {
        this.view = view;
        this.regNumber = regNumber;
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

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(view, car.view) && Objects.equals(regNumber, car.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, view, regNumber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", view='" + view + '\'' +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }
}
