package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.College;
import com.example.demo.Service.CollegeService;
 

@RestController
@RequestMapping("www.ies.com")

public class CollegeController {
	
	@Autowired
	private CollegeService clgService;
	
	@PostMapping("/clgData")
	public College getCollegeInfo(@RequestBody  College College) {
		return clgService.createNewData(College);
		
		
	}
	
	@GetMapping("/data")
	public List<College> getAllCollegeData(College college){
		return clgService.findAllData(college);
		
	}
	
	@GetMapping("/name/{collegeName}")
	public College getCollegeDataByName(@PathVariable String  collegeName ) {
		return clgService.findCollegeName(collegeName);
		
	}
	
	@GetMapping("/collegeYear/{collegeEstablishmentYear}")
	public List<College> getCollegeDataByEstablishmentYear(@PathVariable Integer collegeEstablishmentYear){
		return clgService.findCollegeByEstablishmentYear(collegeEstablishmentYear);
	
		
	}
	
//	@GetMapping("/department/{collegeDepartment}")
//	public List<College> getCollegeDataByDepartmentName(@PathVariable String  collegeDepartment){
//		return clgService.findCollegeByDeptName(collegeDepartment);
//		
//	}
	
	@GetMapping("/location/{collegeLocation}")
	public List<College> getCollegeDataByLocation(@PathVariable String  collegeLocation){
		return clgService.findCollegeByLocation(collegeLocation);
		
	}
	
	@PutMapping("/update/{collegeName}")
	public College updateAllData(@RequestBody College college,@PathVariable String  collegeName) {
		return clgService.updateNew(college,collegeName);
		
	}
	//updating data by using RequestParam
	@PutMapping("/updating")
	public College updateAllDataByusingRequestParam(@RequestBody College college, @RequestParam String collegeName) {
		return clgService.updateNewData(college, collegeName);
	}
	
	//finding fees by department with pathvariable.
	@GetMapping("/findDept/{collegeDepartment}")
	public Double getDataByDept(@PathVariable String  collegeDepartment) {
		return clgService.findCollegeByDeptName(collegeDepartment);
	}
	
	//finding College name by location with pathvariable.
	@GetMapping("/findLocation/{collegeLocation}")
	public String getNameByLocation(@PathVariable String  collegeLocation) {
		return clgService.findNameByLocation(collegeLocation);
	}
	//finding fees by department with RequestParam .
	@GetMapping("/findDep")
	public Double getFeesbyDept(@RequestParam String  collegeDepartment) {
		return clgService.findFeesByDept(collegeDepartment);
	}
	
	//finding college name  by location with RequestParam .
		@GetMapping("/findLoc")
		public String getCollegeNamebyLoc(@RequestParam String  collegeLocation) {
			return clgService.findClgNameByLocation(collegeLocation);
		}
		
	 // finding college name by establishment year with RequestParam .
		@GetMapping("/findbyEstablishmentYear")
		public List<String>  getCollegeNameByEstablishmentYear(@RequestParam Integer collegeEstablishmentYear) {
			return clgService.findClgNameByEstablishmentYear(collegeEstablishmentYear);
		}
		
		//find all data by passing two value.
		@GetMapping("/findData")
		public List<College> getAllData(@RequestParam String  collegeName, @RequestParam String  collegeLocation){
			return clgService.findDataByNameAndLocation(collegeName,collegeLocation);
			
		}
	

}
