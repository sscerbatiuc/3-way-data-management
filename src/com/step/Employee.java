package com.step;

public class Employee {
    private Integer id;
    private String name;
    private String surname;
    private String address;
    private String phoneno;

    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Employee(Integer id, String name, String address) {
        this(name, address);
        this.id = id;
    }

    public String getPhoneno() { return phoneno; }

    public String getSurname() {
        return surname;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
