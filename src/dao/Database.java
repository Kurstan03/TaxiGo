package dao;

import java.sql.Driver;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Database {
    private HashSet<Driver> drivers = new HashSet<>();

    public HashSet<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(HashSet<Driver> drivers) {
        this.drivers = drivers;
    }
}
