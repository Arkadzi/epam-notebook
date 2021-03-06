package me.arkadiy.gumenniy.model;

/**
 * Class for storing address
 */
public class Address {
    /**
     * city index
     */
    private String index;
    /**
     * city
     */
    private String city;
    /**
     * street
     */
    private String street;
    /**
     * house number on street
     */
    private String house;
    /**
     * number of flat in house
     */
    private String flat;

    public Address(String index, String city,
                   String street, String house, String flat) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    /**
     * constructs full address string
     *
     * @return full address
     */
    public String getFullAddress() {
        return String.format("%s, %s, %s, %s, %s", index, city, street, house, flat);
    }

    /**
     * constructs short address string
     *
     * @return short address
     */
    public String getShortAddress() {
        return String.format("%s, %s, %s", street, house, flat);
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
}
