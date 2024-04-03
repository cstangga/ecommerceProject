package data;

import java.time.LocalDate;
import java.util.UUID;

public class Customer {
    private long id;
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private LocalDate birth;
    private String tier;

    public Customer(long id, String name, int age, String phoneNumber, String address, LocalDate birth, String tier) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.birth = birth;
        this.tier = tier;
    }

    public long id() {
        return id;
    }

    public void setUuid(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }
}
