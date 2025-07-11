package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryService.class);

    public Country getCountry(String code) {

        LOGGER.debug("Inside CountryService");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("countrylist.xml");

        List<Country> countryList = context.getBean("countryList", List.class);

        Country result = countryList.stream()
                                    .filter(c -> c.getCode().equalsIgnoreCase(code))
                                    .findFirst()
                                    .orElse(null);

        context.close();
        LOGGER.debug("Exiting CountryService");
        return result;

    }
}
