package com.example.addressbook_ws.model;

public class Contact {
    private String name;
    private int id;
    private String address;
    private String city;
    private String state;
    private String phoneno;
    private int zip;

    /**
     * creating Constructer Contact
     *
     * @param name
     * @param id
     * @param address
     * @param city
     * @param state
     * @param phoneno
     * @param zip
     */
    public Contact(String name, int id, String address, String city, String state, String phoneno, int zip) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phoneno = phoneno;
        this.zip = zip;
    }

    /**
     * implementing Getter and Setter methods
     *
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public int getZip() {
        return this.zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phoneno='" + phoneno + '\'' +
                ", zip=" + zip +
                '}';
    }

}
