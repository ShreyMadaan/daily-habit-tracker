package com.shrey.habittracker;

import java.time.LocalDate;

public class Habit {
    private int id;
    private String name;
    private String description;
    private LocalDate creationDate;
    private boolean isCompleted;

    public Habit(int id, String name, String description, LocalDate creationDate, boolean isCompleted) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.isCompleted = isCompleted;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
    @Override
    public String toString() {
        return "Habit [id=" + id + ", name=" + name + ", description=" + description + ", creationDate=" + creationDate
                + ", isCompleted=" + isCompleted + "]";
    }

}
