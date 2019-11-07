package com.haulmont.springjdbc;

import com.haulmont.springjdbc.dao.CountryDao;
import com.haulmont.springjdbc.model.Country;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringjdbcApplicationTests {

	@Autowired
	private CountryDao countryDao;

	@Test
	void contextLoads() {
		countryDao.loadCountries();
		List<Country> countries = countryDao.getCountryList();
		countries.forEach(country -> System.out.println(country));
	}
}
