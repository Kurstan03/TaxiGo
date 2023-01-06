import enums.Gender;
import model.Driver;
import model.License;
import services.servicesImpl.DriverServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver(
                1L, "Tony", "Stark", Gender.MALE, "0222335566",
                new License(1L, LocalDate.of(2019, 2, 14),LocalDate.of(2024, 2, 14)),
                new BigDecimal(33000)
        );
        Driver driver1 = new Driver(
                2L, "Tom", "Holland", Gender.MALE, "0777335566",
                new License(2L, LocalDate.of(2021, 11, 30),LocalDate.of(2026, 11, 30)),
                new BigDecimal(12900)
        );
        HashSet<Driver> drivers = new HashSet<>();
        drivers.add(new Driver(3L, "Levis", "Capaldi", Gender.MALE, "0990117733",
                new License(3L, LocalDate.of(2017, 12, 12), LocalDate.of(2027, 12, 12)),
                new BigDecimal(4))
        );drivers.add(new Driver(4L, "Katy", "Perry", Gender.FEMALE, "0333997744",
                new License(4L, LocalDate.of(2023, 2, 6), LocalDate.of(2033, 1, 6)),
                new BigDecimal(50500))
        );
        DriverServiceImpl service = new DriverServiceImpl();
        System.out.println(service.add(driver));
        System.out.println(service.add(driver1));
        System.out.println(service.add(drivers.stream().toList()));
        System.out.println(service.findById(3L));
        service.findByName("Tony").forEach(System.out::println);
        System.out.println(service.assignTaxiToDriver("taxi name", 1L));
//        System.out.println(service.changeTaxiOrDriver(4L, 2L));
//        service.getDriverByTaxiModel("AMG w223").forEach(System.out::println);
        service.update("Tom");
    }
}