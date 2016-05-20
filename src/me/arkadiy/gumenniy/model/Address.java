package me.arkadiy.gumenniy.model;

/**
 * Created by Arkadiy on 19.05.2016.
 */
public class Address {
    private String index;
    private String city;
    private String street;
    private String house;
    private String flat;

    public Address(String index, String city,
                   String street, String house, String flat) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String fullAddress() {
        return String.format("%s, %s, %s, %s, %s", index, city, street, house, flat);
    }

    public String shortAddress() {
        return String.format("%s, %s, %s", street, house, flat);
    }
}
