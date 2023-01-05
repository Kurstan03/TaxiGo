package services;

import dao.Database;
import model.Driver;

import java.util.List;

public class DriverServicesImpl implements DriverServices {
     Database database = new Database();


    @Override
    public model.Driver add(model.Driver driver) {
        model.Driver dr = null;
        for (model.Driver d : database.getDrivers()) {
            if (!d.getId().equals(driver.getId())) {
                dr = driver;
                database.getDrivers().add(driver);
            } else {
                System.out.println("Driver c таким логином уже существует!");
            }
        }
        return dr;
    }

    @Override
    public List<model.Driver> add(List<model.Driver> drivers) {
        database.getDrivers().addAll(drivers);
        return database.getDrivers().stream().toList();
    }

    @Override
    public model.Driver findById(Long id) {
        return database.getDrivers().stream().filter(x->x.getId().equals(id)).findAny().get();
    }

    @Override
    public List<model.Driver> findByName(String name) {
        return database.getDrivers().stream().filter(x-> x.getName().equals(name)).toList();
    }

    @Override
    public String assignTaxiToDriver(String taxiName, Long driverId) {
//        model.Driver driver = null;
//        Taxi taxi = null;
//        for (model.Driver d : database.getDrivers()) {
//            if (driverId.equals(d.getId())){
//                driver = d;
//            }
//        }
//        database
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
