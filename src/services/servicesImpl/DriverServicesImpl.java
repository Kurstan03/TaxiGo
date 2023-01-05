package services.servicesImpl;

import dao.Database;
import services.DriverServices;

import java.sql.Driver;
import java.util.List;

public class DriverServicesImpl implements DriverServices {
    private Database database;

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    @Override
    public Driver add(Driver driver) {
        return null;
    }

    @Override
    public List<Driver> add(List<Driver> drivers) {
        return null;
    }

    @Override
    public Driver findById(Long id) {
        return null;
    }

    @Override
    public List<Driver> findByName(String name) {
        return null;
    }

    @Override
    public String assignTaxiToDriver(String taxiName, Long driverId) {
        return null;
    }

    @Override
    public String changeTaxiOrDriver(Long driverId, Long taxiId) {
        return null;
    }

    @Override
    public List<Driver> getDriverByTaxiModel(String model) {
        return null;
    }

    @Override
    public void update(String driverName) {

    }
}
