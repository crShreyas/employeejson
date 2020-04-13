package com.thoughtworks.bootcamp.program;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class DocumentsData {

	
	private String Employee_ID;
	private String referenceID;
	private String documentName;
	private String documentCategory;
	private String attachmentContent;

	@JsonProperty("Employee_ID")
	public String getEmployee_ID() {
		return Employee_ID;
	}

	public void setEmployee_ID(String employee_ID) {
		Employee_ID = employee_ID;
	}

	public String getReferenceID() {
		return referenceID;
	}

	public void setReferenceID(String referenceID) {
		this.referenceID = referenceID;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentCategory() {
		return documentCategory;
	}

	public void setDocumentCategory(String documentCategory) {
		this.documentCategory = documentCategory;
	}

	public String getAttachmentContent() {
		return attachmentContent;
	}

	public void setAttachmentContent(String attachmentContent) {
		this.attachmentContent = attachmentContent;
	}


	@Override
	public String toString() {
		return "DocumentsData [Employee_ID=" + Employee_ID + ", referenceID=" + referenceID + ", documentName="
				+ documentName + ", documentCategory=" + documentCategory + ", attachmentContent=" + attachmentContent
				+ "]";
	}

}
