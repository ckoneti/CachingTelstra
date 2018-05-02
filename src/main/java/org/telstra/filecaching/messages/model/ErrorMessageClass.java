package org.telstra.filecaching.messages.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessageClass {

	private String errorMessage;
	private int statusCode;
	
	public ErrorMessageClass(){
		
	}
	
	public ErrorMessageClass(String errorMessage, int statusCode){
		super();
		this.errorMessage= errorMessage;
		this.statusCode= statusCode;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	
}
