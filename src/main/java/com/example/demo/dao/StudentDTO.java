package com.example.demo.dao;

public class StudentDTO {
    private int id;
    private int year;
    private double avg;
    private String firstName ;
    private String lastName;

    public StudentDTO(int id, int year, double avg, String firstName, String lastName) {
        this.id = id;
        this.year = year;
        this.avg = avg;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public StudentDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", year=" + year +
                ", avg=" + avg +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
