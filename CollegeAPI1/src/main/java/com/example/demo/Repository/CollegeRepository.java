package com.example.demo.Repository;

 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.College;

public interface CollegeRepository extends JpaRepository<College, String> {

	public College findBycollegeName(String collegeName);
	public List<College> findByCollegeEstablishmentYear(Integer collegeEstablishmentYear);
    public List<College> findByCollegeDepartment(String  collegeDepartment);
	public List<College> findByCollegeLocation(String  collegeLocation);
	public Double findByCollegeFee(Double collegeFee);
	 

}
