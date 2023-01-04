package com.kbbukopin.cif.referrence.cif.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.kbbukopin.cif.referrence.config.NotFoundException;
import com.kbbukopin.cif.referrence.dukcapil.model.Provincy;

@TestPropertySource("/application.yml")
@SpringBootTest
class ProvinsiServiceTest {
	@Autowired
	private ProvinsiService service;

	@Test
	void getByNameBukideskTestPositive() throws Exception {
		Provincy provinsi = service.getProvinsiByName("JAWA BARAT");
		assertNotNull(provinsi.getId());
		assertEquals("32", provinsi.getId());
	}
	
	@Test()
	void getByNameBukideskTestPositive2(){
		assertThrows(NotFoundException.class, () -> service.getProvinsiByName("JAWA WAKANDA"));
	}

}
