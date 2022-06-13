package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.College;
import com.example.demo.Repository.CollegeRepository;

@Service
public class CollegeServiceImpl implements CollegeService {
	@Autowired
	private CollegeRepository collegeRepository;

	public College createNewData(College college) {
		 
		return collegeRepository.save(college);
	}

	@Override
	public List<College> findAllData(College college) {
		 
		return collegeRepository.findAll();
	}

	@Override
	public College findCollegeName(String collegeName) {
		 
		return collegeRepository.findBycollegeName(collegeName);
	}

	@Override
	public List<College> findCollegeByEstablishmentYear(Integer collegeEstablishmentYear) {
		 
	return collegeRepository.findByCollegeEstablishmentYear(collegeEstablishmentYear);
	}

//	@Override
//	public List<College> findCollegeByDeptName(String collegeDepartment) {
//		 
//		return collegeRepository.findByCollegeDepartment(collegeDepartment);
//	}

	@Override
	public List<College> findCollegeByLocation(String collegeLocation) {
		 return collegeRepository.findByCollegeLocation(collegeLocation);
	}

	@Override
	public College updateNew(College college, String collegeName) {
		 College clg = collegeRepository.findBycollegeName(collegeName);
		if(Objects.nonNull(college.getCollegeName())) {
			clg.setCollegeName(college.getCollegeName());
		}
		if(Objects.nonNull(college.getCollegeEstablishmentYear())) {
			clg.setCollegeEstablishmentYear(college.getCollegeEstablishmentYear());
		}
		if(Objects.nonNull(college.getCollegeFee())) {
			clg.setCollegeFee(college.getCollegeFee());
		}
		if(Objects.nonNull(college.getCollegeDepartment())) {
			clg.setCollegeDepartment(college.getCollegeDepartment());
		}
		if(Objects.nonNull(college.getCollegeLocation())) {
			clg.setCollegeLocation(college.getCollegeLocation());
		}
		return collegeRepository.save(clg);
	}

	@Override
	public College updateNewData(College college, String collegeName) {
		 College college2= collegeRepository.findBycollegeName(collegeName);
		 if(Objects.nonNull(college.getCollegeName())) {
			 college2.setCollegeName(college.getCollegeName());
		 }
		 if(Objects.nonNull(college.getCollegeEstablishmentYear())) {
			 college2.setCollegeEstablishmentYear(college.getCollegeEstablishmentYear());
		 }
		 if(Objects.nonNull(college.getCollegeFee())) {
			 college2.setCollegeFee(college.getCollegeFee());
		 }
		 if(Objects.nonNull(college.getCollegeDepartment())) {
			 college2.setCollegeDepartment(college.getCollegeDepartment());
		 }
		 if(Objects.nonNull(college.getCollegeLocation())) {
			 college2.setCollegeLocation(college.getCollegeLocation());
		 }
		return collegeRepository.save(college2);
	}

	@Override
	public Double findCollegeByDeptName(String collegeDepartment) {
		Double newp=null;
		
		 List<College> Result = collegeRepository.findByCollegeDepartment(collegeDepartment);
		 for(College newres:Result) {
			newp= newres.getCollegeFee();
		 }
		return newp;
		
	}

	@Override
	public String findByDepart(String collegeDepartment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findNameByLocation(String collegeLocation) {
		 String clgName =null;
		 List<College> newLocation =collegeRepository.findByCollegeLocation(collegeLocation);
		 for(College cl : newLocation) {
			 clgName =cl.getCollegeName();
		 }
		return clgName;
	}

	@Override
	public Double findFeesByDept(String collegeDepartment) {
		Double result=null;
		List<College> colDept =collegeRepository.findByCollegeDepartment(collegeDepartment);
		for(College cl: colDept) {
			result =cl.getCollegeFee();
		} 
		return result;
	}

	@Override
	public String findClgNameByLocation(String collegeLocation) {
		 String clgName1 =null;
		 List<College> newLocation1 =collegeRepository.findByCollegeLocation(collegeLocation);
		 for(College  college : newLocation1) {
			 clgName1 = college.getCollegeName();
			 
		 }
		return clgName1;
	}

	@Override
	public List<String> findClgNameByEstablishmentYear(Integer collegeEstablishmentYear) {
		List<String> clgNameByEstablishYear =new ArrayList<>();
		 List<College> establishYear = collegeRepository.findByCollegeEstablishmentYear(collegeEstablishmentYear);
		 for(College establish : establishYear) {
			 String name=establish.getCollegeName();
			 clgNameByEstablishYear.add(name);
			 System.out.println(name);
		 }
		
		 
		return clgNameByEstablishYear;
	}

	 

	 

	


}
