package com.kbbukopin.cif.referrence.cif.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.kbbukopin.cif.referrence.cif.model.Wilayah;

@TestPropertySource("/application.yml")
@SpringBootTest
class WilayahServiceTest {
	@Autowired
	private WilayahService service;

	@Test
	void findByProvCodePositiveTest() throws Exception {
		List<Wilayah> findByProvCode = service.findByProvCode("005");
		assertNotNull(findByProvCode);
		assertNotEquals(0, findByProvCode.size());
	}

}
