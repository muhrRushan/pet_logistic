package com.muharlyamov.pet_logistic.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "organizations")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "view")
    @NotNull
    private String view;

    public Organization() {
    }

    public Organization(String view) {
        this.view = view;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return id == that.id && Objects.equals(view, that.view);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, view);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", view='" + view + '\'' +
                '}';
    }
}
