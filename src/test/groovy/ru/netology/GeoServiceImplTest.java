package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {
    @Test
    void byIpRu() {
        var geoService = new GeoServiceImpl();
        var expectedLocation = new Location("", Country.RUSSIA, "", 0);
        var expectedCountry = expectedLocation.getCountry();
        var resultTestCountry = geoService.byIp(GeoServiceImpl.MOSCOW_IP).getCountry();
        Assertions.assertEquals(expectedCountry, resultTestCountry);
    }

}
