package me.arkadiy.gumenniy.model;

/**
 * class which represents personal data
 */
public class Person {
    /**
     * person's surname
     */
    private String surname;
    /**
     * person's name
     */
    private String name;
    /**
     * person's patronymic
     */
    private String patronymic;
    /**
     * person's address
     */
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
