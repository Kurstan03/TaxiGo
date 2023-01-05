package services;

import model.Driver;

import java.util.List;

public interface DriverService {
    model.Driver add(model.Driver driver);

    List<model.Driver> add(List<model.Driver> drivers);

    model.Driver findById(Long id);

    List<model.Driver> findByName(String name);

    String assignTaxiToDriver(String taxiName, Long driverId);

    String changeTaxiOrDriver(Long driverId, Long taxiId);

    List<Driver> getDriverByTaxiModel(String model);

    void update(String driverName);
}
