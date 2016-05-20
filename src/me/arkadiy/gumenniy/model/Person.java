package me.arkadiy.gumenniy.model;

/**
 * Created by Arkadiy on 20.05.2016.
 */
public class Person {
    private String surname;
    private String name;
    private String patronymic;
    private Address address;

    public Person(String surname, String name, String patronymic, Address address) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
