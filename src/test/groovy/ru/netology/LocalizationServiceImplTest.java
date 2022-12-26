package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {
    String expectedText;
    @Test
    void localeRu(){
        var localizationService=new LocalizationServiceImpl();
        expectedText="Добро пожаловать";
        Assertions.assertEquals(expectedText,localizationService.locale(Country.RUSSIA));

    }
    @Test
    void localeEng(){
        var localizationService=new LocalizationServiceImpl();
        expectedText="Welcome";
        Assertions.assertEquals(expectedText,localizationService.locale(Country.USA));

    }
}
