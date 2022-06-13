package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	private String  collegeName;
	private Integer collegeEstablishmentYear;
	private Double  collegeFee;
	private String  collegeDepartment;
	private String  collegeLocation;
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Integer getCollegeEstablishmentYear() {
		return collegeEstablishmentYear;
	}
	public void setCollegeEstablishmentYear(Integer collegeEstablishmentYear) {
		this.collegeEstablishmentYear = collegeEstablishmentYear;
	}
	public Double getCollegeFee() {
		return collegeFee;
	}
	public void setCollegeFee(Double collegeFee) {
		this.collegeFee = collegeFee;
	}
	public String getCollegeDepartment() {
		return collegeDepartment;
	}
	public void setCollegeDepartment(String collegeDepartment) {
		this.collegeDepartment = collegeDepartment;
	}
	public String getCollegeLocation() {
		return collegeLocation;
	}
	public void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", collegeEstablishmentYear=" + collegeEstablishmentYear
				+ ", collegeFee=" + collegeFee + ", collegeDepartment=" + collegeDepartment + ", collegeLocation="
				+ collegeLocation + "]";
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(String collegeName, Integer collegeEstablishmentYear, Double collegeFee, String collegeDepartment,
			String collegeLocation) {
		super();
		this.collegeName = collegeName;
		this.collegeEstablishmentYear = collegeEstablishmentYear;
		this.collegeFee = collegeFee;
		this.collegeDepartment = collegeDepartment;
		this.collegeLocation = collegeLocation;
	}
	
	
	
	
	

}
