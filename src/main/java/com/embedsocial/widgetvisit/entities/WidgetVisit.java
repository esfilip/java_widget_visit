package com.embedsocial.widgetvisit.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class WidgetVisit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer ownerId;

    private LocalDate createdOn;

    public WidgetVisit() {
    }

    public WidgetVisit(Integer ownerId, LocalDate createdOn) {
        this.ownerId = ownerId;
        this.createdOn = createdOn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", ownerId='" + ownerId + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}