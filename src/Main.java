import enums.Gender;
import model.Driver;
import model.License;

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

    }
}