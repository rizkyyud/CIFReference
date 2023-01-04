package com.kbbukopin.cif.referrence.cif.controller;

import static org.hamcrest.CoreMatchers.is;
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

class CIFControllerTest {
	@Autowired
	private MockMvc mvc;

	@Test
	void getAllRelationshipTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/relationship/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllAssetClassTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/asset-class/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllAssetTypeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/asset-type/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllBahasaTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/bahasa/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllBuriskTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/burisk/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllBusinessTypeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/business-type/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllCitizinCodeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/citizen-code/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllContactNoCcTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/contact-no-cc/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllCountryTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/country/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllCustomerTypeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/customer-type/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllEmployerTypeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/employer-type/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllEntitasTypeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/entitas-type/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllEntitiTypeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/entiti/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllFamiliarBKPTypeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/familiar-bkp/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllGenderTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/gender/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllHighEducationTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/high-education/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllHobbyTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/hobby/").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllHousingTypeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/housing-type/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllIdentityTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/identity/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllIdTypeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/id-type/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllInformationCCTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/information-cc/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllJenisIzinTinggalTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/jenis-izin-tinggal/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllLogTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/log/").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllManagementTypeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/management-type/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllMaritalStatusTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/marital-status/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllMonthlyExpendTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/monthly-expend/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllNationalityTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/nationality/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllOccTypeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/occ-type/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllOccasionCCTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/occasion-cc/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllOccupationTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/occupation/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllOpenRekTypeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/open-rek-type/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllOptionindisiaTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/option_indisia/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllOrganizationTypeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/organization-type/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllOwnershipTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/ownership/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllOwnershipTypeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/ownership-type/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllOwnerTypeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/owner-type/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllPenggunaanDataTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/penggunaan-data/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}

	@Test
	void getAllPersonalFundSourceTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/personal-fund-source/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllPersonalOtherSourceTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/personal-other-source/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllPersonalRangeIncomeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/personal-range-income/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllPersonalTransDestTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/personal-trans-dest/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllPjkFederalTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/pjk-federal/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllPositionTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/position/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllPositionRiskTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/position-risk/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllProvincesTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/provinces/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllProvinsiTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/provinsi/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllPurposeOpeningAccountTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/purpose-opening-account/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllRaceTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/race/").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllRange50jt100mTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/range-50jt-100m/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllRangeSalaryMonthTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/range-salary-month/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllReasonCreateAccountTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/reason-create-account/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllReligionTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/religion/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllResidentTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/resident/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllResikoNasabahTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/resiko-nasabah/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllSourceFundPdtbuTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/source-fund-pdtbu/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllSourceOfFundsTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/source-Of-funds/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllTitleTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/title/").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$").isNotEmpty());
	}

	@Test
	void getAllYesornoTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/yesorno/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	// PROVINSI TEST
	@Test
	void getDukcapilProvByProvNameBukideskPositive() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/provinsi/JAWA BARAT/dukcapil/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty())
				.andExpect(jsonPath("$.name", is("JAWA BARAT")));
	}

	@Test
	void getDukcapilProvByProvNameBukideskNegative() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/provinsi/JAWA WAKANDA/dukcapil/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isNotFound()).andExpect(jsonPath("$").isNotEmpty());
	}

	// wilayah
	@Test
	void getWilayahByProvCodeTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/wilayah/provCode/005/").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	// address-mst-*

	/**
	 * was tested don't try it make your RAM cry :))
	 * 
	 * @throws Exception
	 */
//	@Test
//	void getAddressMasterDistrictPositiveTest() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.get("/address-mst-district/").accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
//	}
//	
	void getAddressMasterDistrictByRegencyCodePositiveTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/address-mst-district/findByRegencyCode/640101")
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}

	/**
	 * was tested. don't try to test again it make your RAM cry :))
	 * 
	 * @throws Exception
	 */
//	@Test
//	void getAddressMasterRegencyPositiveTest() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.get("/address-mst-regency/").accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
//	}

	/**
	 * was tested don't try it make your RAM cry :))
	 * 
	 * @throws Exception
	 */
//	@Test
//	void getAddressMasterVillagePositiveTest() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.get("/address-mst-village/").accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
//	}
	@Test
	void getAddressMasterVillageFindByDistrictCodePositiveTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/address-mst-village/findByDistrictCode/64010101")
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}
	
	//find by classtype
	@Test
	void getAssetClassfindByClassTypePositiveTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/asset-class/findByClassType/1")
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andExpect(jsonPath("$").isNotEmpty());
	}
	

}
