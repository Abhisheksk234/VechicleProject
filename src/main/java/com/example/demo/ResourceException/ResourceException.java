package com.example.demo.ResourceException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceException extends RuntimeException 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   private String resourseName;
   private String  fieldName;
   private Object fieldValue;
public ResourceException(String resourseName, String fieldName, Object fieldValue) {
	super(resourseName+"not fount "+resourseName+"with value"+fieldValue);
	this.resourseName = resourseName;
	this.fieldName = fieldName;
	this.fieldValue = fieldValue;
}
public String getResourseName() {
	return resourseName;
}
public void setResourseName(String resourseName) {
	this.resourseName = resourseName;
}
public String getFieldName() {
	return fieldName;
}
public void setFieldName(String fieldName) {
	this.fieldName = fieldName;
}
public Object getFieldnValue() {
	return fieldValue;
}
public void setFieldnValue(Object fieldnValue) {
	this.fieldValue = fieldnValue;
}
   
   
   
	
}
