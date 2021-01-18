package com.cybertek;

import com.cybertek.entity.Region;
import com.cybertek.repository.DepartmentRepository;
import com.cybertek.repository.EmployeeRepository;
import com.cybertek.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DerivedqueryApplication {

	@Autowired
	RegionRepository regionRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	EmployeeRepository employeeRepository;

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

	@PostConstruct
	public void testDepartments(){
		System.out.println("---------Department Start------------");
		System.out.println("findByDepartment = " + departmentRepository.findByDepartment("Furniture"));
		System.out.println("findByDivision= " + departmentRepository.findByDivision("Health"));
		System.out.println("findByDivisionEndingWith= " + departmentRepository.findByDivisionEndingWith("ics"));
		System.out.println("findDistinctTop3ByDivisionContaining= " + departmentRepository.findDistinctTop3ByDivisionContaining("Hea"));
		System.out.println("---------Department End------------");
	}

	@PostConstruct
	public void testEmployees(){
		System.out.println("---------Employee Start------------");
		System.out.println("findByEmailIsNotNull = " + employeeRepository.findByEmailIsNotNull());
		System.out.println("findByFirstnameIsNot Berries = " + employeeRepository.findByFirstnameIsNot("Berries"));
		System.out.println("findByLastnameStartsWith Be = " + employeeRepository.findByLastnameStartsWith("Be"));
		System.out.println("findBySalaryGreaterThan 80000 = " + employeeRepository.findBySalaryGreaterThan(80000));
		System.out.println("findBySalaryGreaterThanEqualOrderBySalaryDesc 90000 = " + employeeRepository.findBySalaryGreaterThanEqualOrderBySalaryDesc(90000));
		System.out.println("findBySalaryLessThanEqual 75000 = " + employeeRepository.findBySalaryLessThanEqual(75000));
		System.out.println("findDistinctTop3BySalaryLessThan 95000 = " + employeeRepository.findDistinctTop3BySalaryLessThan(95000));
		System.out.println("findByEmailIsNull() = " + employeeRepository.findByEmailIsNull());
		System.out.println("---------Employee End------------");
	}

}
