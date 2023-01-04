package com.kbbukopin.cif.referrence.dukcapil.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.kbbukopin.cif.referrence.cif.model.Provinsi;
import com.kbbukopin.cif.referrence.dukcapil.model.Provincy;
import com.kbbukopin.cif.referrence.dukcapil.model.Regency;

@TestPropertySource("/application.yml")
@SpringBootTest
class ProvincyServiceTest {
	@Autowired
	private ProvincyService service;
	
	@Test
	void getAllDataTestPositive() {
		List<Provincy> all = service.getAll();
		assertNotEquals(0, all.size());
	}
	
	@Test
	void getItemDataAndNotNull() {
		List<Provincy> all = service.getAll();
		Provincy provincy = all.get(0);
		assertNotNull(provincy);
		assertNotNull(provincy.getName());
	}
	
	@Test
	void getSingleData() throws Exception {
		Provincy findById = service.findById("31");
		assertNotNull(findById);
	}
	
	@Transactional
	@Test
	void getRegencyTest() throws Exception {
		Set<Regency> allRegency = service.getAllRegency("31");
		assertNotEquals(0, allRegency.size());
	}
	
	@Test
	void getByNameBukideskTestPositive() throws Exception {
		Provinsi provinsi = service.getProvinsiByProvId("JAWA BARAT");
		assertNotNull(provinsi.getProvCode());
		assertEquals("003", provinsi.getProvCode());
	}
	
	@Test
	void getByNameBukideskTestPositive2() throws Exception {
		Provinsi provinsi = service.getProvinsiByProvId("JAWA BARAT AAA");
		assertNotNull(provinsi.getProvCode());
		assertEquals("999", provinsi.getProvCode());
	}

}
