package com.thoughtworks.bootcamp.program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Addservice {

	private String[] homeLocation = new String[] { "0408", "0406", "0404", "0402", "0409", "0403", "0412", "0413" };
	private int homecounter = 0;

	private String[] departmentArray = new String[] { "Talent Acquisition", "People Capability", "Finance",
			"Operations", "Talent Development", "Operations Facilities", "Finance Hub", "Ops Executive Office",
			"Professional Services", "Product Management", "Corporate Investments", "Balancing our Business (BOB)",
			"Network", "People Support", "Sales GPSW/Investments", "People GPSW/Investments" };
	private int departmentCounter = 0;

	private String[] roleArray = new String[] { "EM001-200500", "EM001-200501", "EM001-200502", "EM001-200503",
			"EM001-200504", "EM001-200505", "EM001-200506", "EM001-200507", "EM001-200508", "EM001-200509",
			"EM001-200510", "EM001-200511", "EM001-200512", "EM001-200513", "EM001-200514", "EM001-200515",
			"EM001-200516", "EM001-200517", "EM001-200518", "TEC014-200100", "TEC014-200500", "TEC015-100100",
			"TEC015-100200", "TEC015-100300", "TEC015-100400", "IN001-100050", "IN001-100100", "IN001-100200" };
	private int roleCounter = 0;

	private String[] gradeArray = new String[] { "200100", "100100", "200050", "200500", "100050", "100300", "200300",
			"100400", "200400", "100200", "200200", "150000", "100250", "300300", "300400", "130000" };
	private int gradeCounter = 0;

	public int addition(Add add) {

		String path = "/Users/shreyascr/Documents/workspace-sts-3.9.9.RELEASE/addition/content.csv";
		BufferedReader br;
		String line = "";
		String csvSplit = ",";

		try {

			br = new BufferedReader(new FileReader(path));
			while ((line = br.readLine()) != null) {
				String[] country = line.split(csvSplit);
				System.out.println(country[0] + " " + country[1]);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return add.firstNumber + add.secondNumber;
	}

	public Employee printemp() {
		Employee emp = new Employee();
		HashMap<String, String> preferredName = new HashMap<String, String>();
		preferredName.put("firstName", "pFirstName 002");
		preferredName.put("lastName", "pLastName 002");
		preferredName.put("middleName", "zxcv");
		preferredName.put("fullName", "pFirstName 002 zxcv pLastName 002");
		emp.setPreferredName(preferredName);

		HashMap<String, String> legalName = new HashMap<String, String>();
		legalName.put("firstName", "lFirstName 002");
		legalName.put("lastName", "lLastName 002");
		legalName.put("middleName", "zxcv");
		legalName.put("fullname", "lFirstName 002 zxcv lLastName 002");
		emp.setLegalName(legalName);

		HashMap<String, String> homeOffice = new HashMap<String, String>();
		homeOffice.put("name", "Bangalore - Mahadevapura");
		homeOffice.put("id", getHomeLocation());
		emp.setHomeOffice(homeOffice);

		HashMap<String, String> workingOffice = new HashMap<String, String>();
		workingOffice.put("name", "Bangalore - Mahadevapura");
		workingOffice.put("id", "0413");
		emp.setWorkingOffice(workingOffice);

		HashMap<String, String> department = new HashMap<String, String>();
		department.put("name", getDepartment());
		department.put("id", "01");
		emp.setDepartment(department);

		HashMap<String, String> role = new HashMap<String, String>();
		role.put("name", "Developer");
		role.put("id", "TEC001-200400");
		emp.setRole(role);

		HashMap<String, String> grade = new HashMap<String, String>();
		grade.put("name", "Principal Consultant");
		grade.put("id", "200400");
		emp.setGrade(grade);

		return emp;
	}

	private String getDepartment() {
		if (departmentCounter == departmentArray.length) {
			departmentCounter = 0;
			return departmentArray[departmentCounter];
		}
		return departmentArray[departmentCounter];
	}

	private String getHomeLocation() {
		if (homecounter == homeLocation.length) {
			homecounter = 0;
			return homeLocation[homecounter];
		}
		return homeLocation[homecounter];
	}

	public List<Employee> getemps() {
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		int empid = 11111;

		for (int i = 0; i < 3; i++) {

			Employee emp = new Employee();
			emp.setEmployeeId(String.valueOf(empid++));
			emp.setPrimaryEmail(emp.getEmployeeId() + "@thoughtworks.com");

			HashMap<String, String> preferredName = new HashMap<String, String>();
			preferredName.put("firstName", "pFirstName" + emp.getEmployeeId());
			preferredName.put("lastName", "pLastName" + emp.getEmployeeId());
			preferredName.put("middleName", "pMiddleName" + emp.getEmployeeId());
			preferredName.put("fullName", preferredName.get("firstName") + " " + preferredName.get("middleName") + " "
					+ preferredName.get("lastName"));
			emp.setPreferredName(preferredName);

			HashMap<String, String> legalName = new HashMap<String, String>();
			legalName.put("firstName", "lFirstName" + emp.getEmployeeId());
			legalName.put("lastName", "lLastName" + emp.getEmployeeId());
			legalName.put("middleName", "lMiddleName" + emp.getEmployeeId());
			legalName.put("fullName",
					legalName.get("firstName") + " " + legalName.get("middleName") + " " + legalName.get("lastName"));
			emp.setLegalName(legalName);

			HashMap<String, String> homeOffice = new HashMap<String, String>();
			homeOffice.put("name", "Bangalore - Mahadevapura");
			homeOffice.put("id", getHomeOffice());
			emp.setHomeOffice(homeOffice);

			HashMap<String, String> workingOffice = new HashMap<String, String>();
			workingOffice.put("name", "Bangalore - Mahadevapura");
			workingOffice.put("id", "0413");
			emp.setWorkingOffice(workingOffice);

			HashMap<String, String> department = new HashMap<String, String>();
			department.put("name", getDepartments());
			department.put("id", "01");
			emp.setDepartment(department);

			HashMap<String, String> role = new HashMap<String, String>();
			role.put("name", "Developer");
			role.put("id", getRole());
			emp.setRole(role);

			HashMap<String, String> grade = new HashMap<String, String>();
			grade.put("name", "Principal Consultant");
			grade.put("id", getGrade());
			emp.setGrade(grade);
			listOfEmployee.add(emp);
		}

		return listOfEmployee;
	}

	private String getGrade() {
		if (gradeCounter == (gradeArray.length) - 1) {
			gradeCounter = 0;
			return gradeArray[gradeCounter];
		}
		return gradeArray[gradeCounter++];

	}

	private String getRole() {
		if (roleCounter == (roleArray.length) - 1) {
			roleCounter = 0;
			return roleArray[roleCounter];
		}
		return roleArray[roleCounter++];
	}

	private String getDepartments() {
		if (departmentCounter == (departmentArray.length) - 1) {
			departmentCounter = 0;
			return departmentArray[departmentCounter];
		}
		departmentCounter++;
		return departmentArray[departmentCounter];

	}

	private String getHomeOffice() {
		if (homecounter == (homeLocation.length) - 1) {
			homecounter = 0;
			return homeLocation[homecounter];
		}
		homecounter++;
		return homeLocation[homecounter];
	}

}
