package com.cybertek;

import com.cybertek.entity.Region;
import com.cybertek.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DerivedqueryApplication {

	@Autowired
	RegionRepository regionRepository;

	public static void main(String[] args) {
		SpringApplication.run(DerivedqueryApplication.class, args);
	}

	@PostConstruct
	public void testRegions(){

		System.out.println("---------Regions Start------------");

		System.out.println("findByCountry = " + regionRepository.findByCountry("Canada"));
		System.out.println("findDistinctByCountry = " + regionRepository.findDistinctByCountry("Canada"));
		System.out.println("findByCountryContaining = " + regionRepository.findByCountryContaining("United"));
		System.out.println("findByCountryContainingOrderByCountry = " + regionRepository.findByCountryContainingOrderByCountry("Asia"));
		System.out.println("findTop2ByCountry() = " + regionRepository.findTop2ByCountry("Canada"));


		System.out.println("---------Regions End------------");
	}


}
