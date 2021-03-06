package com.cybertek.services.carpet;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


@Component
public class CarpetTX implements Carpet {


    private static final Map<City,BigDecimal> sqPriceForCity=new HashMap<>();

    static {
        sqPriceForCity.put(City.AUSTIN,new BigDecimal("1.32"));
        sqPriceForCity.put(City.DULLES,new BigDecimal("1.75"));
        sqPriceForCity.put(City.SAN_ANTONIO,new BigDecimal("2.20"));
    }

    @Override
    public BigDecimal getSqtFtPrice(City city) {

        BigDecimal defaultValue=BigDecimal.ZERO;

        // Map olduğundan streamı alamadık, o yüzden entrySet() methodunu kullandık
        // entrySet() converting this map to set objects but inside this set, it is keeping everything as a map
        Optional<Map.Entry<City,BigDecimal>> collect= sqPriceForCity.entrySet().stream().filter(x->x.getKey()==city).findFirst();
        // yukardaki code satırı şu anlama gelmekte, bir City ismi (MCLEAN) verdiğimde, o city'nin value'sunu (4.32) vermekte.

        return collect.isPresent()? collect.get().getValue():defaultValue;
        // burada yaptığımız eğer value varsa value ver, eğer value yoksa Zero ver. Örneğin Londra yazdık, value olmadığından Zero alacağız
        //Amacımız random bir şehir verdiğimizde sistemin crash olmaması için default value almak
    }
}
