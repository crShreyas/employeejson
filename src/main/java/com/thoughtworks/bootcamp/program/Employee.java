package com.thoughtworks.bootcamp.program;

import java.time.LocalDate;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Employee {

	String employeeId;
	String primaryEmail;
	boolean isRehire = false;
	LocalDate originalHireDate = java.time.LocalDate.now();
	LocalDate hireDate = java.time.LocalDate.now();
	HashMap<String, String> preferredName = new HashMap<String, String>();
	HashMap<String, String> legalName = new HashMap<String, String>();
	HashMap<String, String> homeOffice = new HashMap<String, String>();
	HashMap<String, String> workingOffice = new HashMap<String, String>();
	HashMap<String, String> department = new HashMap<String, String>();
	HashMap<String, String> role = new HashMap<String, String>();
	HashMap<String, String> grade = new HashMap<String, String>();
	String company = "Thoughtworks";
	String status = "Active";
	String employmentType = "Employee";
	String businessUnit = "TWIND";
	String country = "IND";
	String FTE = "1.0000";
	int standardHours = 40;
	String paygroup = "India- Monthly";
	String partFullTime = "Full_Time";
	boolean isInternationalAssignee = false;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}
	
	@JsonIgnore
	public boolean isRehire() {
		return isRehire;
	}
	@JsonIgnore
	public void setRehire(boolean isRehire) {
		this.isRehire = isRehire;
	}

	public LocalDate getOriginalHireDate() {
		return originalHireDate;
	}

	public void setOriginalHireDate(LocalDate originalHireDate) {
		this.originalHireDate = originalHireDate;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public HashMap<String, String> getPreferredName() {
		return preferredName;
	}

	public void setPreferredName(HashMap<String, String> preferredName) {
		this.preferredName = preferredName;
	}

	public HashMap<String, String> getLegalName() {
		return legalName;
	}

	public void setLegalName(HashMap<String, String> legalName) {
		this.legalName = legalName;
	}

	public HashMap<String, String> getHomeOffice() {
		return homeOffice;
	}

	public void setHomeOffice(HashMap<String, String> homeOffice) {
		this.homeOffice = homeOffice;
	}

	public HashMap<String, String> getWorkingOffice() {
		return workingOffice;
	}

	public void setWorkingOffice(HashMap<String, String> workingOffice) {
		this.workingOffice = workingOffice;
	}

	public HashMap<String, String> getDepartment() {
		return department;
	}

	public void setDepartment(HashMap<String, String> department) {
		this.department = department;
	}

	public HashMap<String, String> getRole() {
		return role;
	}

	public void setRole(HashMap<String, String> role) {
		this.role = role;
	}

	public HashMap<String, String> getGrade() {
		return grade;
	}

	public void setGrade(HashMap<String, String> grade) {
		this.grade = grade;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFTE() {
		return FTE;
	}

	public void setFTE(String fTE) {
		FTE = fTE;
	}

	public int getStandardHours() {
		return standardHours;
	}

	public void setStandardHours(int standardHours) {
		this.standardHours = standardHours;
	}

	public String getPaygroup() {
		return paygroup;
	}

	public void setPaygroup(String paygroup) {
		this.paygroup = paygroup;
	}

	public String getPartFullTime() {
		return partFullTime;
	}

	public void setPartFullTime(String partFullTime) {
		this.partFullTime = partFullTime;
	}

	public boolean isInternationalAssignee() {
		return isInternationalAssignee;
	}

	public void setInternationalAssignee(boolean isInternationalAssignee) {
		this.isInternationalAssignee = isInternationalAssignee;
	}

}
