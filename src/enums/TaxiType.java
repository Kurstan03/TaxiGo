package enums;

import java.math.BigDecimal;

public enum TaxiType {
    STANDART(new BigDecimal(5.99), new BigDecimal(15)),
    COMFORT(new BigDecimal(10.99), new BigDecimal(21)),
    BUSINESS(new BigDecimal(20.97), new BigDecimal(29));
    private BigDecimal pricePerKm;
    private BigDecimal priceForLanding;

    TaxiType(BigDecimal pricePerKm, BigDecimal priceForLanding) {
        this.pricePerKm = pricePerKm;
        this.priceForLanding = priceForLanding;
    }

    public BigDecimal getPricePerKm() {
        return pricePerKm;
    }

    public void setPricePerKm(BigDecimal pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    public BigDecimal getPriceForLanding() {
        return priceForLanding;
    }

    public void setPriceForLanding(BigDecimal priceForLanding) {
        this.priceForLanding = priceForLanding;
    }

}
