package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.College;

public interface CollegeService {

	College createNewData(College college);

	List<College> findAllData(College college);

	College findCollegeName(String collegeName);

	List<College> findCollegeByEstablishmentYear(Integer collegeEstablishmentYear);

	Double findCollegeByDeptName(String collegeDepartment);

	List<College> findCollegeByLocation(String collegeLocation);

	College updateNew(College college, String collegeName);

	College updateNewData(College college, String collegeName);

	String findByDepart(String collegeDepartment);

	String findNameByLocation(String collegeLocation);

	Double findFeesByDept(String collegeDepartment);

	String findClgNameByLocation(String collegeLocation);

	List<String> findClgNameByEstablishmentYear(Integer collegeEstablishmentYear);

	 


	 

 


}
