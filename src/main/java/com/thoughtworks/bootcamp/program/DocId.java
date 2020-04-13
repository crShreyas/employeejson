package com.thoughtworks.bootcamp.program;

import java.util.ArrayList;
import java.util.List;

public class DocId {

	private String employeeId;
	private List<String> documentIds = new ArrayList<String>();

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public List<String> getDocumentIds() {
		return documentIds;
	}

	public void setDocumentIds(List<String> documentIds) {
		this.documentIds = documentIds;
	}

}
