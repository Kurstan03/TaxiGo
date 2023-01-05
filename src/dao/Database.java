package dao;

import model.Client;
import model.Driver;
import model.Taxi;

import java.util.*;

public class Database {
    private HashSet<model.Driver> drivers = new HashSet<>();
    private HashSet<Taxi> taxis = new HashSet<>();
    private HashSet<Client> clients;

    public HashSet<Client> getClients() {
        return clients;
    }

    public void setClients(HashSet<Client> clients) {
        this.clients = clients;
    }

    public HashSet<Taxi> getTaxis() {
        return taxis;
    }

    public void setTaxis(HashSet<Taxi> taxis) {
        this.taxis = taxis;
    }

    public HashSet<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(HashSet<Driver> drivers) {
        this.drivers = drivers;
    }
}
