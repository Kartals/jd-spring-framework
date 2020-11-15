package com.cybertek.interfaces.carpetPrices;

import com.cybertek.enums.City;

import java.math.BigDecimal;

public interface Carpet {

    //double getSqtFtPrice(City city);

    BigDecimal getSqtFtPrice(City city);  // BigDecimal provides for auto rounding
}
