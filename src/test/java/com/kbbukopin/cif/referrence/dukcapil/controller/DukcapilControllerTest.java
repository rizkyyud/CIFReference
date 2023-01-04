package com.kbbukopin.cif.referrence.dukcapil.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@AutoConfigureMockMvc
@SpringBootTest
class DukcapilControllerTest {
	@Autowired
	private MockMvc mvc;

	// TEST PROVINCY

	@Test
	void getAllProvinceTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/dukcapil/provincy/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getSinglePositive() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/dukcapil/provincy/32").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$.name").value("JAWA BARAT"))
				.andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getProvincyRegencyTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/dukcapil/provincy/32/regency").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getProvinsiByProvIdTest() throws Exception {
		mvc.perform(
				MockMvcRequestBuilders.get("/dukcapil/provincy/JAWA BARAT/bukidesk").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	// TEST REGENCY

	@Test
	void getSingleRegencyTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/dukcapil/regency/3209").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getRegencyProvincyPositive() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/dukcapil/regency/3209/provincy").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$.name").value("JAWA BARAT"))
				.andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getRegencyDistcitTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/dukcapil/regency/3209/district").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	// TEST DISTRICT
	@Test
	void getSingleDistrictTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/dukcapil/district/320928").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getDistrictRegencyPositive() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/dukcapil/district/320928/regency").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$.name").value("KAB CIREBON"))
				.andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getDistrictVillageTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/dukcapil/district/320928/village").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	// TEST VILLAGE
	@Test
	void getSingleVillageTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/dukcapil/village/3209282011").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getSingleVillageRegencyTest() throws Exception {
		mvc.perform(
				MockMvcRequestBuilders.get("/dukcapil/village/3209282011/district").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}
}
