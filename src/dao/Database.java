package dao;

import model.Driver;

import java.util.*;

public class Database {
    private HashSet<model.Driver> drivers = new HashSet<>();

    public HashSet<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(HashSet<Driver> drivers) {
        this.drivers = drivers;
    }
}
